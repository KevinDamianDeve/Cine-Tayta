<%-- 
    Document   : admin
    Created on : 25-nov-2018, 15:34:49
    Author     : Kevin Damian
--%>
<%@page session="true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
       
              <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>::.INICIO.::</title>
        
        <link href="css/sweetalert2.css" rel="stylesheet" type="text/css"/>
        
        <link href="plugins/DATATABLE/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/DATATABLE/css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/DATATABLE/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/DATATABLE/css/responsive.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/DATATABLE/css/rowReorder.dataTables.min.css" rel="stylesheet" type="text/css"/>
        
        <script src="plugins/DATATABLE/js/buttons.html5.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/buttons.print.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/dataTables.buttons.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/dataTables.responsive.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/dataTables.rowReorder.min.js" type="text/javascript"></script>
        
        <script src="plugins/DATATABLE/js/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/jquery.dataTables.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/jszip.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/pdfmake.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/vfs_fonts.js" type="text/javascript"></script>
        
        
<style type="text/css">
<!--
body {
background-attachment: fixed;
background-image: url(fotos/fondo.jpg);
background-repeat: no-repeat;
background-position: center center;
}
-->
</style>
       

       <script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
       
            <link href="Css/estilosadmin.css" rel="stylesheet" type="text/css"/>
<script src="http://code.jquery.com/jquery-latest.js" ></script>
<script src="Css/main.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head> 

  
    <body  >
        <%
        HttpSession sesion =request.getSession();
        String usuario;
        String nivel;
        if(sesion.getAttribute("user") !=null && sesion.getAttribute("nivel")!=null )
        {
          usuario=sesion.getAttribute("user").toString();
                  nivel=sesion.getAttribute("nivel").toString();
           out.print("<a href='Index.jsp?cerrar=true'><h5> 	&#8272; Cerrar Sesion</h5> </a> ");
                  out.print("<hr>");
        } else
        {
            out.print("<script>location.replace('Index.jsp');</script> " );
        }

        %>
        <div class="container" >
            <div class="row" >
                <div class="col-lg-2" >
                   
                </div>
            </div>
        



        <div class="row">
        <div class="col-lg-10">
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href="admin.jsp">Cine TAYTA</a>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        
                        <li class="nav-item active">
                          <a class="nav-link" href="admin.jsp">Inicio<span class="sr-only">(current)</span></a>
                        </li>
                        
                        <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProducto" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Peliculas</a>
                        <div class="dropdown-menu" aria-labelledby="barraPeliculas">
<!--Registrar producto <a class="dropdown-item " href="RegistrarProducto.jsp">Registrar Producto</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProducto.jsp">Modificar Producto</a> --->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="ListarPeliculas.jsp">Mostrar Peliculas</a>
                        <a class="dropdown-item" href="ListarSalas.jsp">Mostar Salas</a>
                        <a class="dropdown-item" href="Listarbutacas.jsp">Mostrar Butacas</a>
                        <a class="dropdown-item" href="Listargeneros.jsp">Mostrar Genero</a>
                        </div>
                        </li>
                        
                        <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProducto" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Productos</a>
                        <div class="dropdown-menu" aria-labelledby="barraProducto">
<!--Registrar producto <a class="dropdown-item " href="RegistrarProducto.jsp">Registrar Producto</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProducto.jsp">Modificar Producto</a> --->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="Listarproductos.jsp">Mostrar Producto</a>
                    <a class="dropdown-item" href="ListarCompraProduc.jsp"> Compras</a>
                        </div>
                        </li>
                        <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProveedor" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                           Proveedor</a>
                        <div class="dropdown-menu" aria-labelledby="barraProveedor">
<!--Registrar producto <a class="dropdown-item" href="RegistrarProveedor.jsp">Registrar Proveedor</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProveedor.jsp">Modificar Proveedor</a>--->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="Listarproveedor.jsp">Mostrar Proveedor</a>
                        </div>
                        </li>
                        
                         <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProveedor" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Clientes</a>
                        <div class="dropdown-menu" aria-labelledby="barraProveedor">
<!--Registrar producto <a class="dropdown-item" href="RegistrarProveedor.jsp">Registrar Proveedor</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProveedor.jsp">Modificar Proveedor</a>--->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="Listarcliente.jsp">Mostrar Clientes</a>
                        </div>
                        </li>
                         <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProveedor" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Usuarios</a>
                        <div class="dropdown-menu" aria-labelledby="barraProveedor">
<!--Registrar producto <a class="dropdown-item" href="RegistrarProveedor.jsp">Registrar Proveedor</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProveedor.jsp">Modificar Proveedor</a>--->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="ListarUsuaro.jsp">Mostrar Usuarios</a>
                        
                        </div>
                        </li>
                        <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProveedor" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Ventas de Peliculas</a>
                        <div class="dropdown-menu" aria-labelledby="barraProveedor">
<!--Registrar producto <a class="dropdown-item" href="RegistrarProveedor.jsp">Registrar Proveedor</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProveedor.jsp">Modificar Proveedor</a>--->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="Listarventapeliculas.jsp">Registar</a>
                        <a class="dropdown-item" href="ListarDetalleVentaPelicula.jsp">Realizar Venta</a>
                        
                        </div>
                        </li>
                        
                        <li class="nav-item active dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="barraProveedor" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            Ventas de Productos</a>
                        <div class="dropdown-menu" aria-labelledby="barraProveedor">
<!--Registrar producto <a class="dropdown-item" href="RegistrarProveedor.jsp">Registrar Proveedor</a>--->
<!--Modificar producto <a class="dropdown-item" href="ModificarProveedor.jsp">Modificar Proveedor</a>--->
 <!-- espacio para otros  <div class="dropdown-divider"></div> -->
<!--Listar producto---><a class="dropdown-item" href="ListarVentaProductos.jsp">Registar </a>
                        <a class="dropdown-item" href="ListarDetalleVentaProducto.jsp">Venta Producto</a>
                        
                        </div>
                        </li>
                    </ul>                     

                </div>                    
            </nav>
        </div>
    </div>
    </div>
        </div>
        
        <div class="container" >
        <div class="row" >
            <div class="col-lg-8" >
                <table border="1" width="920"> <!-- Lo cambiaremos por CSS -->
                    <tr>
                        <td>
                            <table width="100%"  border="0" bgcolor="firebrick" >
                                <td width="200"  > <img src="fotos/imageninicio.jpg" width="250" height="100"/></td>
                                <td><h1 ><font color="black" face="Comic Sans MS,arial,verdana" >Sistema de Cine Tayta</font></h1></td> 
                          
                            </table>
                        </td>
                    </tr>
                </table>                
                </div>                
            </div>
            <div class="row" >
                <div class="col-lg-4" >
                    
                </div>
            </div>
            
            
        </div>
   
        
        
        <br><br><br>
        
        <div class="container">
        <div class="row" >
                <div class="col-lg-3" >
                    
                </div>
                       
                        
                            <div class="col-lg-8">
                         <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img class="d-block w-50" src="fotos/cine11.jpg" alt="First slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/cine1.jpg" alt="Second slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/ott.jpg" alt="Third slide">
                  </div>
                    <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/otra.jpg" alt="Third slide">
                  </div>
                   
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
                </a>
            </div>
                            </div>
                        </div>
        </div>
        
        
        
        
                  
        
    
        
        <script src="plugins/DATATABLE/js/jquery-3.3.1.js" type="text/javascript"></script>    
      <script src="plugins/BOOTSTRAP/js/bootstrap.min.js" type="text/javascript"></script>
      <script src="plugins/BOOTSTRAP/js/popper.min.js" type="text/javascript"></script>                        
    </body>
</html>
