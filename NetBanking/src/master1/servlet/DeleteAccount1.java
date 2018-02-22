package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.AccountDTO1;
import master1.DUO.AccountDUO1;

/**
 * Servlet implementation class DeleteAccount1
 */
public class DeleteAccount1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String accno=request.getParameter("accno");
		AccountDTO1 acdto=new AccountDTO1();
		acdto.setAccno(accno);
		AccountDUO1 acduo = new AccountDUO1();
	    acduo.DeleteAccount(acdto);
		response.sendRedirect("AccountDetails.jsp");
		
	}

}
