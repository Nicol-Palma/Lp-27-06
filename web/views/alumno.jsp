<%-- 
    Document   : main
    Created on : 27 jun. 2024, 12:40:21
    Author     : ADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    response.setHeader("Pragma", "no-cache");
    response.setHeader("Cache-Control", "must-revalidate");
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Cache-Control", "no-store");
    response.setDateHeader("Expires" , 0);
    String user = null;
    String sexo = null;
    String rol = null;
    HttpSession sesion = request.getSession();
    if (sesion.getAttribute("username") == null) {
%>
<jsp:forward page="index.jsp">
    <jsp:param name="error" value="Usted debe autentificarse...!"/>
</jsp:forward>
<%
} else {
    user = (String) sesion.getAttribute("username");
    sexo = (String) sesion.getAttribute("sexo");
    rol = (String) sesion.getAttribute("rol");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="../assets/css/bootstrap.min.css"/>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Link</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Opciones
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#">Estudiantes</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                        <!-- comment -->
                        
                    </ul>
                    <div class="collapse navbar-collapse d-flex justify-content-end me-4" id="navbarSupportedContent">
                        <ul class="navbar-nav me-5">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                <strong><%=user%></strong>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a class="dropdown-item" href="#"><%=rol%></a></li>
                                <li><a class="dropdown-item fw-bold" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="Logout">Logout</a></li>
                            </ul>
                        </li>
                    </ul>
                    </div>

                </div>
            </div>
        </nav>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

    </body>
</html>
<%
    }
%>
