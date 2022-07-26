<%-- 
    Document   : Vendedor2
    Created on : 25-nov-2018, 16:12:13
    Author     : Kevin Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
<link href="Css/estilosadmin.css" rel="stylesheet" type="text/css"/>
<script src="http://code.jquery.com/jquery-latest.js" ></script>
<script src="Css/main.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
  
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>::.VENDEDOR DE PRODUCTOS.::</title>
    </head>
    <body>
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
    <center><h3>Vendedor de Productos</h3></center>
        
        
        <div class="container-fluid" >
            <div class="row" >
                <div class="col-lg-12" >
                <table border="1" width="1124"  style="margin: 0 auto;" > <!-- Lo cambiaremos por CSS -->
                    <tr>
                        <td>
                            <table width="1124"  border="0" bgcolor="#85C1E9"  style="margin: 0 auto;" >
                            
                                <td width="500"  > <img src="fotos/imageninicio.jpg" width="200" height="100"/></td> 
                                <td><h1 ><font color="red" face="Comic Sans MS,arial,verdana" >Sistema de Cine Tayta</font></h1></td>
                              
                            </table>
                            <header>
                                <div class="container" >
            <div class="row">
            <div class="col-lg-12" >
         <header>
                                <div class="contenedor" >
                            <div class="logo" >
                                <img src="" alt="" >
                                
                            </div>
                                    <nav class="menu">
                                <ul>
                                    <li><a href="#"  ></a></li>
                                    <li><a href="#" ></a></li>
                                    <li><a href="#" ></a></li>
                                    <li><a href="#" ></a></li>
                                    <li><a href="#" ></a></li>
                                    <li><a href="Vendedor2.jsp" >Inicio</a></li>
                                    <li><a href="productos3.jsp" >Productos</a></li>
                                    <li><a href="clientes3.jsp" >Clientes</a></li>
                                    <li><a href="reservaproductos.jsp" >Pedido</a></li>
                                    <li><a href="ventaproductos.jsp" >Venta</a></li>
                                   
                                </ul>
                                       
                                
                                
                            </nav>
                                </div>         
                            </header>
            </div>
        </div>
        </div>       
                            </header>
                            
                        </td>
                    </tr>
                    
                 
                  
        
                </table>  
              
                   
                </div>
                
               
            </div>
            
        </div>
    
    
      
         <div class="container">
        <div class="row" >
                <div class="col-lg-3" >
                    
                </div>
                       
                        
                            <div class="col-lg-8">
                         <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img class="d-block w-50" src="fotos/combo-cine.jpg" alt="First slide">
                  </div>
                 
                  <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/combo4.png" alt="Third slide">
                  </div>
                    <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/esa.jpg" alt="Third slide">
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
        
        
            
        
                <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
     
        
        
    </body>
</html>
