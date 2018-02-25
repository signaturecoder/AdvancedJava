package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.CustomerDTO1;
import master1.utilities.ConnectionFactory1;

public class CustomerDUO1 {
    Connection cn=null;
    PreparedStatement ps=null;
    Statement st=null;
    ResultSet rs=null;
    String sql="insert into customer_master values(?,?,?,?,?,?,?,?,?,?,?)";
    String sql1="select * from customer_master";
    String sql2="delete from customer_master where cid=?"; 
    String sql3="update customer_master set cname=? , cphone=?, cemail=? , houseno=? , street=? , pincode=? , age=? , panno=? , occupation=? , gender=? where cid=?";
    public void insertData(CustomerDTO1 cdtoo){
    	try{
    		ConnectionFactory1 con = new ConnectionFactory1();
    		cn=con.getConn();
    		ps=cn.prepareStatement(sql);
    		ps.setString(1,cdtoo.getCid());
    		ps.setString(2,cdtoo.getCname());
    		ps.setString(3,cdtoo.getCphone());
    		ps.setString(4,cdtoo.getCemail());
    		ps.setString(5,cdtoo.getChouse());
    		ps.setString(6,cdtoo.getCstreet());
    		ps.setString(7,cdtoo.getCpin());
    		ps.setInt(8,cdtoo.getCage());
    		ps.setString(9,cdtoo.getCpan());
    		ps.setString(10,cdtoo.getCocco());
    		ps.setString(11,cdtoo.getCgender());
    		ps.executeUpdate();
    	    cn.commit();
    	}
    	catch(SQLException se){
    		se.printStackTrace();
    	}
    }
    
    public void deleteData(CustomerDTO1 cdtoo){
    	try{
    		ConnectionFactory1 con = new ConnectionFactory1();
    		cn=con.getConn();
    		ps=cn.prepareStatement(sql2);
    		ps.setString(1,cdtoo.getCid());
    		ps.executeUpdate();
    	    cn.commit();
    	}
    	catch(SQLException se){
    	    se.printStackTrace();
    	}
    }
    
    public void updateDate(CustomerDTO1 cdtoo){
    	try{
    		ConnectionFactory1 con = new ConnectionFactory1();
    		cn=con.getConn();
    		ps=cn.prepareStatement(sql3);
    		ps.setString(1,cdtoo.getCname());
    		ps.setString(2,cdtoo.getCphone());
    		ps.setString(3,cdtoo.getCemail());
    		ps.setString(4,cdtoo.getChouse());
    		ps.setString(5,cdtoo.getCstreet());
    		ps.setString(6,cdtoo.getCpin());
    		ps.setInt(7,cdtoo.getCage());
    		ps.setString(8,cdtoo.getCpan());
    		ps.setString(9,cdtoo.getCocco());
    		ps.setString(10,cdtoo.getCgender());
    		ps.setString(11,cdtoo.getCid());
    		ps.executeUpdate();
    	    cn.commit();
    	}
    	catch(SQLException se){
    		se.printStackTrace();
    	}
    }
    
   public ArrayList getData(){
	   
    	ArrayList arr = new ArrayList<>();
    	try{
    		ConnectionFactory1 con = new ConnectionFactory1();
    		cn=con.getConn();
    		st=cn.createStatement();
    		rs=st.executeQuery(sql1);
    		while(rs.next()){
    			CustomerDTO1 cdtoo = new CustomerDTO1();
    			cdtoo.setCid(rs.getString(1));
    			cdtoo.setCname(rs.getString(2));
    			cdtoo.setCphone(rs.getString(3));
    			cdtoo.setCstreet(rs.getString(4));
    			cdtoo.setChouse(rs.getString(5));
    			cdtoo.setCemail(rs.getString(6));
    			cdtoo.setCpin(rs.getString(7));
    			cdtoo.setCage(rs.getInt(8));
    			cdtoo.setCpan(rs.getString(9));
    			cdtoo.setCocco(rs.getString(10));
    			cdtoo.setCgender(rs.getString(11));
    			arr.add(cdtoo);
    		}
    	}
    	catch(SQLException se){
    		se.printStackTrace();
    	}
    	return arr;
    }
   
      public boolean checkCid(String cid){
    	  boolean flag = false;
    	  String sql_checkCid = "select cid from customer_master where cid='"+cid+"'";
    	  try{
    		  ConnectionFactory1 con = new ConnectionFactory1();
    		  cn=con.getConn();
    		  st=cn.createStatement();
    		  rs=st.executeQuery(sql_checkCid);
    		  while(rs.next()){
    			  flag = true;
    		  }
    	  }
    	  catch(SQLException se){
    		  se.printStackTrace();
    	  }
    	  return flag;
      }
   
}
