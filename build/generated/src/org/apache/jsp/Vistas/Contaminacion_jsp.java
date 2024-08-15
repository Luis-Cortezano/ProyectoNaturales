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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"CSS/Contaminacion.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"Contaminacion.html\">\n");
      out.write("            <img src=\"imagenes/iconoHoja.png\" alt=\"Logo\" class=\"d-inline-block align-middle mr-2\">\n");
      out.write("            Foro Contaminación\n");
      out.write("        </a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"login.html\">\n");
      out.write("                        <i class=\"fas fa-sign-in-alt\"></i> Iniciar Sesión\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"registro.html\">\n");
      out.write("                        <i class=\"fas fa-user-plus\"></i> Regístrate\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container intro\">\n");
      out.write("        <h1>La Contaminación Ambiental</h1>\n");
      out.write("        <p>La contaminación ambiental es un fenómeno complejo que afecta a la salud del planeta y de sus habitantes. Se define como la presencia de sustancias nocivas en el medio ambiente, que pueden ser perjudiciales para los seres vivos y el equilibrio de los ecosistemas. Este texto explora las causas, tipos y consecuencias de la contaminación, así como su impacto en la salud pública y el medio ambiente.</p>\n");
      out.write("        <img src=\"imagenes/contaminacion.jpg\" class=\"img-fluid\" alt=\"Imagen de contaminación\">\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container texto\">\n");
      out.write("        <br>\n");
      out.write("        <p>La contaminación ambiental es un problema multifacético que requiere atención inmediata y acción coordinada a nivel local, nacional e internacional. La comprensión de sus causas y consecuencias es fundamental para desarrollar políticas efectivas que mitiguen su impacto y promuevan un entorno más saludable para las generaciones futuras. La colaboración entre gobiernos, industrias y ciudadanos es esencial para abordar esta crisis global y proteger nuestro planeta.</p>\n");
      out.write("        <h1>Otras Tipos de Contaminacion son</h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container mt-4 text-center\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\n");
      out.write("                <button class=\"btn btn-secondary btn-contaminacion\" onclick=\"window.location.href='contaminacion-suelos.html'\">\n");
      out.write("                    <i class=\"fas fa-tractor\"></i><br>Suelos\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\n");
      out.write("                <button class=\"btn btn-primary btn-contaminacion\" onclick=\"window.location.href='contaminacion-agua.html'\">\n");
      out.write("                    <i class=\"fas fa-water\"></i><br>Agua\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\n");
      out.write("                <button class=\"btn btn-success btn-contaminacion\" onclick=\"window.location.href='contaminacion-aire.html'\">\n");
      out.write("                    <i class=\"fas fa-smog\"></i><br>Aire\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\n");
      out.write("                <button class=\"btn btn-danger btn-contaminacion\" onclick=\"window.location.href='contaminacion-sonora.html'\">\n");
      out.write("                    <i class=\"fas fa-volume-up\"></i><br>Sonora\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\n");
      out.write("                <button class=\"btn btn-warning btn-contaminacion\" onclick=\"window.location.href='contaminacion-luminica.html'\">\n");
      out.write("                    <i class=\"fas fa-lightbulb\"></i><br>Lumínica\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 mb-3 d-flex justify-content-center\">\n");
      out.write("                <button class=\"btn btn-info btn-contaminacion\" onclick=\"window.location.href='contaminacion-radioactiva.html'\">\n");
      out.write("                    <i class=\"fas fa-radiation\"></i><br>Radioactiva\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <!-- Sección de Comentarios -->\n");
      out.write("    <div class=\"container mt-4\">\n");
      out.write("        <h2>Comentarios</h2>\n");
      out.write("        <div id=\"commentSection\">\n");
      out.write("            <!-- Aquí se mostrarían los comentarios existentes -->\n");
      out.write("            <div class=\"comment\">\n");
      out.write("                <p><strong>Usuario1:</strong> Este es un comentario sobre la contaminación.</p>\n");
      out.write("            </div>\n");
      out.write("            <!-- Más comentarios... -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Formulario para agregar comentarios -->\n");
      out.write("        <div id=\"commentForm\" class=\"mt-3\">\n");
      out.write("            <h3>Deja un comentario</h3>\n");
      out.write("            <!-- Asegúrate de tener un backend que maneje la autenticación -->\n");
      out.write("            <!-- Aquí simplemente mostramos el formulario si el usuario está autenticado -->\n");
      out.write("            <textarea class=\"form-control\" placeholder=\"Escribe tu comentario aquí...\" rows=\"3\"></textarea>\n");
      out.write("            <button class=\"btn btn-primary mt-2\">Enviar</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Scripts de Bootstrap -->\n");
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
