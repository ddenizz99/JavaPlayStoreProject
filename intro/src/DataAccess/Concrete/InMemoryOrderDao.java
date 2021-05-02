package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.OrderDao;
import Entities.Concrete.Order;

public class InMemoryOrderDao implements OrderDao{

	private List<Order> data = new ArrayList<Order>();

	@Override
	public void add(Order entity) {
		// TODO Auto-generated method stub
		this.data.add(entity);
		
	}

	@Override
	public void update(Order entity) {
		// TODO Auto-generated method stub
		var order = this.getById(entity.id);
		order.userId = entity.userId;
		order.productId = entity.productId;
		order.campaignId = entity.campaignId;
		order.totalPrice = entity.totalPrice;
	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub
		var order = this.getById(entity.id);
		this.data.remove(entity);
	}

	@Override
	public Order getById(int id) {
		// TODO Auto-generated method stub
		var order = this.data.stream()
				.filter((o) -> o.id == id)
				.findFirst().orElse(new Order(0,0,0,0,0));
		return order;
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return data;
	}

}
