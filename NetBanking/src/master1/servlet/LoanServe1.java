package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.LoanDTO1;
import master1.DUO.AccountDUO1;
import master1.DUO.LoanDAO1;

/**
 * Servlet implementation class LoanServe1
 */
public class LoanServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		double lnamt=Double.parseDouble(request.getParameter("lnamt"));
		String doreq=request.getParameter("doreq");
		int period=Integer.parseInt(request.getParameter("period"));
		String cid=request.getParameter("cid");
		LoanDTO1 lndto = new LoanDTO1();
		lndto.setLnamt(lnamt);
		lndto.setDoreq(doreq);
		lndto.setPeriod(period);
		lndto.setCid(cid);
		LoanDAO1 lndao = new LoanDAO1();
		AccountDUO1 aduo = new AccountDUO1();
		if(aduo.checkCid(lndto.getCid())==true){
			System.out.println("Cid Match");
			lndao.insertLnData(lndto);
			response.sendRedirect("LoanDetails.jsp");
		}
		else{
			System.out.println("Cid Not Match");
			response.sendRedirect("InvalidCid.jsp");
		}
	}

}
