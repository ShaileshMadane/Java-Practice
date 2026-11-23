import java.sql.*;
public class one {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306";
		String user="root";
		String password="Shailesh@7989";
		try{
			Connection conn=DriverManager.getConnection(url, user, password);
			if(conn!=null && !conn.isClosed())
				System.out.println("Database connected successfully");
				
			Statement st=conn.createStatement();
			String create="create Database SDM";
			st.executeUpdate(create);
			
			System.out.println("Database created successfully");
			
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
