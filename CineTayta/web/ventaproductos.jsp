<%-- 
    Document   : ventaproductos
    Created on : 08-dic-2018, 0:46:32
    Author     : Kevin Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app lang="en" xmlns="http://www.w3.org/1999/xhtml">
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
        <script src="plugins/ANGULAR/js/angular.min.js" type="text/javascript"></script>

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
        
        
  <script>
$(document).ready(function() {
    var table = $('#tabla1').DataTable( {
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
        <title>::.VENTA.::</title>
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
        
        
        <div class="container" >
            <div class="row" >
                <div class="col-lg-6">
                    
                     <table class="table-striped display" id="tabla">
                        <thead>
                            <tr class="bg-success" border="1" >
                                <th>Codigo</th>                              
                                <th>Precio</th>
                                <th>Cantidad</th>
                                 <th>Total</th>
                                <th>C. Producto</th>
                                <th>Codigo Venta</th>
                     

                            </tr>
                            
                        </thead>
                        <tbody>
                            <% for(MODEL.Detalle_ventapro dt:DAO.DetalleVentaProDAO.listar()) { %>
                            <tr>
                            <td width='5' > <%=dt.getIddetalle_ventapro()%></td>
                            <td width='5'> <%=dt.getPrecio()%></td>
                            <td width='5'> <%=dt.getCantidad()%></td>
                            <td width='5'> <%=dt.getValor_venta()%></td>
                            <td width='5'> <%=dt.getIdproducto()%></td>                         
                            <td width='5'> <%=dt.getIdventapro()%></td>
                           
                            
                           
                            </tr>
                             <% } %>
                        </tbody>
                    </table>
                         
                </div>
                
                        
                        
                          <div class="col-lg-6">
                        <span ng-show="showhide"  >
                    <table class="table-striped display" id="tabla1">
                        <thead>
                            <tr class="bg-success" border="1" >
                                <th>Codigo</th>
                                <th>Descrpcion</th>                               
                                <th>Precio</th>
                                <th>Stock</th>                            
                                <th>Presentacion</th>
                                
                              
                         
                                
                            </tr>
                            
                        </thead>
                        <tbody>
                            <% for(MODEL.Producto p:DAO.ProductoDAO.listar()) { %>
                            <tr>
                            <td width='5' > <%= p.getIdproducto()  %></td>
                            <td width='5'> <%= p.getDescripcion() %> </td>
                            <td width='5'> <%=p.getPrecio()  %></td>
                            <td width='5'> <%=p.getStock()  %></td>
                           
                            <td width='5'> <%=p.getPresentacion()  %></td>                         
                           
                           
                         
                            </tr>
                             <% } %>
                        </tbody>
                    </table>
                </span>
                    
                    
                </div>
                
            </div>
    
            
        </div>
        
        
        <div class="container-fluid" >
            <div class="row" >
                 <div class="col-lg-2" >
                               
                            </div>                
                
                <div class="col-lg-2">
                    
              <!-- Button trigger modal -->
                <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModal">
                  Registrar Nuevo
                </button>
                 </div>
               
                            <div class="col-lg-2" >
                                <label for="msje" ><h5><td><font color="red" > Mostrar Productos</font></td></h5></label>
                                    <input type="checkbox" ng-model="showhide">
                            </div>
                        
                        </div> 
       
        </div>
          
        
        
        
                            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Registrar Nuevo</h5>
         </div>
      <div class="modal-body">
        <!-- 4:3 aspect ratio -->
                <div class="embed-responsive embed-responsive-4by3">
                  <iframe class="embed-responsive-item" src="RegistrarNuevodetalleprod.jsp"></iframe>
                </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" data-dismiss="modal" onclick= "self.location.href = 'ventaproductos.jsp'">Salir </button>
        <!--<button type="button" class="btn btn-primary">Save changes</button>-->
      </div>
    </div>
  </div>
</div> 
        
        
        
        
        
        
        
        
        
        
        
        
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
   
    
        
    </body>
</html>
