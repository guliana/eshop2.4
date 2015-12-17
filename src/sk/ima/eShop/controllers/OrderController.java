package sk.ima.eShop.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sk.ima.eShop.DAO.OrderDaoImpl;
import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Order;
import sk.ima.eShop.beans.Product;

public class OrderController {

	OrderDaoImpl orde = new OrderDaoImpl();

	static private ProductDaoImpl prod;
	private OrderDaoImpl orderDaoImpl;

	Scanner sc = new Scanner(System.in);
	// List<Product> order = new ArrayList<Product>();
	// List<Order> orders = orde.getAllOrders();
	// List<Order> productOrder = new ArrayList<Order>();

	public OrderController(OrderDaoImpl orderDaoImpl, ProductDaoImpl productDaopImpl) {
		this.orderDaoImpl = orderDaoImpl;

	}

	public OrderController() {
	}

	public void addOrder() {
		int id = 1;
		int amount = 0;
		int count = 0;
		System.out.println("How many products do you wanna add?");
		count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Select product by its id");
			int id1 = sc.nextInt();
			System.out.println("Enter a number of selected product ");
			amount = sc.nextInt();
			Order o = new Order();

			List<Product> products = ProductController.prod.getAllProducts();
			Product b = null;
			for (Product product : products) {
				if (product.getId() == id1) {
					b = (product);
					// Order order = new Order(id, b);
					for (int i1 = 0; i1 < amount; i1++) {
						o.addProduct(b);
						// orde.addOrder(order);
					}
				}
			}
		}
	}

	public void getOrders() {
		System.out.println(orde.getAllOrders().toString());

	}
}
