package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCExample {

	public static void main(String[] args) {

		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loaded");
			} catch (ClassNotFoundException e) {
				System.out.println("Can not find driver class");
			}
			
			Connection conn = null;
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/com?useSSL=false", "com", "com01" );
				System.out.println("connected");
			
				try (PreparedStatement delete = conn.prepareStatement("delete from customer")) {
					delete.executeUpdate();
				}

				int[] id = { 1, 2, 3 };
				String[] name = { "KIM", "PARK", "LEE" };
				String[] addr = { "Seoul", "Incheon", "Daejeon" };
			
				String sql = "INSERT INTO customer (id, name, addr) VALUES ( ?, ?, ? )";
			
				PreparedStatement pstmt = conn.prepareStatement(sql);
			
				for(int i=0; i < id.length; i++) {
					pstmt.setInt(1, id[i]);
					pstmt.setString(2, name[i]);
					pstmt.setString(3, addr[i]);
					pstmt.executeUpdate();
				}
				

			PreparedStatement select = conn.prepareStatement("SELECT id, name, addr FROM customer");
			ResultSet rset = select.executeQuery();
			
			while(rset.next()) {
				System.out.println("id: " + rset.getInt(1));
				System.out.println("name: " + rset.getString(2));
				System.out.println("addr: " + rset.getString(3));
			}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				if(conn != null) try {conn.close();} catch (SQLException e) {}
			}
	}
}
