<%-- 
    Document   : Contaminacion-Luminica
    Created on : 13/08/2024, 04:14:18 PM
    Author     : Maiyer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Contaminación de Suelos</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
        <link href="CSS/Contaminacion.css" rel="stylesheet" type="text/css"/>
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
                    <!-- Verifica si el usuario ha iniciado sesión -->
                    <c:choose>
                        <!-- Si el usuario está autenticado -->
                        <c:when test="${not empty sessionScope.user}">
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
                        </c:when>

                        <!-- Si el usuario NO está autenticado -->
                        <c:otherwise>
                            <li class="nav-item">
                                <a href="login.jsp" class="btn btn-outline-light rounded-pill mx-1">Iniciar Sesión</a>
                            </li>
                            <li class="nav-item">
                                <a href="register.jsp" class="btn btn-outline-light rounded-pill mx-1">Registrarse</a>
                            </li>
                        </c:otherwise>
                    </c:choose>
                </ul>
            </div>
        </nav>


        <div class="container mt-4">
            <h1>Contaminación de Suelos</h1>
            <p>La contaminación del suelo es causada por la presencia de productos químicos o alteraciones en el entorno natural del suelo, que pueden provocar efectos negativos en el ecosistema y la salud humana.</p>
            <img src="https://via.placeholder.com/800x300" class="img-fluid" alt="Contaminación de suelos">
        </div>

        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </body>
</html>
