package sk.ima.eShop;

import java.sql.SQLException;
import java.util.Scanner;

import sk.ima.eShop.DAO.ProductDaoImpl;
import sk.ima.eShop.beans.User;
import sk.ima.eShop.controllers.OrderController;
import sk.ima.eShop.controllers.ProductController;
import sk.ima.eShop.controllers.UserController;

public class EshopView {
	ProductDaoImpl prod = new ProductDaoImpl();
	ProductController productControllerObject = new ProductController();
	UserController userControllerObject = new UserController();
	OrderController order1 = new OrderController();

	Scanner sc = new Scanner(System.in);
	int id = 1;
	static EshopView eshop = new EshopView();

	/*
	 * public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver"; public
	 * static final String DB_URL = "jdbc:mysql://localhost/eshop"; public
	 * static final String USER = "root"; public static final String PASS = "";
	 */
	public static void main(String[] args) throws Exception {
		// Class.forName(JDBC_DRIVER);
		eshop.signIn();
		// eshop.setChoice();
		// eshop.chooseChoise1();
	}

	public void signIn() throws SQLException {
		System.out.println("WELCOME!!\nFor SIGN IN press 1\nFor Free REGISTRATION press 2");
		int x = sc.nextInt();
		if (x == 1) {
			System.out.println("Please, enter your login and password\nLOGIN:");
			String login = sc.next();
			System.out.println("PASSWORD: ");
			String password = sc.next();
			if (login.equals("admin") && password.equals("admin123")) {
				eshop.setChoice();
			} else
				//userControllerObject.userCheck();
				eshop.chooseChoise1();
		} else if (x == 2) {
			userControllerObject.addUser();
			eshop.signIn();
		}
	}

	public void chooseChoise1() throws SQLException {
		String choice1 = new String();
		while (choice1 != "6") {
			//System.out.println(
			//		"Welcome!\nFor action press number:\n1) Show all products\n2) Make an order\n3) Show your orders\n4) Quit application");
			System.out.println("Welcome!\nFor action press number:\n1) Show all products\n4) Quit application");
			choice1 = sc.nextLine();
			switch (choice1) {
			case "1":
				productControllerObject.getProducts();
				break;
			case "2":
				order1.addOrder(null);
				break;
			case "3":
				order1.getOrders();
				break;
			case "4":
				System.out.println("Goodbye");
				break;
			}
		}
	}

	public void setChoice() throws SQLException {
		String choice = new String();
		while (choice != "6") {
			//System.out.println(
				//	"Welcome!\nFor action press number:\n1) Add product\n2) Remove product\n3) Show all products\n4) Show all orders\n5) Show all users\n6) Quit application");
			System.out.println(
					"Welcome!\nFor action press number:\n1) Add product\n2) Remove product\n3) Show all products\n5) Show all users\n6) Quit application");
			choice = sc.nextLine();
			switch (choice) {
			case "1":
				productControllerObject.addProduc();
				break;
			case "2":
				productControllerObject.removeProduct(id);
				break;
			case "3":
				productControllerObject.getProducts();
				break;
			case "4":
				order1.getOrders();
				break;
			case "5":
				userControllerObject.getUsers();
			case "6":
				System.out.println("Goodbye");
				break;
			}
		}
	}
}
