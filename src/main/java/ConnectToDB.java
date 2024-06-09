import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToDB {

	// private static String dataFetched = "";
	private static String driverName = "com.mysql.cj.jdbc.Driver";
	private static String password = "root";
	private static String url = "jdbc:mysql://localhost:3306/testdb";

	private static String username = "root";

	public static void main(String[] args) {
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(url, username, password);
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT PersonID RqUID  FROM persons where PersonID='1';");
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
