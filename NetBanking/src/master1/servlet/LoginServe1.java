package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.RegisterDTO1;
import master1.DUO.RegisterDAO1;

/**
 * Servlet implementation class LoginServe1
 */
public class LoginServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String pass=request.getParameter("password");
		RegisterDTO1 rdto = new RegisterDTO1();
		rdto.setCid(cid);
		rdto.setPass(pass);
		RegisterDAO1 rdao = new RegisterDAO1();
		if(rdao.checkLogin(rdto.getCid(),rdto.getPass())==true)
		{
			System.out.println("Login Credential Matched");
			System.out.println("opening client page");
			response.sendRedirect("Client.jsp");
		}
			else
			{
				if(rdto.getCid().equals("admin") && rdto.getPass().equals("admin"))
				{
					System.out.println("opening admin page");
					response.sendRedirect("Admin_menu.html");	
				}
				else{
					response.sendRedirect("index.html");
				}
			}
		}
}
