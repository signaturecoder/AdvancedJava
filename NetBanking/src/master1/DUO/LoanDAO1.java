package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.LoanDTO1;
import master1.utilities.ConnectionFactory1;

public class LoanDAO1 {
	    Connection cn=null;
	    PreparedStatement ps=null;
	    Statement st=null;
	    ResultSet rs=null;
	    String sql_insert="insert into loan_master values(loanid_seq.nextval,?,?,?,?)";
	    String sql_select="select * from loan_master";
	    public void insertLnData(LoanDTO1 lndto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql_insert);
	    		ps.setDouble(1,lndto.getLnamt());
	    		ps.setString(2,lndto.getDoreq());
	    		ps.setInt(3,lndto.getPeriod());
	    		ps.setString(4,lndto.getCid());
	    		ps.executeUpdate();
	    		cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    public ArrayList ShowLnData(){
	    	ArrayList arr1 = new ArrayList();
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    	    st=cn.createStatement();
	    		rs=st.executeQuery(sql_select);
	    		while(rs.next()){
	    			LoanDTO1 lndto = new LoanDTO1();
	    			lndto.setLnid(rs.getInt(1));
	    			lndto.setLnamt(rs.getDouble(2));
	    			lndto.setDoreq(rs.getString(3));
	    			lndto.setPeriod(rs.getInt(4));
	    			lndto.setCid(rs.getString(5));
	    			arr1.add(lndto);
	    			
	    		}
	    	}
	       catch(SQLException se){
	    	   se.printStackTrace();
	       }
	    	return arr1;
	   }
}
