package sk.ima.eShop.DAO;

import java.util.ArrayList;
import java.util.List;
import sk.ima.eShop.DAO.intrfc.ProductDAO;
import sk.ima.eShop.beans.Product;
import java.sql.*;

public class ProductDaoImpl implements ProductDAO {

	List<Product> products = new ArrayList<Product>();

	public ProductDaoImpl() {
	}

	@Override
	public void getAllProducts() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}
		Connection connection = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
			Statement statement = connection.createStatement();
			rs = statement.executeQuery("Select * FROM `product`");

			while (rs.next()) {

				int id = rs.getInt("product_id");
				String name = rs.getString("name");
				double price = rs.getDouble("price");

				System.out.print(", Product: " + name);
				System.out.println("," + price + "e");
				System.out.print("(id: " + id + ")");
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

	@Override
	public Product getProduct(int id) {
		return products.get(id);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
	}

	@Override
	public void addProduct(String productName, double productPrice) throws SQLException {
		boolean a = true;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select name from product");
			while (result.next()) {

				if (result.getString("name").equals(productName)) {
					System.out.println("This product already exists.");
					a = false;
					break;
				}
			}
			if (a) {
				statement.executeUpdate("INSERT INTO `product` (`product_id`, `name`,`price`) VALUES (NULL, '"
						+ productName + "', '" + productPrice + "');");
			}
			connection.close();
		} catch (SQLException sx) {
			System.out.println("SQLException: " + sx.getMessage());
			System.out.println("SQLState: " + sx.getSQLState());
			System.out.println("VendorError: " + sx.getErrorCode());
		}
	}

	@Override
	public void deleteProduct1(int id) throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/eshop?user=root&password=");
			Statement statement = connection.createStatement();
			statement.executeUpdate("DELETE FROM `product` where product_id ='" + id + "' ;");
			connection.close();
		} catch (SQLException sx) {
			System.out.println("SQLException: " + sx.getMessage());
			System.out.println("SQLState: " + sx.getSQLState());
			System.out.println("VendorError: " + sx.getErrorCode());
		}
		{
		}
	}
}