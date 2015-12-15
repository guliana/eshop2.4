package sk.ima.eShop.controllers;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Product;

public class ProductController {
	Product product = new Product();

	Scanner sc = new Scanner(System.in);

	ProductDaoImpl prod = new ProductDaoImpl();

	private ProductDaoImpl productDaoImpl;

	public ProductController(ProductDaoImpl productDaoImpl) {
		this.productDaoImpl = productDaoImpl;
	}

	public ProductController() {
	}

	int id = 1;

	public void addProduct() {

		System.out.println("Add product name");
		String productName = sc.next();
		System.out.println("Add product price");
		sc.useLocale(Locale.US);
		double productPrice = sc.nextDouble();
		System.out.println("Your product was added to Product list");
		Product product = new Product(id, productName, productPrice);
		prod.addProduct(product);
		id++;
	}

	public void removeProduct(int id)  {
		System.out.println("Select product to remove by its id");
		id = sc.nextInt();
		List<Product> products = prod.getAllProducts();
					  for (Product product : products) { 
				  if (product.getId() == id) {
					  prod.deleteProduct(product);
					}
			  }
	}

	public List<Product> getProducts() {
		System.out.println(prod.getAllProducts().toString());
		return null;
	}

}
