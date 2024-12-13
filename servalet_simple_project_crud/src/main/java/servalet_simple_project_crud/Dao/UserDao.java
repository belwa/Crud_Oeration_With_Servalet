package servalet_simple_project_crud.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

import servalet_simple_project_crud.Connection.UserConnection;
import servalet_simple_project_crud.Dto.User;



public class UserDao {
	
	Connection connection = UserConnection.getConnection();
	
	private final String INSERTQUERY =  "insert into registrationform(id, name, email, dob, gender, password)values(?, ?, ?, ?,?, ?);";
	private final  String USEREMAILQUERY = "select * from registrationform where email = ?";
	public User saveDao(User user) {

		try {
		PreparedStatement	ps = connection.prepareStatement(INSERTQUERY);
		ps.setInt(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getEmail());
		ps.setObject(4, user.getDob());
		ps.setString(5, user.getGender());
		ps.setString(6, user.getPassword());
		
		int a = ps.executeUpdate();
		return a!=0?user:null;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;

		}
	}
	
	public User getUserEmailDao(String userEmail) {
		
		try {
			PreparedStatement ps = connection.prepareStatement(USEREMAILQUERY);
			ps.setString(1, userEmail);
			ResultSet set = ps.executeQuery();
			while(set.next()) {
				String email = set.getString("email");
				String password = set.getString("password");
				return new User(email, password);
			}
			
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}


	
	