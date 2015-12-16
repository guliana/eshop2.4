package sk.ima.eShop.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sk.ima.eShop.DAO.OrderDaoImpl;
import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Order;
import sk.ima.eShop.beans.Product;

public class OrderController {
	//ProductDaoImpl prod = new ProductDaoImpl();
	OrderDaoImpl orde = new OrderDaoImpl();
	ProductController prod2 = new ProductController();
	//Product product = new Product();

		private ProductDaoImpl prod;
		private OrderDaoImpl orderDaoImpl;
		
		Scanner sc = new Scanner(System.in);
		List<Product> order = new ArrayList<Product>();
		List<Order> orders = orde.getAllOrders();
		//List<Order> productOrder = new ArrayList<Order>();

	public OrderController(OrderDaoImpl orderDaoImpl, ProductDaoImpl productDaopImpl) {
		this.orderDaoImpl = orderDaoImpl;
		//this.productDaoImpl = productDaoImpl;
	}

	public OrderController() {
	}

	public void addOrder() {
		System.out.println("Select product by its id");
		int id = sc.nextInt();
		Product a = null;
		List<Product> products = prod.getAllProducts();
		System.out.println(products.size());
		for (Product product : products) {
			if (product.getId() == id) {
				System.out.println(product);
				a = (product);
			}
		}
		order.add(a);
		//orde.addOrder(order);
		//prod.deleteProduct(a);
		//productOrder.add(order); //
		//treba produkt pridat do objednavky a objednavku do zoznamu objednavok"!
	}
	
		/*System.out.println("Select product by its id");
		int id2 = sc.nextInt();
		List<Product> products = prod.getAllProducts();
		System.out.println(products.size());
		
		List<Order> orders = orde.getAllOrders();
	
		for (Product product : products) {
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
			}*/
		
	
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
