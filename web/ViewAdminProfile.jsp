<%@page import="dao.AdminDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="app"password="app"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Actor</title>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <script type="text/javascript">

            var titleText = document.title;

            function titleMarquee() {

                titleText = titleText.substring(1, titleText.length) + titleText.substring(0, 1);
                document.title = titleText;
                setTimeout("titleMarquee()", 450);
            }

            function logoutFunction() {
                var respon = confirm("Are you sure want to logout?");
                if (respon == true) {
                    window.location.href = "logout.java";
                }
            }

            function updateFunction() {
                var respon = confirm("Are you sure all the informations entered are correct?");
                if (respon == true) {
                    var password = document.getElementById("password").value;
                    var confirmPassword = document.getElementById("confirm_password").value;
                    if (password != confirmPassword) {
                        alert("Passwords do not match.");
                        return false;
                    } else if (password == confirmPassword) {
                        return true;
                    }
                } else {
                    return false;
                }
            }

            function deleteFunction() {
                var respon = confirm("Are you sure want to delete the actor?");
                if (respon == true) {
                    return true;
                } else {
                    return false;
                }
            }

            function cancelFunction() {
                var cancel = confirm("Are you sure want to go back?");
                if (cancel == true) {
                    window.location.href = "home.html";
                }
            }
        </script>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body onload="titleMarquee()">
        <style>	
            body {
                font-family: Arial;
            }		
            header {
                height: auto;
                padding: 20px;
                background-color: lightblue;
                color: white;
            }		
            a {
                color: black;
            }		
            section {
                background-color: white;
                width: 80%;
                margin: auto;
                padding: 45px 20px;
            }		
            footer {
                background-color: black;
                color: white;
                text-align: center;
                height: auto;
                clear: both;	
                padding: 20px;
            }			
            ul li {
                display:inline;
                padding: 10px;			
            }
            * {
                box-sizing: border-box;
            }			
            .two-column {
                float: left;
                width: 50%;
            }	
            /* Clear floats after the columns */
            .row:after {
                content: "";
                display: table;
                clear: both;
            }		
            #profile_form {
                width:50%; 
                margin:auto;
            }						
            fieldset {
                border-radius: 10px;			
                padding: 30px;
                align: center;				
            }		
            table {
                width: 100%;
            }			
        </style>

        <!-- sini nanti retrieve data from db -->
        <%
            AdminDao dao = new AdminDao();
        %>
        <header>		
            <div class="row">
                <div class="two-column" style="text-align:left;">
                    <ul>				
                        <li><b>Admin Profile</b></li>					
                    </ul>				
                </div>			
                <div class="two-column" style="text-align:right;">
                    <ul>
                        <li>Manage</li>
                        <li><a href="view_job.html">Job Listings</a></li>
                        <li><a href="admin_profile.html">Admin Profile</a></li>
                        <li><a href="home.html">Home</a></li>
                        <li><a href="javascript:logoutFunction();">Log Out</a></li>					
                    </ul>								
                </div>
            </div>				
        </header>

        <!-- there will be section code where to retrieve data from db via java servlet -->
        <div class="container" >
            <div class="card">
                <div class="card-body">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar">

                        <table class="table table-bordered table-striped mb-0">
                            <!--<tr>
                                <th>Name</th>
                                <!--<th>Position</th>-->
                                <!--<th>Action</th>
                            </tr>-->
                            
                            <c:forEach var = "row" items = "${result.rows}">
                                <tr>
                                    <td>${row.username}</td>
                                    <!--<td>${row.position}</td>-->
                                    <td>
                                        <form action="UpdateAdmin.jsp" method="post">
                                            <input type="hidden" name="ID" value="${row.ID_USER}">
                                            <input type="hidden" name="username" value="${row.USERNAME}">
                                            <input type="hidden" name="firstName" value="${row.firstName}">
                                            <input type="hidden" name="lastName" value="${row.lastName}">
                                            <input type="hidden" name="email" value="${row.EMAIL}">
                                            <input type="hidden" name="phoneNumber" value="${row.phoneNumber}">
                                            <input type="hidden" name="identificationNumber" value="${row.identificationNumber}">
                                            <input type="hidden" name="postalCode" value="${row.postalCode}">
                                            <input type="hidden" name="state" value="${row.state}">                                          
                                            <input type="hidden" name="area" value="${row.area}">                                             
                                            <input type="hidden" name="dob" value="${row.dob}">                                            
                                            <input type="hidden" name="MotherName" value="${row.MotherName}"> 
                                            <input type="hidden" name="FatherName" value="${row.FatherName}">	
                                            <input type="hidden" name="gender" value="${row.gender}">                                            
                                            <input type="submit" value="UPDATE" class="btn btn-primary">
                                        </form>
                                        <form action="AdminControl" method="post">
                                            <input type="hidden" name="method" value="delete">
                                            <input type="hidden" name="ID" value="${row.ID_USER}">
                                            <input type="hidden" name="username" value="${row.username}">
                                            <input type="submit" value="Delete" class="btn btn-warning">
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>					

            <div align="center">	
                <input onclick="updateFunction()" type="submit" value="Update" name="update" style="background-color: lightblue; border: 1px solid; padding: 10px 20px;">
                <input onclick="deleteFunction()" type="submit" value="Delete" name="delete" style="background-color: lightblue; border: 1px solid; padding: 10px 20px;">					
                <input onclick="cancelFunction()" type="button" value="Back" name="back" style="background-color: lightblue; border: 1px solid; padding: 10px 20px;"><br><br>
            </div>					
        </fieldset>				
    </form>		

</body>
</html>
