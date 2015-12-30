package sk.ima.eShop.beans;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int id;
	private int productCount;
	private double totalPrice;
	private Product product;
	
	private List<Product> order = new ArrayList<>();

	public Order() {
	}
	
	public Order(Product product) {
		super();
		this.product = product;
		
	}

	public Order(int id, List<Product> products) {
		this.id = id;
		order = products;
	}
	
	public Order(int id, Product product) {
		this.id = id;
		order.add(product);

	}

	public int getId() {
		return id;
	}
	
	public void addProduct(Product p)
	{
		order.add(p);
	}
	
	public void setProducts(List<Product> products) {
		this.order = products;
	}

	public List<Product> getProducts() {
		return order;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrize(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String toString() {
		return order.toString();

	}
}