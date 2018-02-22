package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.FD_DTO1;
import master1.DUO.AccountDUO1;
import master1.DUO.FdDAO1;

/**
 * Servlet implementation class FdServe1
 */
public class FdServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		double fdamt=Double.parseDouble(request.getParameter("fdamt"));
		String savaccno=request.getParameter("savaccno");
		int noy=Integer.parseInt(request.getParameter("noy"));
		String bdt=request.getParameter("bdt");
		FD_DTO1 fddto = new FD_DTO1();
		fddto.setFdamt(fdamt);
		fddto.setSavaccno(savaccno);
		fddto.setNoy(noy);
		fddto.setBdt(bdt);
		FdDAO1 fddao = new FdDAO1();
		AccountDUO1 aduo = new AccountDUO1();
		if(aduo.checkAccountno(fddto.getSavaccno())==true){
			System.out.println("Match");
			if(aduo.checkBalance(fddto.getSavaccno())-fdamt>1000.00){
				fddao.insertFdData(fddto);
				response.sendRedirect("FdDetails.jsp");
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
