<%@ include file="comunes/cabecero.jsp"%>
<%@ include file="comunes/navegacion.jsp"%>
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
                            <th scope="col"></th>
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
                            <td class="text-center">
                                <!<!-- Preparamos la url con los datos del empleado para editar -->
                                <c:set var="urlEditar">
                                    <c:url value="${application.contextPath}/editar">
                                        <c:param name="idEmpleado" value="${empleado.idEmpleado}"/>
                                    </c:url>
                                </c:set>
                                <!<!-- insertamos la url  -->
                                <a href="${urlEditar}" class="btn btn-warning btn-sm me-3">Editar</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
<%@ include file="comunes/pie-pagina.jsp"%>