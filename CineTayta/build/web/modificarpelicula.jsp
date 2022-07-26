<%-- 
    Document   : modificarpelicula
    Created on : 02-dic-2018, 2:13:04
    Author     : Kevin Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <title>::.MODIFICAR PELICULA.::</title>
    </head>
     <body>
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
         
         
         
         
         
          <div class="container">
            <div class="row">
                <div class="col-lg-8">
                    
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
                                <th>Operaciones</th>
                                
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
                           
                            
                             <td>
                                     <a href="Servleteliminarpeli?cod=<%=p.getIdpelicula()%>">
                                     <input type="submit" value="Eliminar"
                                            class="btn btn-danger btn-sm"></a>
                                            
                                            
                                     <a href="modificarpelicula.jsp?cod=<%=p.getIdpelicula()%>">       
                                     <input  type="submit" value="Modificar"
                                            class="btn btn-success btn-sm"></a>
                                     
                                     
                                 </td> 
                            </tr>
                             <% } %>
                        </tbody>
                    </table>
                    
                    
                    
                </div>
                
            </div>
         <div class="row">
                 <div class="col-lg-4">
              <!-- Button trigger modal -->
                <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModal">
                  Registrar Nuevo Pelicula
                </button>
                 </div>
             </div>
                        <br>
                      <%--  <div>
                            <button onclick="location.href='ListarCompraProduc.jsp'"class="btn btn-outline-primary" >Realizar la compra</button>
                        </div>   --%>    
            
        </div>
                      
                      <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Registrar Pelicula</h5>
         </div>
      <div class="modal-body">
        <!-- 4:3 aspect ratio -->
                <div class="embed-responsive embed-responsive-4by3">
                  <iframe class="embed-responsive-item" src="RegistrarPeliculas.jsp"></iframe>
                </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" data-dismiss="modal" onclick= "self.location.href = 'ListarPeliculas.jsp'">Salir </button>
        <!--<button type="button" class="btn btn-primary">Save changes</button>-->
      </div>
    </div>
  </div>
</div>  
         
         
         
      <div class="container" >
            <div class="row">
                <div class="col-lg-6">
                     <h3>DATOS DE REGISTRO</h3>
                    <% String sid=request.getParameter("n"); %>
                    <% MODEL.Pelicula p=DAO.PeliculaDAO.getIdPelicula(sid); %>
                    
                    
                    
                    
                    
                    
                    <table class="table table-striped">
                        <form name="form1" method="post" action="Servletmodificarpelicula" >
                             <tr>
                                <td>Codigo</td>
                                <td>
                                    <select  name="cod" class="form-control"required>
                                    <% for(MODEL.Pelicula cat:DAO.PeliculaDAO.listar()){ %>
                                    <option> <%=cat.getIdpelicula()%></option>
                                    <% } %>
                                    </select>                                    
                            </tr>
                            
                            <tr>
                                <td>Nombre</td>
                                <td><input type="text" name="nom" class="form-control" 
                                           value="<% out.println(p.getNombre()); %>" ></td>
                            </tr>
                            <tr>
                                <td>Duracion</td>
                                <td><input type="text" name="dur" class="form-control" 
                                           value="<% out.println(p.getDuracion()); %>" ></td>
                            </tr>
                            <tr>
                                <td>Pais</td>
                                <td><input type="text" name="pai" class="form-control" 
                                           value="<% out.println(p.getPais()); %>" ></td>
                            </tr>
                            <tr>
                                <td>Año</td>
                                <td><input type="text" name="an" class="form-control" 
                                           value="<% out.println(p.getAño()); %>" ></td>
                            </tr>
                            <tr>
                                <td>Director</td>
                                <td><input type="text" name="direc" class="form-control" 
                                           value="<% out.println(p.getDirector()); %>" ></td>
                            </tr>
                            <tr>
                                <td>Protagonistas</td>
                                <td><input type="text" name="prot" class="form-control" 
                                           value="<% out.println(p.getProtagonistas()); %>" ></td>
                            </tr>
                              <tr>
                                <td>Genero</td>
                                <td>
                                    <select  name="idg" class="form-control"required>
                                    <% for(MODEL.Genero cat:DAO.GeneroDAO.listar()){ %>
                                    <option> <%=cat.getIdgenero()%></option>
                                    <% } %>
                                    </select>                                    
                            </tr>
                            
                            <tr>
                                <td>Hora Comienzo</td>
                                <td><input type="text" name="hc" class="form-control" 
                                           value="<% out.println(p.getHora_c()); %>" ></td>
                            </tr>
                            <tr>
                                <td>Precio</td>
                                <td><input type="text" name="pre" class="form-control" 
                                           value="<% out.println(p.getPrecio()); %>" ></td>
                            </tr>
                             <tr>
                                <td>Sala</td>
                                <td>
                                    <select  name="sal" class="form-control"required>
                                    <% for(MODEL.Sala cat:DAO.SalaDAO.listar()){ %>
                                    <option> <%=cat.getNsala()%></option>
                                    <% } %>
                                    </select>                                    
                            </tr>
                            
   
                            
                            <tr>
                                <td colspan="2" > <input type="submit" value="Modificar Pelicula"
                                                         class="btn btn-outline-primary"></td>
                            </tr>
                            
                            <tr>
                                <td colspan="2">
                                    <%= (request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"")  %>
                                    
                                </td>
                            </tr>
                            
                            
                        </form>
                    </table>
                     
                     
                </div>
                
            </div>
        </div>
         
        
        
         <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
  
    </body>
</html>