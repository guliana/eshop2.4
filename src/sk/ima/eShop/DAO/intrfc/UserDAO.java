package sk.ima.eShop.DAO.intrfc;

import java.sql.SQLException;

public interface UserDAO {
	
	public void addUser(int id, String login, String password, String firstName, String surname, String address, String email)
			throws SQLException;
	
	public void getAllUsers() throws SQLException; 
	//public void userChecking() throws SQLException;
	
}
