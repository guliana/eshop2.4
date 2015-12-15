package sk.ima.eShop.DAO;

import java.util.ArrayList;
import java.util.List;

import sk.ima.eShop.DAO.intrfc.OrderDAO;
import sk.ima.eShop.beans.Order;

public class OrderDaoImpl implements OrderDAO {
	
	List<Order> orders= new ArrayList<Order>(); 
	
	public OrderDaoImpl() {
		
	}
	
	@Override
	public List<Order> getAllOrders() {
			return orders;
	}

	@Override
	public Order getOrder(int id) {
		return orders.get(id);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(Order order) {
		orders.remove(order);
		
	}

	@Override
	public void addOrder(Order order) {
		orders.add(order);
		
	}


}
