package sk.ima.eShop.controllers;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Product;

public class ProductController {

	Scanner sc = new Scanner(System.in);

	int id = 1;

	ProductDaoImpl prod = new ProductDaoImpl();

	public ProductController() {
	}

	public void addProduc() {
		System.out.println("Add product name");
		String productName = sc.next();
		try {
			System.out.println("Add product price");
			sc.useLocale(Locale.US);
			double productPrice = sc.nextDouble();
			System.out.println("Your product was added to Product list");
			Product product = new Product(id, productName, productPrice);
			prod.addProduct(product);
			// System.out.println(prod.toString());
			id++;
		} catch (Exception e) {
			System.out.println(
					"!!Your product has not been added to ProductList!!\n!!You have to write price in a number format!!");
		}
	}

	public void removeProduct() {
		System.out.println("Select product to remove by its id");
		id = sc.nextInt();
		Product a = null;
		List<Product> products = prod.getAllProducts();
		System.out.println(products.size());
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
