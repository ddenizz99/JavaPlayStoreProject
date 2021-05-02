package Business.Abstract;

import java.util.List;

import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Entities.Concrete.Order;

public interface OrderService {
	IResult add(Order order);
	IResult update(Order order);
	IResult delete(Order order);
	IDataResult<Order> getById(int id);
	IDataResult<List<Order>> getAll();
}
