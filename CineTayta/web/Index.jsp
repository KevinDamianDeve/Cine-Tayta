<%-- 
    Document   : Index
    Created on : 24-nov-2018, 23:52:52
    Author     : Kevin Damian
--%>

<%@page import="DAO.Operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html> 
    <head>
        <style type="text/css">
<!--
 body{
background-attachment: fixed;
background-image: url(fotos/fondo3.png);
background-repeat: no-repeat;
background-position: center center;
}
-->
</style>
<%--<link href="Css/estilosadmin.css" rel="stylesheet" type="text/css"/> --%>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport"content="widht=device-widht, user-scalable=no; initial-scale=1,maximum-
             scale=1,minimun-scale=1"   >
        <link href="Css/estilos.css" rel="stylesheet" type="text/css"/>
        <title>::.LOGUIN.::</title>
    </head>
    <body>
   
    
        
                                     <form action="Index.jsp" method="post" >
                                         <h2><font color="green"  >Sistema de Cine Tayta '-'</font></h2>
                      
                         <input type="text" name="txtusuario" placeholder="&#128273;  Ingrese Usuario"
                                > <br><br>
                  
                         <input type="password" name="txtcontra" placeholder=" &#128273; Contraseña" >
                         <br><br>
                         
                         <input type="submit" name="btnIniciar" value="Iniciar Sesion"  >
                    
                
                        </form>
   
                     

                     
                 
              
            
            <%
           Operaciones op =new Operaciones();
           if(request.getParameter("btnIniciar")!=null )
           {
               String nombre=request.getParameter("txtusuario");
               String contra=request.getParameter("txtcontra");
               HttpSession sesion=request.getSession();
               switch(op.loguear(nombre, contra))
               {
                   case 1:
                       
                       sesion.setAttribute("user", nombre);
                       sesion.setAttribute("nivel", "1");
                       response.sendRedirect("admin.jsp");
                       break;
                   case 2:
                        sesion.setAttribute("user", nombre);
                       sesion.setAttribute("nivel", "2");
                       response.sendRedirect("Vendedor.jsp");
                         break;
                         
                         case 3:
                        sesion.setAttribute("user", nombre);
                       sesion.setAttribute("nivel", "3");
                       response.sendRedirect("Vendedor2.jsp");
                         break;
                         
                         default:
                             out.write(" Usuario no existe, o contraseña invalida ");
                             
                         break;
                   
               }  
           }
           
            if(request.getParameter("cerrar")!=null)
            {
                session.invalidate();
            }



            
            %>
            

      
    
    
    

    </body>
</html>
