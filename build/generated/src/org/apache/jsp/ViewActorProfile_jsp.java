package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.ActorDao;

public final class ViewActorProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Actor</title>      \n");
      out.write("        \n");
      out.write("        <!-- mobile settings -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, maximum-scale=1, initial-scale=1, user-scalable=0\" />\n");
      out.write("        \n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("            var titleText = document.title;\n");
      out.write("\n");
      out.write("            function titleMarquee() {\n");
      out.write("\n");
      out.write("                titleText = titleText.substring(1, titleText.length) + titleText.substring(0, 1);\n");
      out.write("                document.title = titleText;\n");
      out.write("                setTimeout(\"titleMarquee()\", 450);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function logoutFunction() {\n");
      out.write("                var respon = confirm(\"Are you sure want to logout?\");\n");
      out.write("                if (respon == true) {\n");
      out.write("                    window.location.href = \"logout.java\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function updateFunction() {\n");
      out.write("                var respon = confirm(\"Are you sure all the informations entered are correct?\");\n");
      out.write("                if (respon == true) {\n");
      out.write("                    var password = document.getElementById(\"password\").value;\n");
      out.write("                    var confirmPassword = document.getElementById(\"confirm_password\").value;\n");
      out.write("                    if (password != confirmPassword) {\n");
      out.write("                        alert(\"Passwords do not match.\");\n");
      out.write("                        return false;\n");
      out.write("                    } else if (password == confirmPassword) {\n");
      out.write("                        return true;\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function deleteFunction() {\n");
      out.write("                var respon = confirm(\"Are you sure want to delete the actor?\");\n");
      out.write("                if (respon == true) {\n");
      out.write("                    return true;\n");
      out.write("                } else {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function cancelFunction() {\n");
      out.write("                var cancel = confirm(\"Are you sure want to go back?\");\n");
      out.write("                if (cancel == true) {\n");
      out.write("                    window.location.href = \"home.html\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"titleMarquee()\">\n");
      out.write("        <style>\t\n");
      out.write("            body {\n");
      out.write("                font-family: Arial;\n");
      out.write("            }\t\t\n");
      out.write("            header {\n");
      out.write("                height: auto;\n");
      out.write("                padding: 20px;\n");
      out.write("                background-color: lightblue;\n");
      out.write("                color: white;\n");
      out.write("            }\t\t\n");
      out.write("            a {\n");
      out.write("                color: black;\n");
      out.write("            }\t\t\n");
      out.write("            section {\n");
      out.write("                background-color: white;\n");
      out.write("                width: 80%;\n");
      out.write("                margin: auto;\n");
      out.write("                padding: 45px 20px;\n");
      out.write("            }\t\t\n");
      out.write("            footer {\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                height: auto;\n");
      out.write("                clear: both;\t\n");
      out.write("                padding: 20px;\n");
      out.write("            }\t\t\t\n");
      out.write("            ul li {\n");
      out.write("                display:inline;\n");
      out.write("                padding: 10px;\t\t\t\n");
      out.write("            }\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\t\t\t\n");
      out.write("            .two-column {\n");
      out.write("                float: left;\n");
      out.write("                width: 50%;\n");
      out.write("            }\t\n");
      out.write("            /* Clear floats after the columns */\n");
      out.write("            .row:after {\n");
      out.write("                content: \"\";\n");
      out.write("                display: table;\n");
      out.write("                clear: both;\n");
      out.write("            }\t\t\n");
      out.write("            #profile_form {\n");
      out.write("                width:50%; \n");
      out.write("                margin:auto;\n");
      out.write("            }\t\t\t\t\t\t\n");
      out.write("            fieldset {\n");
      out.write("                border-radius: 10px;\t\t\t\n");
      out.write("                padding: 30px;\n");
      out.write("                align: center;\t\t\t\t\n");
      out.write("            }\t\t\n");
      out.write("            table {\n");
      out.write("                width: 100%;\n");
      out.write("            }\t\t\t\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <!-- sini nanti retrieve data from db -->\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("        \n");
      out.write("        <header>\t\t\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"two-column\" style=\"text-align:left;\">\n");
      out.write("                    <ul>\t\t\t\t\n");
      out.write("                        <li><b>Actor Profile</b></li>\t\t\t\t\t\n");
      out.write("                    </ul>\t\t\t\t\n");
      out.write("                </div>\t\t\t\n");
      out.write("                <div class=\"two-column\" style=\"text-align:right;\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Manage</li>\n");
      out.write("                        <li><a href=\"view_job.html\">Job Listings</a></li>\n");
      out.write("                        <li><a href=\"actor_profile.html\">Actor Profile</a></li>\n");
      out.write("                        <li><a href=\"home.html\">Home</a></li>\n");
      out.write("                        <li><a href=\"javascript:logoutFunction();\">Log Out</a></li>\t\t\t\t\t\n");
      out.write("                    </ul>\t\t\t\t\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("            </div>\t\t\t\t\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!-- there will be section code where to retrieve data from db via java servlet -->\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <div class=\"table-wrapper-scroll-y my-custom-scrollbar\">\n");
      out.write("\n");
      out.write("                        <table class=\"table table-bordered table-striped mb-0\">\n");
      out.write("                            <!--<tr>\n");
      out.write("                                <th>Name</th>\n");
      out.write("                                <!--<th>Position</th>-->\n");
      out.write("                                <!--<th>Action</th>\n");
      out.write("                            </tr>-->\n");
      out.write("                            \n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\t\t\t\t\t\n");
      out.write("\n");
      out.write("            <div align=\"center\">\t\n");
      out.write("                <input onclick=\"updateFunction()\" type=\"submit\" value=\"Update\" name=\"update\" style=\"background-color: lightblue; border: 1px solid; padding: 10px 20px;\">\n");
      out.write("                <input onclick=\"deleteFunction()\" type=\"submit\" value=\"Delete\" name=\"delete\" style=\"background-color: lightblue; border: 1px solid; padding: 10px 20px;\">\t\t\t\t\t\n");
      out.write("                <input onclick=\"cancelFunction()\" type=\"button\" value=\"Back\" name=\"back\" style=\"background-color: lightblue; border: 1px solid; padding: 10px 20px;\"><br><br>\n");
      out.write("            </div>\t\t\t\t\t\n");
      out.write("        </fieldset>\t\t\t\t\n");
      out.write("    </form>\t\t\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("myDatasource");
    _jspx_th_sql_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/BloodManagement");
    _jspx_th_sql_setDataSource_0.setUser("app");
    _jspx_th_sql_setDataSource_0.setPassword("app");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("row");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <!--<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.position}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>-->\n");
          out.write("                                    <td>\n");
          out.write("                                        <form action=\"UpdateActor.jsp\" method=\"post\">\n");
          out.write("                                            <input type=\"hidden\" name=\"ID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID_USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"username\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.USERNAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"firstName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"lastName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.lastName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"email\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.EMAIL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"phoneNumber\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.phoneNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"identificationNumber\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.identificationNumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"postalCode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.postalCode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"state\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">                                          \n");
          out.write("                                            <input type=\"hidden\" name=\"area\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.area}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">                                             \n");
          out.write("                                            <input type=\"hidden\" name=\"dob\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.dob}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">                                            \n");
          out.write("                                            <input type=\"hidden\" name=\"MotherName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.MotherName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> \n");
          out.write("                                            <input type=\"hidden\" name=\"FatherName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.FatherName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\t\n");
          out.write("                                            <input type=\"hidden\" name=\"gender\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">                                            \n");
          out.write("                                            <input type=\"submit\" value=\"UPDATE\" class=\"btn btn-primary\">\n");
          out.write("                                        </form>\n");
          out.write("                                        <form action=\"ActorControl\" method=\"post\">\n");
          out.write("                                            <input type=\"hidden\" name=\"method\" value=\"delete\">\n");
          out.write("                                            <input type=\"hidden\" name=\"ID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.ID_USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"hidden\" name=\"username\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"submit\" value=\"Delete\" class=\"btn btn-warning\">\n");
          out.write("                                        </form>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
