package sk.ima.eShop.beans;

import java.util.List;

public class Order {
	private int id;
	private int productCount;
	private double totalPrice;
	private Product product;
	private List<Product> products;

	public Order() {
	}

	public Order(int id, Product product) {
		this.id = id;
		this.product = product;

	}

	public int getId() {
		return id;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Product> getProducts() {
		return products;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
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
		return " " + product;

	}
}