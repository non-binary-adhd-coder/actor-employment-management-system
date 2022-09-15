<%@page import="dao.ActorDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="app"password="app"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Actor</title>

        <!-- mobile settings -->
        <meta name="viewport" content="width=device-width, maximum-scale=1, initial-scale=1, user-scalable=0" />

        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <script type="text/javascript">

            var titleText = document.title;

            function titleMarquee() {

                titleText = titleText.substring(1, titleText.length) + titleText.substring(0, 1);
                document.title = titleText;
                setTimeout("titleMarquee()", 450);
            }

        </script>

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

        <div class="row">
            <h2 align="center"><b>Update Employee's Details</b></h2>

            <form  action="ActorControl" method="post">


                <div class="col-md-6">
                    Actor ID <input type="text" name="empId" class="form-control" value="<c:out value="${emp.actorId}"/>" readonly><br>

                    Employee Name<input type="text" name="empName" class="form-control"  value="<c:out value="${emp.empName}"/>" required><br>

                    Employee Phone<input type="text" name="empPhone" class="form-control"  value="<c:out value="${emp.empPhone}"/>" required><br>

                    Employee Address<input type="text" name ="empAddress" class="form-control"  value="<c:out value="${emp.empAddress}"/>" required><br>

                    Employee Email<input type="email" name="empEmail" class="form-control"  value="<c:out value="${emp.empEmail}"/>" required><br>
                </div>

                <div class="col-md-6">

                    Employee Birth Date<input type="date" name="empBirthDate" class="form-control"  value = "<c:out value="${emp.empBirthDate}"/>" required><br>

                    Employee Gender<input type="text" name="empGender" class="form-control"  value="<c:out value="${emp.empGender}"/>" required><br>

                    Employee Salary<input type="number" name="empSalary" class="form-control"  value="<c:out value="${emp.empSalary}"/>" required><br>

                    <input type="button" value="Back" onclick="history.back()" class="btn btn-primary">

                    <input type="submit" name="Submit" value="Update" class="btn btn-primary">
                    <br>			 
                    </form><!-- /LOGIN -->
                </div>
                </html>
