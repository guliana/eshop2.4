package sk.ima.eShop.controllers;

import java.sql.SQLException;
import java.util.Scanner;

import sk.ima.eShop.DAO.UserDaoImpl;
import sk.ima.eShop.beans.User;

public class UserController {

	Scanner sc = new Scanner(System.in);
	int id = 1;
	
	UserDaoImpl userDaoimplObject = new UserDaoImpl();
	
	public void addUser () throws SQLException {
		System.out.println("Please, enter your LOGIN:");
		String login = sc.nextLine();
		System.out.println("Please, enter your PASSWORD: ");
		String password = sc.nextLine();
		System.out.println("Please, enter your First name:");
		String firstName = sc.nextLine();
		System.out.println("Please, enter your Surname:");
		String surname = sc.nextLine();
		System.out.println("Please, enter your Address:");
		String address = sc.nextLine();
		System.out.println("Please, enter your Email:");
		String email = sc.nextLine();
		userDaoimplObject.addUser(id, login, password, firstName, surname, address, email);
		id++;
	}
	
	public void getUsers() throws SQLException {
		userDaoimplObject.getAllUsers();
	}
	/*public void userCheck () throws SQLException {
		userDaoimplObject.userChecking();
	}*/
}





