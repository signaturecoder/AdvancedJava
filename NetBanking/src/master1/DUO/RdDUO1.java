package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.FD_DTO1;
import master1.DTO.RD_DTO1;
import master1.utilities.ConnectionFactory1;

public class RdDUO1 {
	 Connection cn=null;
	    PreparedStatement ps=null;
	    Statement st=null;
	    ResultSet rs=null;
	    String sql_insert="insert into rd_master values(rdid_seq.nextval,?,?,?,?)";
	    String sql_select="select * from rd_master";
	    public void insertRdData(RD_DTO1 rddto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql_insert);
	    		ps.setDouble(1,rddto.getRdamt());
	    		ps.setString(2,rddto.getSavaccno());
	    		ps.setInt(3,rddto.getNom());
	    		ps.setString(4,rddto.getBdt());
	    		ps.executeUpdate();
	    		cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    public ArrayList ShowRdData(){
	    	ArrayList arr1 = new ArrayList<>();
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    	    st=cn.createStatement();
	    		rs=st.executeQuery(sql_select);
	    		while(rs.next()){
	    			RD_DTO1 rddto = new RD_DTO1();
	    			rddto.setRdid(rs.getInt(1));
	    			rddto.setRdamt(rs.getDouble(2));
	    			rddto.setSavaccno(rs.getString(3));
	    			rddto.setNom(rs.getInt(4));
	    			rddto.setBdt(rs.getString(5));
	    			arr1.add(rddto);
	    			
	    		}
	    	}
	       catch(SQLException se){
	    	   se.printStackTrace();
	       }
	    	return arr1;
	   }
}
