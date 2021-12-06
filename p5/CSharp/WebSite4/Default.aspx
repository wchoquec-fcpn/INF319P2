<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Ejercio de C#</title>
    <link href="Estilos/Style.css" rel="stylesheet" type="text/css" />

    <style type="text/css">
        .auto-style1 {
            width: 138px;
        }
    </style>

</head>
<body>
    <form id="form1" runat="server">

        <h1>Progamacion Funcional en C#</h1>

        <table>
            <caption>C# (ASPNET), genere la función Fibonacci.  </caption>

            <tr>
                <th>Posición</th>
                <th>Entrada</th>
                <th>Algoritmos</th>
                <th class="auto-style1">Salida</th>
            </tr>
            <tr>
                <td>
                    <asp:Label ID="Label1" runat="server" Text="Numero 1:"></asp:Label></td>
                <td>
                    <asp:TextBox ID="Num1_Txt" runat="server" Height="23px" Width="191px"></asp:TextBox></td>
                <td>
                    <asp:Button ID="Fibo_Btn" runat="server" Height="27px" OnClick="SerieFibonacci_Btn_Click" Text="Serie de Fibonacci" Width="197px" />
                </td>
                <td class="auto-style1">
                    <asp:Label ID="Respuesta1" runat="server" Text="Respuesta_1"></asp:Label>
                </td>
            </tr>
            <tr>

                <td></td>

                <td>&nbsp;</td>
                <td>
                    <asp:Button ID="Button2" runat="server" Height="27px" OnClick="Limpiar_Btn_Click" Text="LIMPIAR" Width="197px" />
                </td>
                <td class="auto-style1"></td>
            </tr>




        </table>

    </form>




</body>
</html>
