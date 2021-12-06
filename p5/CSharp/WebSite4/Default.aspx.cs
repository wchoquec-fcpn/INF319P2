using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }
    protected void SerieFibonacci_Btn_Click(object sender, EventArgs e)
    {
        string cad = "";
        ClassLibrary1.Class1 c1 = new ClassLibrary1.Class1();

        int n = Convert.ToInt32(Num1_Txt.Text);
        for (int i = 1; i <= n; i++)
        {
            cad = cad + c1.fibonacci(i) + ",";
        }
        Respuesta1.Text = cad;

    }
   
    protected void Limpiar_Btn_Click(object sender, EventArgs e)
    {
        string cad = "";
        int n = Convert.ToInt32(Num1_Txt.Text);

        Num1_Txt.Text = cad;
        Respuesta1.Text = cad;
    }
}