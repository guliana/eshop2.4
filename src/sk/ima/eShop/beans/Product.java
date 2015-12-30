package sk.ima.eShop.beans;

public class Product {
	private int id;
	private String productName;
	private double productPrice;

	public Product(int id, String productName, double productPrice) {
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrize(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product " + productName + ", " + productPrice + "e (id." + id + ")";
	}

}
