package sk.ima.eShop.controllers;

import java.util.List;
import java.util.Scanner;

import sk.ima.eShop.DAO.OrderDaoImpl;
import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Order;
import sk.ima.eShop.beans.Product;

public class OrderController {
	ProductDaoImpl prod = new ProductDaoImpl();
	OrderDaoImpl orde = new OrderDaoImpl();
	ProductController prod2 = new ProductController();
	Product product = new Product();

	Scanner sc = new Scanner(System.in);

	private OrderDaoImpl orderDaoImpl;

	public OrderController(OrderDaoImpl orderDaoImpl) {
		this.orderDaoImpl = orderDaoImpl;
	}

	public OrderController() {
	}

	public void addOrder() {
		List<Product> pr= prod.getAllProducts();
		System.out.println(pr.size());
		System.out.println("Select product by its id");
		 int id2 = sc.nextInt();
		List<Order> orders = orde.getAllOrders();
	
		for (Product product : pr) {
			//for (int i = 0; i < products.size(); i++) {
				System.out.println("gffffffffffffffffffffffff");
			
			if (product.getId() == id2) {
				Order ord = new Order(product.getId(), product);
				orders.add(ord);	
				System.out.println(orders);
				orde.addOrder(ord);
				
				System.out.println("Your order: " + orde.toString());
			}
			}
		}
	
		// for (Product product : products) {
		/*
		 * if (id2 == product.getId()) { Order two = new Order(product.getId(),
		 * product); orders.add(two); allOrders.add(product);
		 * System.out.println("Your order: " + orders.toString()); }
		 * System.out.println("kolko?"); int productCount = sc.nextInt(); double
		 * totalPrize = product.productPrize *productCount;
		 * //orders.add(product);
		 */ // for (Product product : products) {
		/*
		 * if (id2 == product.getId()) { /id = 1;
		 */
		// Order two = new Order(product.getId(), product);
		// orders.add(two);
		// allOrders.add(product);
		// System.out.println("Your order: " + orders.toString());
		// }
	

	public List<Order> getOrders() {
		System.out.println(orde.getAllOrders().toString());
		return null;
	}
}
