<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link rel="stylesheet" href="assets/css/bootstrap.min.css"/>
    </head>
    <body class="d-flex justify-content-center align-items-center vh-100" style="background-image: url(image/fondo.jpg)">
        <div class="container w-25 border border-1 p-5 rouunded-10" style="background-color: white">
            <form action="Login" method="post">
            <div class="form-group mb-3">
                <label for="exampleInputUsuario" class="mb-1 fw-bold">Usuario</label>>
                <input type="text" class="form-control" id="exampleInputUsuario" aria-describedby="emailHelp" placeholder="Enter user" name="username">
            </div>
            <div class="form-group mb-3">
                <label for="exampleInputPassword1" class="mb-1 fw-bold">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name = "clave">
            </div>
            <button type="submit" class="btn btn-primary">Entrar</button>
        </form>
        </div>   


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
