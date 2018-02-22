package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.CustomerDTO1;
import master1.DUO.CustomerDUO1;

/**
 * Servlet implementation class DeleteCustomer1
 */
public class DeleteCustomer1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		CustomerDTO1 cdtoo = new CustomerDTO1();
		cdtoo.setCid(cid);
		CustomerDUO1 cduo = new CustomerDUO1();
		cduo.deleteData(cdtoo);
		response.sendRedirect("Add.jsp");
		
	}

}
