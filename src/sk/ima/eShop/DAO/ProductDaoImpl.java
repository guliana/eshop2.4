package sk.ima.eShop.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sk.ima.eShop.DAO.intrfc.ProductDAO;
import sk.ima.eShop.beans.Product;

public class ProductDaoImpl implements ProductDAO {
	
	List<Product> products = new ArrayList<Product>();

	public ProductDaoImpl() {
			}

	@Override
	public List<Product> getAllProducts() {
		return products;
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
	public void addProduct(Product product) {
		products.add(product);
	}

	@Override
	public void deleteProduct(Product product) {
		products.remove(product);
		
	}


}
