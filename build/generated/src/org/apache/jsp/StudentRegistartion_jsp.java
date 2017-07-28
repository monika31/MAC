package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StudentRegistartion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> ADMIN STUDENT Registration Page</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            function reg() {\n");
      out.write("                var name1 = document.register.StudentFirstName.value;\n");
      out.write("                var name2 = document.register.StudentMiddleName.value;\n");
      out.write("                var name3 = document.register.StudentLastName.value;\n");
      out.write("                var email1 = document.register.Email_id.value;\n");
      out.write("                var phone = document.register.Telephone.value;\n");
      out.write("                var gender = document.register.Gender.value;\n");
      out.write("                var Status = document.register.Status.value;\n");
      out.write("                var current_past = document.register.Current_past.value;\n");
      out.write("                if (name1 === null || name1 === \"\") {\n");
      out.write("                    alert(\"Please enter the First Name\");\n");
      out.write("                    return false;\n");
      out.write("\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                else if (name2 === null || name2 === \"\") {\n");
      out.write("                    alert(\"Please enter the Middle Name\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (name3=== null || name3 === \"\"){\n");
      out.write("                    alert(\"Please enter the Last Name\")\n");
      out.write("                }\n");
      out.write("                else if (email1 === null || email1 === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter the Email\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (!filter.test(email1))\n");
      out.write("                {\n");
      out.write("                    alert(\"Please Enter the valid email\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (password1 === null || password1 === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Enter the password\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (password1.length < 6)\n");
      out.write("                {\n");
      out.write("                    alert(\"Your Password must contain 6 digits\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (phone === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter the valid mobile number\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (isNaN(phone))\n");
      out.write("                {\n");
      out.write("                    alert(\"The phone number contains illegal characters\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (phone.length < 10 || phone.length > 10)\n");
      out.write("                {\n");
      out.write("                    alert(\"Your Telephone Number must contain 10 digits \");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (gender === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please select the gender\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (Status=== \"select\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please select the status of the student\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (current_past === \"\")\n");
      out.write("                {\n");
      out.write("                    alert(\"Please select the current_past\");\n");
      out.write("\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script> \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"registration\">\n");
      out.write("\n");
      out.write("            <div class=\"home_header\">\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"studentregis\">\n");
      out.write("                 REGISTRATION NOW\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logo\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"registration_fields\">\n");
      out.write("\n");
      out.write("                <form name=\"register\" action=\"userRegister\"  method=\"post\" onsubmit=\"return reg()\" ><br>\n");
      out.write("                    Student ID:<br> <input type=\"number\" name=\"StudentID\" class=\"regis_text\"><br><br>\n");
      out.write("                    First Name:<br>  <input type=\"text\" name=\"FirstName\" class=\"regis_text\"><br><br>\n");
      out.write("                    Middle Name:<br> <input  type=\"text\" name=\"MiddleName\" class=\"regis_text\"><br><br>\n");
      out.write("                    Last Name:<br>  <input type=\"text\" name=\"LastName\" class=\"regis_text\"><br><br>\n");
      out.write("                    Email_id: <br>  <input type=\"text\" name=\"Email_id\" class=\"regis_text\"><br><br>\n");
      out.write("                    TelePhone:    <br>  <input type=\"text\" name=\"TelePhone\" class=\"regis_text\"><br><br>\n");
      out.write("                    Gender:  <input type=\"radio\" name=\"sex\" value=\"male\">\n");
      out.write("                    Male :<input type=\"radio\" name=\"sex\" value=\"female\">Female <br><br>\n");
      out.write("                    Status:<select  name=\"Status\" class=\"status\" >\n");
      out.write("                        <option value=\"International\">International</option>\n");
      out.write("                        <option value=\"Permanent\">Permanent</option>\n");
      out.write("                        <option value=\"Citizen\">Citizen</option>\n");
      out.write("                    </select><br><br>\n");
      out.write("                    \n");
      out.write("                    Current_past: <input type=\"radio\" name=\"Current_past\" value=\"Current Student\">Current Student\n");
      out.write("                    <input type=\"radio\" name=\"Current_Past\" value=\"Past Student\"> Past Student<br><br>\n");
      out.write("                   \n");
      out.write("                    <input  type=\"submit\" value=\"register\" class=\"button_register\" />\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    </body>\n");
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
}
