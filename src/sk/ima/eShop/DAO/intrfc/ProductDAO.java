package sk.ima.eShop.DAO.intrfc;


import java.util.List;

import sk.ima.eShop.beans.Product;

public interface ProductDAO {

	public List<Product> getAllProducts();
	public Product getProduct(int id);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	public void addProduct(Product product);

}
