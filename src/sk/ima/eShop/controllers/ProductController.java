package sk.ima.eShop.controllers;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Product;

public class ProductController {

	Scanner sc = new Scanner(System.in);

	int id = 1;

	public static ProductDaoImpl prod = new ProductDaoImpl();

	public ProductController() {
	}

	public void addProduc() {
		System.out.println("Add product name");
		String productName = sc.next();
		System.out.println("Add product price");
		double productPrice = sc.nextDouble();
		sc.useLocale(Locale.US);
		// System.out.println("!!Your product has not been added to
		// ProductList!!\n!!You have to write price in a number format!!");
		System.out.println("Your product was added to Product list");
		Product product = new Product(id, productName, productPrice);
		prod.addProduct(product);
		id++;

	}

	public void removeProduct() {
		System.out.println("Select product to remove by its id");
		id = sc.nextInt();
		Product a = null;
		List<Product> products = prod.getAllProducts();
		for (Product product : products) {
			if (product.getId() == id) {
				System.out.println(product);
				a = (product);
			}
		}
		prod.deleteProduct(a);
	}

	public List<Product> getProducts() {
		System.out.println(prod.getAllProducts().toString());
		return null;
	}

}
