package sk.ima.eShop;

import java.util.Locale;
import java.util.Scanner;

import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.Order;
import sk.ima.eShop.beans.Product;
import sk.ima.eShop.controllers.OrderController;
import sk.ima.eShop.controllers.ProductController;



public class EshopView {
	ProductDaoImpl prod = new ProductDaoImpl();
	ProductController prod1 = new ProductController();
	OrderController order1 = new OrderController();
	
	Scanner sc = new Scanner(System.in);
	int id = 1;
	
	public static void main(String[] args) {
		EshopView eshop = new EshopView();
		eshop.setChoice();
			}
	
	public void setChoice() {

		String choice = new String();

		while (choice != "6") {
			System.out.println(
					"Welcome!\nFor action press number:\n1) Add product\n2) Remove product\n3) Show all products\n4) Make an order\n5) Show all orders\n6) Quit application");
			choice = sc.nextLine();
			switch (choice) {

			case "1":
				prod1.addProduct();
				break;
			case "2":
				prod1.removeProduct(id);
				break;
			case "3":
				prod1.getProducts();
				break;
			case "4":
				order1.addOrder();
				break;
			case "5":
				order1.getOrders();
				break;
			case "6":
				System.out.println("Goodbye");
				break;
			}
		}
	}

}
