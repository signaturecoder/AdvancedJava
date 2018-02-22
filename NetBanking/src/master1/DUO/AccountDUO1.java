package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.AccountDTO1;
import master1.DTO.CID_ACCNO_REPORTDTO;
import master1.DTO.CustomerDTO1;
import master1.utilities.ConnectionFactory1;

public class AccountDUO1 {
	    Connection cn=null;
	    PreparedStatement ps=null;
	    Statement st=null;
	    ResultSet rs=null;
	    String sql5="insert into account_master values(?,?,?,?)";
	    String sql6="select * from account_master";
	    String sql7="delete from account_master where accno=?";
	    String sql8="update account_master set acctype=?,cid=?,balance=? where accno=?";
	    String sql9="select * from cid_accno_report";
	    public void insertAccountData(AccountDTO1 acdto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql5);
	    		System.out.println(acdto.getAccno());
	    		ps.setString(1,acdto.getAccno());
	    		ps.setString(2,acdto.getAccp());
	    		ps.setString(3,acdto.getCid());
	    		System.out.println("setting PS:"+acdto.getBal());
	    		ps.setDouble(4,acdto.getBal());
	    		ps.executeUpdate();
	    	    cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    public void updateAccountData(AccountDTO1 acdto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql8);
	    		ps.setString(1,acdto.getAccp());
	    		ps.setString(2,acdto.getCid());
	    		//System.out.println("setting PS:"+acdto.getBal());
	    		ps.setDouble(3,acdto.getBal());
	    		ps.setString(4,acdto.getAccno());
	    		ps.executeUpdate();
	    	    cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    
	    public void DeleteAccount(AccountDTO1 acdto){
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		ps=cn.prepareStatement(sql7);
	    		ps.setString(1,acdto.getAccno());
	    		ps.executeUpdate();
	    	    cn.commit();
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    }
	    
	    
	    public ArrayList getDetailData(){
	 	   
	    	ArrayList arr1 = new ArrayList<>();
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    		st=cn.createStatement();
	    		rs=st.executeQuery(sql6);
	    		while(rs.next()){
	    			AccountDTO1 acdto = new AccountDTO1();
	    			acdto.setAccno(rs.getString(1));
	    			acdto.setAccp(rs.getString(2));
	    			acdto.setCid(rs.getString(3));
	    			System.out.println(rs.getDouble(4));
	    			acdto.setBal(rs.getDouble(4));
	    			arr1.add(acdto);
	    		}
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    	return arr1;
	    }
	    
	    
	    public ArrayList showData(){
	 	   
	    	ArrayList arr1 = new ArrayList<>();
	    	try{
	    		ConnectionFactory1 con = new ConnectionFactory1();
	    		cn=con.getConn();
	    	    st=cn.createStatement();
	    		rs=st.executeQuery(sql9);
	    		while(rs.next()){
	    			CID_ACCNO_REPORTDTO addto = new CID_ACCNO_REPORTDTO();
	    			addto.setAccno(rs.getString(1));
	    			addto.setAccp(rs.getString(2));
	    			addto.setCid(rs.getString(3));
	    			addto.setBal(rs.getDouble(4));
	    			addto.setCname(rs.getString(5));
	    			addto.setCphone(rs.getString(6));
	    			addto.setCemail(rs.getString(7));
	    			addto.setAge(rs.getInt(8));
	    			addto.setPan(rs.getString(9));
	    			addto.setGender(rs.getString(10));
	    			arr1.add(addto);
	    		}
	    	}
	    	catch(SQLException se){
	    		se.printStackTrace();
	    	}
	    	return arr1;
	    }
	    
	    public boolean checkAccountno(String accno)
	    {
	    	boolean flag=false;
	    	String check_acc_sql="select accno from account_master where accno='"+accno+"'";
	    	try{
	        	ConnectionFactory1 con = new ConnectionFactory1();
	        	cn=con.getConn();
	        	st=cn.createStatement();
	        	rs=st.executeQuery(check_acc_sql);
	        	if(rs.next()){
	        		flag=true;
	        	}
	        }
	        catch(SQLException se){
	        	se.printStackTrace();
	        }
	    	return flag;
	    	
	    }
	    
	    public double checkBalance(String accno)
	    {
	    	double balance=0.0;
	    	String check_acc_sql="select balance from account_master where accno='"+accno+"'";
	    	try{
	        	ConnectionFactory1 con = new ConnectionFactory1();
	        	cn=con.getConn();
	        	st=cn.createStatement();
	        	rs=st.executeQuery(check_acc_sql);
	        	if(rs.next()){
	        		balance=rs.getDouble(1);
	        	}
	        }
	        catch(SQLException se){
	        	se.printStackTrace();
	        }
	    	return balance;
	    	
	    }
}
