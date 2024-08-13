package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Regístrate - Foro sobre Contaminación</title>\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\n");
      out.write("    <link href=\"CSS/registro.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"Contaminacion.jsp\">\n");
      out.write("            <img src=\"imagenes/iconoHoja.png\" alt=\"Logo\" class=\"d-inline-block align-middle mr-2\">\n");
      out.write("            Foro Contaminación\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Contaminacion.jsp\">\n");
      out.write("                        <i class=\"fa fa-arrow-left\"></i> Regresar\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"form-box\">\n");
      out.write("        <h2>Regístrate</h2>\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group position-relative\">\n");
      out.write("                <i class=\"fas fa-user form-control-icon\"></i>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"Nombre de Usuario\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group position-relative\">\n");
      out.write("                <i class=\"fas fa-envelope form-control-icon\"></i>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Correo Electrónico\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group position-relative\">\n");
      out.write("                <i class=\"fas fa-lock form-control-icon\"></i>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"Contraseña\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group position-relative\">\n");
      out.write("                <i class=\"fas fa-lock form-control-icon\"></i>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"confirmPassword\" placeholder=\"Confirmar Contraseña\" required>\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Crear Cuenta</button>\n");
      out.write("            <a href=\"login.jsp\" class=\"form-link\">Ya tengo cuenta, iniciar sesión</a>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
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
}
