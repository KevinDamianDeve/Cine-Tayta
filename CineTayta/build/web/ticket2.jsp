<%-- 
    Document   : ticket2
    Created on : 07-dic-2018, 19:48:10
    Author     : Kevin Damian
--%>


<%@page import="DAO.ConsultasDAO"%>
<%@page import="DAO.Conexion"%>
<%@page import="javax.swing.table.DefaultTableModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="Css/estilos - copia.css" rel="stylesheet" type="text/css"/>
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
        <title>::.TICKET.::</title>
    </head>
    <body>
        <%--
   <div class="container">
            <div class="row">
                <form action="ticket.jsp" name="form1" class="table table-responsive">
                    <div class="form-group col-md-12">
                        <div class="form-row">
                        <div class="col-md-4">
                            <label for="">Nro de Factura</label>
                            <input type="text" id="fact" name="fact" class="form-control">
                        </div>
                    
                   
                            
                                                  
                        </div>
                        
                        <div class="form-row mt-2">
                            <input type="submit" value="Buscar" class="btn btn-danger" href="index.jsp">
                        </div>
                    </div>
                </form>
            </div>
            
        --%>
        
    <center><h4>Ticket</h4></center>
    <br>
        <div class="container-fluid" >
            <div class="row">
                <div class="col-lg-12">
                    <input type="text"  name="Cod" class="form-control" hidden>
                    <form action="post" name="form1">
                        <center><table  id="tabla" class="table table-striped table-bordered table-responsive-md">
                            <thead>
                                <tr class="bg-primary">
                                   
                                    <th>Nombre</th>
                                    <th>Duracion</th>
                                    <th>Hora</th>
                                    <th>Cantidad</th>
                                    <th>Sala</th>
                                    <th>Butaca</th>
                                    <th>Precio</th>
                                      <th>Total</th>
                                        <th>Cliente</th>
                                          <th>Usuario</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                    ConsultasDAO v=new ConsultasDAO();
                                    Conexion cn=new Conexion();
                                    DefaultTableModel t=new DefaultTableModel();
                                    String fact=request.getParameter("cod");
                                    t=v.ListaVentasxTipo(fact, cn.conectar());
                                    for(int i=0;i<t.getRowCount();i++)
                                    {
                                    %>
                                    <tr>
                                        <td><%= t.getValueAt(i, 0) %></td>
                                        <td><%= t.getValueAt(i, 1) %></td>
                                        <td><%= t.getValueAt(i, 2) %></td>
                                        <td><%= t.getValueAt(i, 3) %></td>
                                        <td><%= t.getValueAt(i, 4) %></td>
                                        <td><%= t.getValueAt(i, 5) %></td>
                                        <td><%= t.getValueAt(i, 6) %></td>
                                        <td><%= t.getValueAt(i, 7) %></td>
                                        <td><%= t.getValueAt(i, 8) %></td>
                                        <td><%= t.getValueAt(i, 9) %></td>
                                       
                                    </tr>
                                    <% } %>
                            </tbody>
                        </table>
                        </center>
                    </form>
                </div>
            </div>
        </div>
  
        
                            <div class="container-fluid">
                                <div class="row" >
                                    <div class="col-lg-4" >
                            <button onclick="location.href='reservapeli2.jsp'"class="btn btn-outline-primary" >Regresar</button>
                        </div>   
                                </div>
                            </div>
          
             <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
  
    </body>
</html>
