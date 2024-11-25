package demo.mockitotesting1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserInterfaceImplement implements UserRepository {
		    private String jdbcUrl = "jdbc:mysql://localhost:3306/yourdatabase";
	    private String username = "username123";
	    private String password = "password";

	    private Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(jdbcUrl, username, password);
	    }

	    @Override
	    public void save(Student student) {
	        String query = "INSERT INTO students (id, name) VALUES (?, ?)";
	        try (Connection conn = getConnection();
	             PreparedStatement stmt = conn.prepareStatement(query)) {
	            stmt.setString(1, student.getId()); 
	            stmt.setString(2, student.getName());
	            stmt.executeUpdate();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }	    }

		@Override
		public Student findById(String id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<Student> findAll() {
			// TODO Auto-generated method stub
			return null;
		}
	}


