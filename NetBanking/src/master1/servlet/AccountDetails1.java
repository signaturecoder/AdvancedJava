package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.AccountDTO1;
import master1.DUO.AccountDUO1;
import master1.DUO.CustomerDUO1;

/**
 * Servlet implementation class AccountDetails1
 */
public class AccountDetails1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String accno=request.getParameter("accno");
		System.out.println(accno);
		String accp=request.getParameter("accp");
		String cid=request.getParameter("cid");
		double bal=Double.parseDouble(request.getParameter("bal"));
		System.out.println(bal);
		AccountDTO1 acdto = new AccountDTO1();
	    acdto.setAccno(accno);
		acdto.setAccp(accp);
		acdto.setCid(cid);
		acdto.setBal(bal);
		AccountDUO1 acduo = new AccountDUO1();
		acduo.insertAccountData(acdto);
		System.out.println("Data inserted successfully");
		response.sendRedirect("AccountDetails.jsp");
		
	}

}
