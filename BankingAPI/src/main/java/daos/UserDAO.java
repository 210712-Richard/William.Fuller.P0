package daos;

import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements Dao<User> {

	public UserDAO(Connection connection) {
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User d) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User d, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User d) {
		// TODO Auto-generated method stub
		
	}
	
//	interface UserDAO{
//		List<User> findaAll();
//		List<User> findById();
//		List<User> findByName();
//		boolean insertUser(User user);
//		boolean updateUser(User user);
//		boolean deleteUser (User user);
//	}

}
