package sk.ima.eShop.controllers;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Product;

public class ProductController {

	Scanner sc = new Scanner(System.in);

	int id = 1;

	public static ProductDaoImpl productDaoObject = new ProductDaoImpl();

	public ProductController() {
	}

	public void addProduc() throws SQLException {
		System.out.println("Add product name");
		String productName = sc.next();
		System.out.println("Add product price");
		sc.useLocale(Locale.US);
		double productPrice = sc.nextDouble();
		productDaoObject.addProduct(productName, productPrice);
		id++;
	}

	public void removeProduct(int id) throws SQLException {
		System.out.println("Select product to remove by its id");
		id = sc.nextInt();
		productDaoObject.deleteProduct1(id);
	}
	
	public void getProducts() throws SQLException {
		productDaoObject.getAllProducts();
		}
}
