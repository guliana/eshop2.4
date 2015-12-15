package sk.ima.eShop.DAO.intrfc;

import java.util.List;

import sk.ima.eShop.beans.Order;

public interface OrderDAO {
	public List<Order> getAllOrders();
	public Order getOrder(int id);
	public void updateOrder(Order order);
	public void deleteOrder(Order order);
	public void addOrder(Order order);
}
