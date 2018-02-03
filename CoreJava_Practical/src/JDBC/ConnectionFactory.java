package JDBC;

import java.sql.*;
public class ConnectionFactory {
  Connection cn=null;
  Statement st=null;
  ResultSet rs=null;
  public Connection getConnect(){
	  try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
	  	}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return cn;
     }
  
  public Statement getStatement(){
	  try{
		  cn = this.getConnect();
		  st = cn.createStatement();
		  
	  }
	  catch(SQLException se){
			se.printStackTrace();
		}
	  return st;
	  
  }
  
  public ResultSet getResultset(String sql){
	  try{
		    st=this.getStatement();
		    rs=st.executeQuery(sql);
	  }
	  catch(SQLException se){
			se.printStackTrace();
		}
	  return rs;
  }
  
  }
