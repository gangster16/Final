import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class DbkamMain 
{
	final static String url = "jdbc:mysql:///apnadatabase";
	final static String user = "root";
	final static String pas = "";
			
	
	public static void main(String args[]) throws SQLException
	{
		Connection con = DriverManager.getConnection(url,user,pas);
		Statement st = con.createStatement();
		
		String query= "select * from apnatable";
		
		
		
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));	
		}
		
		con.close();
	}
	
}
