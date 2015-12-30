package sk.ima.eShop.beans;

public class Admin {
	private static String adminName;
	private static String password;

	Admin() {
	}

	Admin(String name, String password) {
		this.adminName = name;
		this.password = password;
	}

	public String getName() {
		return adminName;
	}

	public void setName(String name) {
		this.adminName = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
