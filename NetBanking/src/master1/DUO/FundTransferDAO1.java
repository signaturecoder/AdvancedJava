package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.FundTransferDTO;
import master1.utilities.ConnectionFactory1;

public class FundTransferDAO1 {
	    Connection cn=null;
	    PreparedStatement ps=null;
	    Statement st=null;
	    ResultSet rs=null;
	    String sql10="insert into fund_transfer values(transid_seq.nextval,?,?,?,?)";
	    String sql11="select * from fund_transfer";
	    public void insertFundTransferData(FundTransferDTO ftdto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql10);
	    		ps.setString(1,ftdto.getSaccno());
	    		ps.setString(2,ftdto.getBnf());
	    		ps.setDouble(3,ftdto.getAmt());
	    		ps.setString(4,ftdto.getDt());
	    		ps.executeUpdate();
	    		cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    public ArrayList ShowTransferData(){
	    	ArrayList arr1 = new ArrayList<>();
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    	    st=cn.createStatement();
	    		rs=st.executeQuery(sql11);
	    		while(rs.next()){
	    			FundTransferDTO ftdto = new FundTransferDTO();
	    			ftdto.setTransid(rs.getInt(1));
	    			ftdto.setSaccno(rs.getString(2));
	    			ftdto.setBnf(rs.getString(3));
	    			ftdto.setAmt(rs.getDouble(4));
	    			ftdto.setDt(rs.getString(5));
	    			arr1.add(ftdto);
	    		}
	    	}
	       catch(SQLException se){
	    	   se.printStackTrace();
	       }
	    	return arr1;
	   }

	    
}
