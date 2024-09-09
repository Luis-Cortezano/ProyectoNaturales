<%-- 
    Document   : Contaminacion-Agua
    Created on : 13/08/2024, 04:11:10 PM
    Author     : Maiyer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contaminación del Agua</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css">
    <link href="CSS/Contaminacion.css" rel="stylesheet" type="text/css"/>
    <style>
        footer {
            width: 100%;
            background-color: #343a40;
            color: white;
            text-align: center;
            padding: 20px 0;
            position: relative;
            bottom: 0;
        }
        .img-center {
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
        .container {
            margin-top: 20px;
        }
    </style>
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

    <div class="container mt-4">
        <h1 class="text-center">Contaminación del Agua</h1>
        <p>La contaminación del agua se refiere a la presencia de sustancias nocivas en cuerpos de agua como ríos, lagos y océanos. Estas sustancias pueden provenir de diversas fuentes, incluyendo desechos industriales, aguas residuales domésticas, y productos químicos agrícolas. La contaminación del agua no solo afecta la calidad del agua, sino que también tiene graves repercusiones para la salud humana y los ecosistemas acuáticos.</p>

        <p>Uno de los efectos más devastadores de la contaminación del agua es la destrucción de los hábitats acuáticos. Los contaminantes pueden matar a los peces y otras formas de vida acuática, alterar las cadenas alimentarias y destruir los ecosistemas que dependen de agua limpia. Además, la presencia de contaminantes en el agua puede hacer que esta sea peligrosa para el consumo humano, conduciendo a problemas de salud como enfermedades gastrointestinales, infecciones y otros trastornos graves.</p>

        <p>Además de los impactos en la vida acuática y la salud humana, la contaminación del agua también puede tener consecuencias económicas. Los costos de tratamiento del agua contaminada y las pérdidas en la pesca y el turismo pueden ser significativos. La contaminación del agua puede reducir la disponibilidad de agua potable y afectar la calidad de los recursos hídricos utilizados para la agricultura, la industria y el consumo doméstico.</p>

        <h2 class="mt-4">Causas de la Contaminación del Agua</h2>
        <p>Las principales causas de la contaminación del agua incluyen:</p>
        <ul>
            <li><strong>Desechos Industriales:</strong> Vertido de productos químicos y residuos industriales en cuerpos de agua.</li>
            <li><strong>Aguas Residuales Domésticas:</strong> Liberación de aguas residuales no tratadas o mal tratadas.</li>
            <li><strong>Uso de Productos Químicos:</strong> Aplicación de pesticidas y fertilizantes que contaminan las aguas subterráneas y superficiales.</li>
        </ul>

        <h2 class="mt-4">Consecuencias de la Contaminación del Agua</h2>
        <p>Las consecuencias de la contaminación del agua son variadas y graves:</p>
        <ul>
            <li><strong>Daño a la Vida Acuática:</strong> Muerte de peces y otros organismos acuáticos, y destrucción de hábitats.</li>
            <li><strong>Impacto en la Salud Humana:</strong> Riesgo de enfermedades transmitidas por el agua, como cólera y hepatitis.</li>
            <li><strong>Problemas Económicos:</strong> Aumento de costos para el tratamiento del agua y pérdidas en sectores económicos como la pesca y el turismo.</li>
        </ul>

        <h2 class="mt-4">Cómo Reducir la Contaminación del Agua</h2>
        <p>Para reducir la contaminación del agua, se pueden implementar diversas medidas:</p>
        <ul>
            <li><strong>Tratamiento de Aguas Residuales:</strong> Mejorar el tratamiento de aguas residuales antes de su liberación en cuerpos de agua.</li>
            <li><strong>Regulación de Desechos Industriales:</strong> Establecer y hacer cumplir regulaciones para la gestión segura de desechos industriales.</li>
            <li><strong>Uso Responsable de Productos Químicos:</strong> Reducir el uso de pesticidas y fertilizantes y adoptar prácticas agrícolas sostenibles.</li>
        </ul>

        <h2 class="mt-4">Ejemplo de Contaminación del Agua</h2>
        <p>Un ejemplo relevante es el <strong>accidente en el río Han</strong> en Corea del Sur, donde un derrame químico causó graves problemas de contaminación. La respuesta incluyó esfuerzos para limpiar el río y medidas para prevenir futuros incidentes.</p>

        <img src="imagenes/agua.jpg" class="img-fluid img-center" alt="Contaminación del agua en un río">
    </div>

    <footer>
        <p>&copy; 2024 Foro Contaminación. Todos los derechos reservados.</p>
    </footer>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.6/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>