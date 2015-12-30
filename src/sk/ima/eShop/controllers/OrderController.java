package sk.ima.eShop.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sk.ima.eShop.DAO.OrderDaoImpl;
import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Order;
import sk.ima.eShop.beans.Product;
import sk.ima.eShop.beans.User;

public class OrderController {

	OrderDaoImpl orderDaoImplOBJECT = new OrderDaoImpl();
	User user = new User();

	static private ProductDaoImpl productDaoObject;
	private OrderDaoImpl orderDaoImpl;

	Scanner sc = new Scanner(System.in);

	public OrderController(OrderDaoImpl orderDaoImpl, ProductDaoImpl productDaopImpl) {
		this.orderDaoImpl = orderDaoImpl;
	}

	public OrderController() {
	}

	public void addOrder(Product product) throws SQLException {
		//String login = user.getLogin();
		//int count = 0;
		//Order o = new Order();
		//System.out.println("How many products do you wanna add?");
		//count = sc.nextInt();
		//for (int i = 0; i < count; i++) {
			System.out.println("Select product to order by its id");
			int id1 = sc.nextInt();
			orderDaoImpl.addOrder();
			// List<Product> products =
			// ProductController.productDaoObject.getAllProducts();
			//Product b = null;
			// for (Product product : products) {
			// if (product.getId() == id1) {
			// b = (product);
			// o.addProduct(b);
			// orderDaoImplOBJECT.addOrder(o);
		}

	public void getOrders() {
		orderDaoImplOBJECT.getAllOrders();
	}
}
