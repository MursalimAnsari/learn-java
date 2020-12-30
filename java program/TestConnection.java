
import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	public static void main(String[] args) throws Exception{
	 
		Class.forName("com.mysql.Driver");
	
		Connection con =  DriverManager.getConnection(
				
				"jdbc:mysql://localhost:3306/students_db","root","Admin@123"
				);
		
		System.out.println("Connection Successful");
		con.close();
	}

}
