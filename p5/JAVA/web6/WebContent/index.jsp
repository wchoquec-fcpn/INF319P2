<%@page import="modelo.Calcular"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="Estilos/Style.css" rel="stylesheet" type="text/css" />
</head>
<body>
  <form action="Serv_Factorial" method="POST">
  
 

        <h1>Progamacion Funcional en Java</h1>

        <table>
            <caption>Con java/tomcat (JSP)  </caption>

            <tr>
                <th>Posición</th>
                <th>Entrada</th>
                <th>Algoritmos</th>
                <th class="auto-style1">Salida</th>
            </tr>
  

            <td>1) Fibonacci N=  </td>
            <td> <input type="text"   name="num" /></td> 
            <td> <button type="submit">Calcular</button></td>
            <td>

                <%
                    Calcular obj = new Calcular();

                    obj = (Calcular) request.getAttribute("OB_ACTUALIZADO");
                    if (obj != null) {
                        out.println("Fibonacci  = " + obj.getNombre() + "<br/>");

                    }

                %>



            </td>
             </table>
        </form>
</body>
</html>