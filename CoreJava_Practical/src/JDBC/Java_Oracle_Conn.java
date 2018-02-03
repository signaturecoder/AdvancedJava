package JDBC;
import java.sql.*;
class TestConnection {
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps = null;
	String sql="select * from Student";
	String sql1="insert into Student values(?,?,?)";
	String sql2="delete from Student where ROLLNO=?";
	String sql3="update Student set sname=?, mobileno=? where rollno=?";
	public void getData(){
		try{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		ConnectionFactory con = new ConnectionFactory();
		cn=con.getConnect();
		//st=cn.createStatement();
		st=con.getStatement();
		//rs=st.executeQuery(sql);
		rs=con.getResultset(sql);
		while(rs.next()){
			System.out.println(rs.getString(1)+"	"+rs.getString(2)+"	  "+rs.getString(3));
		}
		}
		/*catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}*/
		catch(SQLException se){
			se.printStackTrace();
		}
		
	}
	
	public void insertData(){
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			ConnectionFactory con = new ConnectionFactory();
			cn=con.getConnect();
			ps=cn.prepareStatement(sql1);
			ps.setString(1, "5");
			ps.setString(2, "BAbloo");
			ps.setString(3, "8464105751");
			ps.executeUpdate(); //update the changes
			cn.commit();       //save the changes
		}
		/*catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}*/
		catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	public void deleteData(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			ps=cn.prepareStatement(sql2);
		    ps.setString(1,"3");
		    ps.execute();
		    cn.commit();
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	public void updateData(){
		try{
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			ConnectionFactory con = new ConnectionFactory();
			cn=con.getConnect();
			ps=cn.prepareStatement(sql3);
			ps.setString(1, "sunny");
		    ps.setString(2,"9661154756");
		    ps.setString(3,"1");
		    ps.executeUpdate();
		    cn.commit();
		}
		/*catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}*/
		catch(SQLException se){
			se.printStackTrace();
		}
	}
	
}

public class Java_Oracle_Conn {
   public static void main(String args[]){
	   TestConnection tc = new TestConnection();
	   tc.insertData();
	   tc.getData();
	   //tc.deleteData();
	   //tc.updateData();
	   //tc.getData();
   }
}
