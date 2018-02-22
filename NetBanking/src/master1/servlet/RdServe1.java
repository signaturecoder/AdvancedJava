package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import master1.DTO.RD_DTO1;
import master1.DUO.AccountDUO1;
import master1.DUO.RdDUO1;

/**
 * Servlet implementation class RdServe1
 */
public class RdServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		double rdamt=Double.parseDouble(request.getParameter("rdamt"));
		String savaccno=request.getParameter("savaccno");
		int nom=Integer.parseInt(request.getParameter("nom"));
		String bdt=request.getParameter("bdt");
		RD_DTO1 rddto = new RD_DTO1();
		rddto.setRdamt(rdamt);
		rddto.setSavaccno(savaccno);
		rddto.setNom(nom);
		rddto.setBdt(bdt);
		RdDUO1 rddao = new RdDUO1();
		AccountDUO1 aduo = new AccountDUO1();
		if(aduo.checkAccountno(rddto.getSavaccno())==true){
			System.out.println("Match");
			if(aduo.checkBalance(rddto.getSavaccno())-rdamt>1000.00){
				rddao.insertRdData(rddto);
				response.sendRedirect("RdDetails.jsp");
			}
			else
			{
				System.out.println("FUND NOT AVAILABLE");
				response.sendRedirect("InsufficientFund.jsp");
			}
	
		}
		else{
			System.out.println("Not Match");
			response.sendRedirect("InvalidAccount.jsp");
		}
		
	}

}
