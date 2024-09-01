package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contaminacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"CSS/Contaminacion.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"Contaminacion.html\">\r\n");
      out.write("                <img src=\"imagenes/iconoHoja.png\" alt=\"Logo\" class=\"d-inline-block align-middle mr-2\">\r\n");
      out.write("                Foro Contaminación\r\n");
      out.write("            </a>\r\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\r\n");
      out.write("                <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    <li class=\"nav-item dropdown\">\r\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                            <i class=\"fas fa-user-circle\" style=\"font-size: 1.5em;\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                            <a class=\"dropdown-item\" href=\"configuraciones.html\">Configuración de la cuenta</a>\r\n");
      out.write("                            <form action=\"logout\" method=\"POST\" class=\"dropdown-item\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-link p-0 m-0\" style=\"color: inherit; text-decoration: none;\">Cerrar Sesión</button>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container intro\">\r\n");
      out.write("            <h1>La Contaminación Ambiental</h1>\r\n");
      out.write("            <p>La contaminación ambiental es un fenómeno complejo que afecta a la salud del planeta y de sus habitantes. Se define como la presencia de sustancias nocivas en el medio ambiente, que pueden ser perjudiciales para los seres vivos y el equilibrio de los ecosistemas. Este texto explora las causas, tipos y consecuencias de la contaminación, así como su impacto en la salud pública y el medio ambiente.</p>\r\n");
      out.write("            <img src=\"imagenes/contaminacion.jpg\" class=\"img-fluid\" alt=\"Imagen de contaminación\">\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container texto\">\r\n");
      out.write("            <br>\r\n");
      out.write("            <p>La contaminación ambiental es un problema multifacético que requiere atención inmediata y acción coordinada a nivel local, nacional e internacional. La comprensión de sus causas y consecuencias es fundamental para desarrollar políticas efectivas que mitiguen su impacto y promuevan un entorno más saludable para las generaciones futuras. La colaboración entre gobiernos, industrias y ciudadanos es esencial para abordar esta crisis global y proteger nuestro planeta.</p>\r\n");
      out.write("            <h1>Otras Tipos de Contaminacion son</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container mt-4 text-center\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\r\n");
      out.write("                    <button class=\"btn btn-secondary btn-contaminacion\" onclick=\"window.location.href = 'contaminacion-suelos.html'\">\r\n");
      out.write("                        <i class=\"fas fa-tractor\"></i><br>Suelos\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\r\n");
      out.write("                    <button class=\"btn btn-primary btn-contaminacion\" onclick=\"window.location.href = 'contaminacion-agua.html'\">\r\n");
      out.write("                        <i class=\"fas fa-water\"></i><br>Agua\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\r\n");
      out.write("                    <button class=\"btn btn-success btn-contaminacion\" onclick=\"window.location.href = 'contaminacion-aire.html'\">\r\n");
      out.write("                        <i class=\"fas fa-smog\"></i><br>Aire\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\r\n");
      out.write("                    <button class=\"btn btn-danger btn-contaminacion\" onclick=\"window.location.href = 'contaminacion-sonora.html'\">\r\n");
      out.write("                        <i class=\"fas fa-volume-up\"></i><br>Sonora\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\r\n");
      out.write("                    <button class=\"btn btn-warning btn-contaminacion\" onclick=\"window.location.href = 'contaminacion-luminica.html'\">\r\n");
      out.write("                        <i class=\"fas fa-lightbulb\"></i><br>Lumínica\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\r\n");
      out.write("                    <button class=\"btn btn-info btn-contaminacion\" onclick=\"window.location.href = 'contaminacion-radioactiva.html'\">\r\n");
      out.write("                        <i class=\"fas fa-radiation\"></i><br>Radioactiva\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Sección de Comentarios -->\r\n");
      out.write("        <div class=\"container mt-4\">\r\n");
      out.write("            <h2>Comentarios</h2>\r\n");
      out.write("            <div id=\"commentSection\">\r\n");
      out.write("                <!-- Aquí se mostrarían los comentarios existentes -->\r\n");
      out.write("                <div class=\"comment\">\r\n");
      out.write("                    <p><strong>Usuario1:</strong> Este es un comentario sobre la contaminación.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Más comentarios... -->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Formulario para agregar comentarios -->\r\n");
      out.write("            <div id=\"commentForm\" class=\"mt-3\">\r\n");
      out.write("                <h3>Deja un comentario</h3>\r\n");
      out.write("                <!-- Asegúrate de tener un backend que maneje la autenticación -->\r\n");
      out.write("                <!-- Aquí simplemente mostramos el formulario si el usuario está autenticado -->\r\n");
      out.write("                <textarea class=\"form-control\" placeholder=\"Escribe tu comentario aquí...\" rows=\"3\"></textarea>\r\n");
      out.write("                <button class=\"btn btn-primary mt-2\">Enviar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Scripts de Bootstrap -->\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
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
