package Business.Concrete;

import java.util.List;

import Business.Abstract.OrderService;
import Core.Utilities.Results.ErrorDataResult;
import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Core.Utilities.Results.SuccessDataResult;
import Core.Utilities.Results.SuccessResult;
import DataAccess.Abstract.OrderDao;
import Entities.Concrete.Order;

public class OrderManager implements OrderService{

	private OrderDao orderDao;
	
	public OrderManager(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public IResult add(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.add(order);
		return new SuccessResult("Sipariş alındı.");
	}

	@Override
	public IResult update(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.update(order);
		return new SuccessResult("Sipariş güncellendi.");
	}

	@Override
	public IResult delete(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.delete(order);
		return new SuccessResult("Sipariş silindi.");
	}

	@Override
	public IDataResult<Order> getById(int id) {
		// TODO Auto-generated method stub
		var order = this.orderDao.getById(id);
		if (order.id == 0) {
			return new ErrorDataResult<Order>("Böyle bir sipariş yok.");
		}
		return new SuccessDataResult<Order>(order);
	}

	@Override
	public IDataResult<List<Order>> getAll() {
		// TODO Auto-generated method stub
		var orders = this.orderDao.getAll();
		if (orders.size() <= 0) {
			return new ErrorDataResult<List<Order>>("Sipariş bulunmuyor.");
		}
		return new SuccessDataResult<List<Order>>(orders);
	}

}
