<%-- 
    Document   : login
    Created on : 13/08/2024, 04:31:08 PM
    Author     : Maiyer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link href="CSS/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="Contaminacion.jsp">
            <img src="imagenes/iconoHoja.png" alt="Logo" class="d-inline-block align-middle mr-2">
            Foro Contaminación
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="Contaminacion.jsp">
                        <i class="fa fa-arrow-left"></i> Regresar
                    </a>
                </li>
            </ul>
        </div>
    </nav>

    <div class="container d-flex justify-content-center align-items-center" style="min-height: calc(100vh - 56px);">
        <div class="form-box">
            <h2>Iniciar Sesión</h2>
            <form method="POST" action="/ProyectoNaturales/Cvalidar?accion=ingresar">
                <div class="form-group">
                    <div class="form-control-icon">
                        <i class="fas fa-envelope"></i>
                    </div>
                    <input type="email" name="email"  id="email" class="form-control" placeholder="Correo Electrónico" required>
                </div>
                <div class="form-group">
                    <div class="form-control-icon">
                        <i class="fas fa-lock"></i>
                    </div>
                    <input type="password" name="password" id="password" class="form-control" placeholder="Contraseña" required>
                </div>
                <button type="submit" name="accion" value="ingresar" class="btn btn-success btn-block">Acceder</button>
            </form>
            <br>
            <br>
            <a href="#" class="form-link">Olvidé la contraseña</a>
            <br>
            <a href="registro.jsp" class="form-link">No tengo cuenta, crear una</a>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.7/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body> 
</html>
