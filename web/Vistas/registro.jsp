<%-- 
    Document   : registro
    Created on : 13/08/2024, 04:42:05 PM
    Author     : Maiyer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Regístrate - Foro sobre Contaminación</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link href="/ProyectoNaturales/Vistas/CSS/registro.css" rel="stylesheet" type="text/css"/>


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

    <div class="form-box">
        <h2>Regístrate</h2>
        <form method="GET" action="/ProyectoNaturales/CtrUsuario?accion=registrarse">
            <div class="form-group position-relative">
                <i class="fas fa-user form-control-icon"></i>
                <input type="text" class="form-control" id="usuario" name="usuario" placeholder="Nombre de Usuario" required>
            </div>
            <div class="form-group position-relative">
                <i class="fas fa-envelope form-control-icon"></i>
                <input type="email" class="form-control" id="correo" name="correo" placeholder="Correo Electrónico" required>
            </div>
            <div class="form-group position-relative">
                <i class="fas fa-lock form-control-icon"></i>
                <input type="password" class="form-control" id="password" name="password" placeholder="Contraseña" required>
            </div>
            <div class="form-group position-relative">
                <i class="fas fa-lock form-control-icon"></i>
                <input type="password" class="form-control" id="confirmPassword" placeholder="Confirmar Contraseña" required>
            </div>
            <button type="submit" name="accion" value="registrarse" class="btn btn-success">Crear Cuenta</button>
            <a href="login.jsp" class="form-link">Ya tengo cuenta, iniciar sesión</a>
        </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
