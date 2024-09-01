package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Inicio de Sesión</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\r\n");
      out.write("    <link href=\"/ProyectoNaturales/Vistas/CSS/login.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"Contaminacion.jsp\">\r\n");
      out.write("            <img src=\"imagenes/iconoHoja.png\" alt=\"Logo\" class=\"d-inline-block align-middle mr-2\">\r\n");
      out.write("            Foro Contaminación\r\n");
      out.write("        </a>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"Contaminacion.jsp\">\r\n");
      out.write("                        <i class=\"fa fa-arrow-left\"></i> Regresar\r\n");
      out.write("                    </a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container d-flex justify-content-center align-items-center\" style=\"min-height: calc(100vh - 56px);\">\r\n");
      out.write("        <div class=\"form-box\">\r\n");
      out.write("            <h2>Iniciar Sesión</h2>\r\n");
      out.write("            <form method=\"POST\" action=\"/ProyectoNaturales/Cvalidar?accion=ingresar\">\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"form-control-icon\">\r\n");
      out.write("                        <i class=\"fas fa-envelope\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"email\" name=\"email\"  id=\"email\" class=\"form-control\" placeholder=\"Correo Electrónico\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"form-control-icon\">\r\n");
      out.write("                        <i class=\"fas fa-lock\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\" placeholder=\"Contraseña\" required>\r\n");
      out.write("                </div>\r\n");
      out.write("                <button type=\"submit\" name=\"accion\" value=\"ingresar\" class=\"btn btn-success btn-block\">Acceder</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a href=\"#\" class=\"form-link\">Olvidé la contraseña</a>\r\n");
      out.write("            <br>\r\n");
      out.write("            <a href=\"registro.jsp\" class=\"form-link\">No tengo cuenta, crear una</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body> \r\n");
      out.write("</html>\r\n");
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
