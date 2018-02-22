package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.CustomerDTO1;
import master1.DUO.CustomerDUO1;

/**
 * Servlet implementation class CustomerAddServe1
 */
public class CustomerAddServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		String cphone=request.getParameter("cphone");
		String cemail=request.getParameter("cemail");
		String chouse=request.getParameter("chouse");
		String cstreet=request.getParameter("cstreet");
		String cpin=request.getParameter("cpin");
		int cage=Integer.parseInt(request.getParameter("cage"));
		String cpan=request.getParameter("cpan");
		String cocco=request.getParameter("cocco");
		String cgender=request.getParameter("cgender");
		CustomerDTO1 cdtoo = new CustomerDTO1();
		cdtoo.setCid(cid);
		cdtoo.setCname(cname);
		cdtoo.setCphone(cphone);
		cdtoo.setCemail(cemail);
		cdtoo.setChouse(chouse);
		cdtoo.setCstreet(cstreet);
		cdtoo.setCpin(cpin);
		cdtoo.setCage(cage);
		cdtoo.setCpan(cpan);
		cdtoo.setCocco(cocco);
		cdtoo.setCgender(cgender);
	    CustomerDUO1 cduo = new CustomerDUO1(); 
		cduo.insertData(cdtoo);
		response.sendRedirect("Add.jsp");
	}

}
