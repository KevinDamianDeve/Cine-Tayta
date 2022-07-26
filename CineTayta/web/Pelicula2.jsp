<%-- 
    Document   : Pelicula2
    Created on : 06-dic-2018, 20:25:27
    Author     : Kevin Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="en" xmlns="http://www.w3.org/1999/xhtml">
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
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
      
        
        <link href="plugins/DATATABLE/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/DATATABLE/css/buttons.dataTables.min.css" rel="stylesheet" type="text/css"/>

        <script src="plugins/DATATABLE/js/jquery-3.3.1.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/jquery.dataTables.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/dataTables.rowReorder.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/dataTables.responsive.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/buttons.print.min.js" type="text/javascript"></script>
        
        <script src="plugins/DATATABLE/js/dataTables.buttons.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/jszip.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/pdfmake.min.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/vfs_fonts.js" type="text/javascript"></script>
        <script src="plugins/DATATABLE/js/buttons.html5.min.js" type="text/javascript"></script>
        
        <link rel="stylesheet" href="plugins/DATATABLE/css/jquery.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="plugins/DATATABLE/css/rowReorder.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="plugins/DATATABLE/css/responsive.dataTables.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="plugins/DATATABLE/css/bootstrap.min.css" rel="stylesheet" type="text/css"/> 
        
        <link rel="stylesheet" href="plugins/DATATABLE/css/buttons.dataTables.min.css" type="text/css"/>
 
        <link href="css/sweetalert2.css" rel="stylesheet" type="text/css"/>        

        
        
        
        <link href="Css/estilosadmin.css" rel="stylesheet" type="text/css"/>
        
        
<link rel="https:https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
<link rel="https:https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/rowreorder/1.2.3/js/dataTables.rowReorder.min.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/responsive/2.2.1/js/dataTables.responsive.min.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.print.min.js"></script>
<script src="https://cdn.datatables.net/buttons/1.5.2/js/dataTables.buttons.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/3.1.3/jszip.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/pdfmake.min.js" type="text/javascript"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/pdfmake/0.1.36/vfs_fonts.js" type="text/javascript"></script>
<script src="https://cdn.datatables.net/buttons/1.5.2/js/buttons.html5.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/rowreorder/1.2.3/css/rowReorder.dataTables.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.1/css/responsive.dataTables.min.css">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.5.2/css/buttons.dataTables.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        
         <script>
$(document).ready(function() {
    var table = $('#tabla').DataTable( {
        rowReorder: {
            selector: 'td:nth-child(2)'
        },
        fixedHeader: true,
        responsive: true,
        autoFill: true,
        paging: true,
        ordering: true,
        searching: true,
        info: true,
        scrollY:        200,
        deferRender:    true,
        scroller:       true,
        
        language:{
            url: "//cdn.datatables.net/plug-ins/1.10.19/i18n/Spanish.json"
        },
        lengthMenu: [
            [ 10, 25, 50, -1 ],
            [ '10 Filas', '25 Filas', '50 Filas', 'Todos' ]
        ],
        dom: 'Bfrtip',
        buttons: [
            'copyHtml5',
            'excelHtml5',
            'csvHtml5',
            'print',
            'pageLength',
            {
                extend: 'pdfHtml5',
                download: 'open'
            }
        ]
     
    } );
    
    

} );
</script>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>::.PELICULAS.::</title>
    </head>
    <body>
        
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
                                    <li><a href="Vendedor.jsp" >Inicio</a></li>
                                    <li><a href="clientes2.jsp" >Clientes</a></li>
                                    <li><a href="Pelicula2.jsp" >Peliculas</a></li>
                                    <li><a href="butaca2.jsp" >Butacas</a></li>
                                    <li><a href="reservapeli2.jsp" >Reserva</a></li>
                                    <li><a href="ventapelicula.jsp" >Venta</a></li>
                                   
                                </ul>
                                       
                                
                                
                            </nav>
                                </div>         
                            </header>
            </div>
        </div>
        </div>
        <div class="container" >
            <div class="row" >
             
          
        
         
           
                <div class="col-lg-12">
                    
                    <table class="table-striped display" id="tabla">
                        <thead>
                            <tr class="bg-success" border="1" >
                                <th>Codigo</th>
                                <th>Nombre</th>                               
                                <th>Duracion</th>
                                <th>Pais</th>
                                 <th>Año </th>
                                <th>Director</th>
                                <th>Protagonistas</th>
                                <th>Cod Genero</th>
                                <th>Hora Comienzo</th>
                                <th>Precio</th>
                                <th>N Sala</th>
                                
                                
                            </tr>
                            
                        </thead>
                        <tbody>
                            <% for(MODEL.Pelicula p:DAO.PeliculaDAO.listar()) { %>
                            <tr>
                            <td width='5' > <%= p.getIdpelicula()%></td>
                            <td width='5'> <%= p.getNombre()%> </td>
                            <td width='5'> <%=p.getDuracion()%></td>
                            <td width='5'> <%=p.getPais()%></td>
                            <td width='5'> <%=p.getAño()%></td>
                            <td width='5'> <%=p.getDirector()%></td>                         
                            <td width='5'> <%=p.getProtagonistas()%></td>
                            <td width='5'> <%=p.getIdgenero()%></td>
                            <td width='5'> <%=p.getHora_c()%></td>
                            <td width='5'> <%=p.getPrecio()%></td>
                            <td width='5'> <%=p.getNsala()%></td>
                           
                          
                            </tr>
                             <% } %>
                        </tbody>
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
                    <img class="d-block w-50" src="fotos/monja.jpeg" alt="First slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/choky.jpg" alt="Second slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/asu.jpeg" alt="Third slide">
                  </div>
                    <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/mision.jpg" alt="Third slide">
                  </div>
                    <div class="carousel-item">
                    <img class="d-block w-50" src="fotos/coco.jpg" alt="Third slide">
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
        
        
                        
                        
                        
        
               
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
<script src="plugins/BOOTSTRAP/js/bootstrap.min.js" type="text/javascript"></script>
<script src="plugins/BOOTSTRAP/js/popper.min.js" type="text/javascript"></script>
    
    </body>
</html>
