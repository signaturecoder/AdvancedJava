package master1.DUO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import master1.DTO.RegisterDTO1;
import master1.utilities.ConnectionFactory1;

public class RegisterDAO1 {
Connection cn=null;
Statement st = null;
ResultSet rs = null;
PreparedStatement ps = null;
String sql_insert="insert into register_master values(?,?)";
String sql_select="select * from register_master";
        public void insertRegisterData(RegisterDTO1 rdto1){
        	try{
        		ConnectionFactory1 con = new ConnectionFactory1();
        		cn=con.getConn();
        		ps=cn.prepareStatement(sql_insert);
        		ps.setString(1,rdto1.getCid());
        		ps.setString(2,rdto1.getPass());
        		ps.executeUpdate();
        		cn.commit();
        	}
        	catch(SQLException se){
        		se.printStackTrace();
        	}
        }
        
        public ArrayList getRegisterData(RegisterDTO1 rdto){
        	ArrayList arr = new ArrayList<>();
        	try{
        		ConnectionFactory1 con = new ConnectionFactory1();
        		cn=con.getConn();
        		st=cn.createStatement();
        		rs=st.executeQuery(sql_select);
        		while(rs.next()){
        			RegisterDTO1 rdto1 = new RegisterDTO1();
        			rdto1.setCid(rs.getString(1));
        			rdto1.setPass(rs.getString(2));
        			arr.add(rdto1);
        		}
        	}
        	catch(SQLException se){
        		se.printStackTrace();
        	}
        	return arr;
        }
        
        public boolean checkLogin(String cid,String pass)
        {
        	boolean flag=false;
        	String sql_check_login="select * from register_master where cid='"+cid+"' and password='"+pass+"'";
        	try{
        		ConnectionFactory1 con = new ConnectionFactory1();
        		cn= con.getConn();
        		st=cn.createStatement();
        		rs=st.executeQuery(sql_check_login);
        		if(rs.next())
        		{
        			flag=true;
        		}
        	}
        	catch(SQLException se){
        		se.printStackTrace();
        	}
        	return flag;
        }
}
