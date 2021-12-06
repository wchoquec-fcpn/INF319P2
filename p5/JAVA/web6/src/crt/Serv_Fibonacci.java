package crt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Calcular;

/**
 * Servlet implementation class Serv_Factorial
 */
@WebServlet("/Serv_Factorial")
public class Serv_Fibonacci extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv_Fibonacci() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Calcular obj = new Calcular();
     
        obj.setNombre(request.getParameter("num"));
        request.setAttribute("OB_ACTUALIZADO", obj);
        
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher a = request.getRequestDispatcher("index.jsp");
            a.forward(request, response);
        }
	}
	
	
	
	
	

}
