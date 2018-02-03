package JDBC;
import java.sql.*;
class TestConnection1{
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	String query1="select * from member";
	String query2="insert into member Values(?,?,?,?,?,?)";
	String query3="delete from member where memberid=?";
	String query4="update member set mname=?,fees=? where memberid=?";
	public void getData1(){
		try{
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		ConnectionFactory1 con1 = new ConnectionFactory1();
		cn=con1.getConn1();
		//st=cn.createStatement();
		st=con1.getStat1();           // create statement
		//rs=st.executeQuery(query1);
		rs=con1.getResultset(query1);
		while(rs.next()){
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getDouble(6));
		}
		}
		/*catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}*/
		catch(SQLException se){
			se.printStackTrace();
		}
		
	}
	
	public void insertData1(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			ps=cn.prepareStatement(query2);
			ps.setString(1,"5");
			ps.setString(2,"Shashi");
			ps.setString(3,"FT");
			ps.setString(4,"1");
			ps.setString(5,"1001001000");
			ps.setString(6,"20000.50");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}
	
	public void deleteData1(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			ps=cn.prepareStatement(query3);
			ps.setString(1,"4");
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
	
	public void updateData1(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
			ps=cn.prepareStatement(query4);
			ps.setString(1,"Sumit");
			ps.setDouble(2,1500.23);
			ps.setString(3,"5");
			ps.executeUpdate();
			cn.commit();
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		
	}
}
public class Java_OracleConn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         TestConnection1 tc1 = new TestConnection1();
         //tc1.insertData1();
        // tc1.deleteData1();
         tc1.updateData1();
         tc1.getData1();
	}

}
