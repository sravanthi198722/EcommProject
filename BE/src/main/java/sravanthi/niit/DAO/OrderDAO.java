package sravanthi.niit.DAO;

import sravanthi.niit.Model.OrderDetail;

public interface OrderDAO {
	public boolean payment(OrderDetail orderDetail);
	public boolean CartItemStatus(String username, int orderId);

}
