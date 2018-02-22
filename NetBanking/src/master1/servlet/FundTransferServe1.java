package master1.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master1.DTO.FundTransferDTO;
import master1.DUO.AccountDUO1;
import master1.DUO.FundTransferDAO1;

/**
 * Servlet implementation class FundTransferServe1
 */
public class FundTransferServe1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String saccno=request.getParameter("saccno");
		String bnf=request.getParameter("bnf");
		double amt=Double.parseDouble(request.getParameter("amt"));
		String dt=request.getParameter("dt");
		FundTransferDTO ftdto = new FundTransferDTO();
		ftdto.setSaccno(saccno);
		ftdto.setBnf(bnf);
		ftdto.setAmt(amt);
		ftdto.setDt(dt);
		FundTransferDAO1 ftdao = new FundTransferDAO1();
		AccountDUO1 aduo = new AccountDUO1();
		if(aduo.checkAccountno(ftdto.getSaccno())==true && aduo.checkAccountno(ftdto.getBnf())==true){
			System.out.println("Match");
			if(aduo.checkBalance(ftdto.getSaccno())-amt>1000.00){
				ftdao.insertFundTransferData(ftdto);
				response.sendRedirect("ShowTransfer.jsp");
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
