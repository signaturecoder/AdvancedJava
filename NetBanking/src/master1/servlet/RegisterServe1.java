package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.RegisterDTO1;
import master1.DUO.CustomerDUO1;
import master1.DUO.RegisterDAO1;

/**
 * Servlet implementation class RegisterServe1
 */
public class RegisterServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String pass=request.getParameter("password");
		RegisterDTO1 rdto1 = new RegisterDTO1();
		rdto1.setCid(cid);
		rdto1.setPass(pass);
		RegisterDAO1 rdao1 = new RegisterDAO1();
		CustomerDUO1 cduo = new CustomerDUO1();
		if(cduo.checkCid(rdto1.getCid())==true){
			System.out.println("Cid match");
			rdao1.insertRegisterData(rdto1);
			response.sendRedirect("RegisterDetails.jsp");
		}
		else{
			System.out.println("Cid mis match");
			response.sendRedirect("InvalidCid.jsp");
		}
		
	}

}
