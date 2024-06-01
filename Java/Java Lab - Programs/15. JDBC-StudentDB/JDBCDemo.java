import java.sql.*;

public class JDBCDemo {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/studentdb?characterEncoding=utf8";
	
	static final String USER = "root";
	static final String PASSWD = "";
	
	public static void main(String[] args) {
			
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Connecting to the Database");
			conn = DriverManager.getConnection(DB_URL,USER,PASSWD);
			System.out.println("Connected to: " + conn.getCatalog());
			
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM studentinfo";
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int Rollno = rs.getInt("Roll No");
				String name = rs.getString("Name");
				String usn = rs.getString("usn");
				String division = rs.getString("Division");
				
				System.out.print("Roll No: " + Rollno + " ");
				System.out.print("Name: " + name+"  ");
				System.out.print("USN: " + usn+" ");
				System.out.println("Division: " + division);
			}
			
			
			
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
