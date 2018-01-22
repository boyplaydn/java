package vn.edu.vnuk.jdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import vn.edu.vnuk.jdbc.ConnectionFactory;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		try {
			Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Connection is open!");
			
				connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("done!");
		}
	}

}
