<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 1ra linea importa las libreria de etiquetas de jsp, las mismas estan dentro del proyecto y no es un link externo -->
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- 2da linea para dar formato al valor de sueldo -->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Sistema de Empleados</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <nav class="navbar navbar-expand-lg bg-primary" data-bs-theme="dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="/empleados">Sistema de Empleados</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="/empleados">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/agregar">Agregar Empleado</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
        <div class="container">
            <div class="text-center" style="margin: 30px">
                <h3>Sistema de Empleados</h3>
            </div>
            <div class="container">
                <table class="table table-striped table-hover table-bordered align-middle">
                    <thead class="table-dark text-center">
                        <tr>
                            <th scope="col">Id</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Departamento</th>
                            <th scope="col">Sueldo</th>
                        </tr>
                    </thead>
                    <tbody>
                    <fmt:setLocale value="en_US"/>
                    <c:forEach var="empleado" items="${empleados}">
                        <tr>
                            <th scope="row">${empleado.idEmpleado}</th>
                            <td>${empleado.nombreEmpleado}</td>
                            <td>${empleado.departamento}</td>
                            <td>
                                <fmt:formatNumber type="currency" value="${empleado.sueldo}"/>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    </body>
</html>