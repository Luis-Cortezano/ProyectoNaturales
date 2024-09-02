<%-- 
    Document   : Contaminacion
    Created on : 13/08/2024, 01:58:18 PM
    Author     : Maiyer
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet">
        <link href="/ProyectoNaturales/Vistas/CSS/Contaminacion.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="Contaminacion.html">
                <img src="imagenes/iconoHoja.png" alt="Logo" class="d-inline-block align-middle mr-2">
                Foro Contaminación
            </a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-user-circle" style="font-size: 1.5em;"></i>
                        </a>
                        <div class="dropdown-menu dropdown-menu-right" aria-labelledby="userDropdown">
                            <a class="dropdown-item" href="configuraciones.html">Configuración de la cuenta</a>
                            <form method="POST" action="/ProyectoNaturales/Cvalidar">
                                <input type="hidden" name="accion" value="exit">
                                <button type="submit" class="dropdown-item">Cerrar Sesión</button>
                            </form>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container intro">
            <h1>La Contaminación Ambiental</h1>
            <p>La contaminación ambiental es un fenómeno complejo que afecta a la salud del planeta y de sus habitantes. Se define como la presencia de sustancias nocivas en el medio ambiente, que pueden ser perjudiciales para los seres vivos y el equilibrio de los ecosistemas. Este texto explora las causas, tipos y consecuencias de la contaminación, así como su impacto en la salud pública y el medio ambiente.</p>
            <img src="imagenes/contaminacion.jpg" class="img-fluid" alt="Imagen de contaminación">
        </div>

        <div class="container texto">
            <br>
            <p>La contaminación ambiental es un problema multifacético que requiere atención inmediata y acción coordinada a nivel local, nacional e internacional. La comprensión de sus causas y consecuencias es fundamental para desarrollar políticas efectivas que mitiguen su impacto y promuevan un entorno más saludable para las generaciones futuras. La colaboración entre gobiernos, industrias y ciudadanos es esencial para abordar esta crisis global y proteger nuestro planeta.</p>
            <h1>Otras Tipos de Contaminacion son</h1>
        </div>

        <div class="container mt-4 text-center">
            <div class="row">
                <div class="col-md-4 mb-3 d-flex justify-content-center">
                    <button class="btn btn-secondary btn-contaminacion" onclick="window.location.href = 'contaminacion-suelos.html'">
                        <i class="fas fa-tractor"></i><br>Suelos
                    </button>
                </div>
                <div class="col-md-4 mb-3 d-flex justify-content-center">
                    <button class="btn btn-primary btn-contaminacion" onclick="window.location.href = 'contaminacion-agua.html'">
                        <i class="fas fa-water"></i><br>Agua
                    </button>
                </div>
                <div class="col-md-4 mb-3 d-flex justify-content-center">
                    <button class="btn btn-success btn-contaminacion" onclick="window.location.href = 'contaminacion-aire.html'">
                        <i class="fas fa-smog"></i><br>Aire
                    </button>
                </div>
                <div class="col-md-4 mb-3 d-flex justify-content-center">
                    <button class="btn btn-danger btn-contaminacion" onclick="window.location.href = 'contaminacion-sonora.html'">
                        <i class="fas fa-volume-up"></i><br>Sonora
                    </button>
                </div>
                <div class="col-md-4 mb-3 d-flex justify-content-center">
                    <button class="btn btn-warning btn-contaminacion" onclick="window.location.href = 'contaminacion-luminica.html'">
                        <i class="fas fa-lightbulb"></i><br>Lumínica
                    </button>
                </div>
                <div class="col-md-4 mb-3 d-flex justify-content-center">
                    <button class="btn btn-info btn-contaminacion" onclick="window.location.href = 'contaminacion-radioactiva.html'">
                        <i class="fas fa-radiation"></i><br>Radioactiva
                    </button>
                </div>
            </div>
        </div>

        <!-- Sección de Comentarios -->
        <div class="container mt-4">
            <h2>Comentarios</h2>
            <div id="commentSection">
                <!-- Aquí se mostrarían los comentarios existentes -->
                <c:forEach var="c" items="${comentarios}" varStatus="status">
                    <c:set var="user" value="${users[status.index]}"/>
                    <div class="comment">
                        <p><strong>${user.getUsuario()}:</strong> ${c.getComentario()}</p>
                    </div>
                </c:forEach>
            </div>

            <!-- Formulario para agregar comentarios -->
            <div id="commentForm" class="mt-3">
                <h3>Deja un comentario</h3>
                <!-- Asegúrate de tener un backend que maneje la autenticación -->
                <!-- Aquí simplemente mostramos el formulario si el usuario está autenticado -->
                <textarea class="form-control" placeholder="Escribe tu comentario aquí..." rows="3"></textarea>
                <button class="btn btn-primary mt-2">Enviar</button>
            </div>
        </div>

        <!-- Scripts de Bootstrap -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
