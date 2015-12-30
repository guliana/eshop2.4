package sk.ima.eShop.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sk.ima.eShop.DAO.intrfc.OrderDAO;
import sk.ima.eShop.beans.Order;
import sk.ima.eShop.beans.Product;
import sk.ima.eShop.beans.User;

public class OrderDaoImpl implements OrderDAO {
	User user = new User();
	

	List<Order> orders= new ArrayList<Order>(); 
	
	
	public OrderDaoImpl() {
		
	}

	@Override
	public Order getOrder(int id) {
		return orders.get(id);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(Order order) {
		orders.remove(order);
		
	}

	@Override
	public void addOrder() throws SQLException {
		String login= user.getLogin();
			//boolean a = true;
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
			} catch (Exception ex) {
			}
			Connection connection = null;
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
				Statement statement = connection.createStatement();
				ResultSet result = statement.executeQuery("select name from product");
				statement.executeUpdate("INSERT INTO `orders` (`order_id`, `login`) VALUES (NULL, '"
							+ login + "', ');");
				
				connection.close();
			} catch (SQLException sx) {
				System.out.println("SQLException: " + sx.getMessage());
				System.out.println("SQLState: " + sx.getSQLState());
				System.out.println("VendorError: " + sx.getErrorCode());
			}
		}
		

	@Override
	public List<Order> getAllOrders() {
		return orders;
	}

//	@Override
//	public List<Order> getAllOrders() {
//		// TODO Auto-generated method stub
//		return null;
//	}

/*	@Override
	public List<Product> addOrder() {
		// TODO Auto-generated method stub
		return orders.add;
	}
*/
}
