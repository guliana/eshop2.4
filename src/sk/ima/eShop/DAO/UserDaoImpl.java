package sk.ima.eShop.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import sk.ima.eShop.EshopView;
import sk.ima.eShop.DAO.intrfc.UserDAO;

public class UserDaoImpl implements UserDAO {
	//EshopView eshop = new EshopView();

	@Override
	public void addUser(int id, String login, String password, String firstName, String surname, String address,
			String email) throws SQLException {
		boolean a = true;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select login from user");
			while (result.next()) {

				if (result.getString("login").equals(login)) {
					System.out.println("This user already exists, please use other login.");
					a = false;
					break;
				}
			}
			if (a) {
				statement.executeUpdate(
						"INSERT INTO `user` (`login`, `password`,`firstName`, `surname`, `address`, `email`) VALUES ('"
								+ login + "', '" + password + "', '" + firstName + "', '" + surname + "', '" + address
								+ "', '" + email + "')");
			}
			connection.close();
		} catch (SQLException sx) {
			System.out.println("SQLException: " + sx.getMessage());
			System.out.println("SQLState: " + sx.getSQLState());
			System.out.println("VendorError: " + sx.getErrorCode());
		}
	}

	@Override
	public void getAllUsers() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}
		Connection connection = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
			Statement statement = connection.createStatement();
			rs = statement.executeQuery("Select * FROM `user`");

			while (rs.next()) {

				int id = rs.getInt("user_id");
				String login = rs.getString("login");
				String password = rs.getString("password");
				String firstName = rs.getString("firstName");
				String surname = rs.getString("surname");
				String address = rs.getString("address");
				String email = rs.getString("email");

				System.out.print("User: " + login + "\n" + "\tPassword: " + password + "\n" + "\tName: " + firstName
						+ "\n" + "\tSurname: " + surname + "\n" + "\tAddress: " + address + "\n" + "\tEmail: " + email
						+ "\n");
			}
			connection.close();
		} catch (SQLException sx) {
			System.out.println("SQLException: " + sx.getMessage());
			System.out.println("SQLState: " + sx.getSQLState());
			System.out.println("VendorError: " + sx.getErrorCode());
		}
		{
		}
	}

	{

	}

/*	@Override
	public void userChecking() throws SQLException {
		boolean a = true;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}
		Connection connection = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
			Statement statement = connection.createStatement();
			rs = statement.executeQuery("Select * FROM `user`");
			String login = rs.getString("login");
			if (rs.getString("login").equals(login)) {
				eshop.chooseChoise1();
				a = false;
				break;
			}
			if (a) {
				System.out.println("You can see all products");
				statement.executeUpdate("Select * FROM `product`");
				while (rs.next()) {

					int id = rs.getInt("product_id");
					String name = rs.getString("name");
					double price = rs.getDouble("price");

					System.out.print(", Product: " + name);
					System.out.println("," + price + "e");
					System.out.print("(id: " + id + ")");
				}
			}
			System.out.println("If you want to make an order, you need to REGISTER");
			connection.close();
		} catch (SQLException sx) {
			System.out.println("SQLException: " + sx.getMessage());
			System.out.println("SQLState: " + sx.getSQLState());
			System.out.println("VendorError: " + sx.getErrorCode());
		}
	}*/
}
