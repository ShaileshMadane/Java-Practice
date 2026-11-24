import java.sql.*;
public class two {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/SDM";
		String user="root";
		String password="Shailesh@7989";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,password);
			System.out.println("Database connected ");
			
			Statement st=con.createStatement();
			String createT="create table if not exists employees"
					+ "(emp_no int primary key, "
					+ "emp_name varchar(100),"
					+ "salary double)";
			st.executeUpdate(createT);
			System.out.println("Table Created Successfully");
			
			String insert="insert into employees"
					+ "(emp_no,emp_name,salary)"
					+ "values(?,?,?)";
			PreparedStatement pst=con.prepareStatement(insert);
			pst.setInt(1, 1010);
			pst.setString(2, "Shailesh");
			pst.setDouble(3, 12349.59);
			pst.executeUpdate();
			
			pst.setInt(1, 102);
			pst.setString(2, "Omkar");
			pst.setDouble(3, 34569.87);
			pst.executeUpdate();
			
			pst.setInt(1, 103);
			pst.setString(2, "Hrutik");
			pst.setDouble(3, 98765.97);
			pst.executeUpdate();
			
			pst.setInt(1, 104);
			pst.setString(2, "Himanshu");
			pst.setDouble(3, 34567.97);
			pst.executeUpdate();
			
			pst.setInt(1, 105);
			pst.setString(2, "Yash");
			pst.setDouble(3, 37382.54);
			pst.executeUpdate();
			
			System.out.println("records inserted successfully");
			con.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
