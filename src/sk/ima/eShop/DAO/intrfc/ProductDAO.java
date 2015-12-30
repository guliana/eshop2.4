package sk.ima.eShop.DAO.intrfc;


import java.sql.SQLException;
import java.util.List;

import sk.ima.eShop.beans.Product;

public interface ProductDAO {

	public void getAllProducts() throws SQLException;
	public Product getProduct(int id);
	public void updateProduct(Product product);

	public void addProduct(String name, double price) throws SQLException;

	public void deleteProduct1(int id) throws SQLException;

}
