package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.FD_DTO1;
import master1.utilities.ConnectionFactory1;

public class FdDAO1 {
	    Connection cn=null;
	    PreparedStatement ps=null;
	    Statement st=null;
	    ResultSet rs=null;
	    String sql_insert="insert into fd_master values(fdid_seq.nextval,?,?,?,?)";
	    String sql_select="select * from fd_master";
	    public void insertFdData(FD_DTO1 fddto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql_insert);
	    		ps.setDouble(1,fddto.getFdamt());
	    		ps.setString(2,fddto.getSavaccno());
	    		ps.setInt(3,fddto.getNoy());
	    		ps.setString(4,fddto.getBdt());
	    		ps.executeUpdate();
	    		cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    public ArrayList ShowFdData(){
	    	ArrayList arr1 = new ArrayList<>();
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    	    st=cn.createStatement();
	    		rs=st.executeQuery(sql_select);
	    		while(rs.next()){
	    			FD_DTO1 fddto = new FD_DTO1();
	    			fddto.setFdid(rs.getInt(1));
	    			fddto.setFdamt(rs.getDouble(2));
	    			fddto.setSavaccno(rs.getString(3));
	    			fddto.setNoy(rs.getInt(4));
	    			fddto.setBdt(rs.getString(5));
	    			arr1.add(fddto);
	    			
	    		}
	    	}
	       catch(SQLException se){
	    	   se.printStackTrace();
	       }
	    	return arr1;
	   }
}
