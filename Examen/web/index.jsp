<%-- 
    Document   : index
    Created on : Apr 11, 2019, 4:51:37 PM
    Author     : shb
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario JSP</title>
    </head>
    <body>
          <form>
            <table>
            
                <tr>
                    <td> Nombre </td><td><input id="Nombre" type="text" placeholder="Nombre" name "Nombre" /></</td>
                </tr>
                <tr>
                    <td> Apellido </td><td><input id="Apellido" type="text" placeholder="Apellido" name "Apellido" /></</td>
                </tr>
                <tr>
                    <td> NroDocumento </td><td><input id="nroDocumento" type="text" placeholder="Nro_documento" name "nroDocumento" /></</td>
                </tr>
                <TR>
                <TD COLSPAN=2>
                    <input type="reset" name="Reset" value="Limpiar" >
                    <INPUT type="submit" value="Enviar">
                </TD>
                </TR>
               
                
            </table>
            
            
            
            
        </form>
            
    </body>
</html>
