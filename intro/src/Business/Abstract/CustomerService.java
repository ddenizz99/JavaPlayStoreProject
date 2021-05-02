package Business.Abstract;

import java.util.List;

import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Entities.Concrete.Customer;

public interface CustomerService {
	IResult add(Customer customer);
	IResult update(Customer customer);
	IResult delete(Customer customer);
	IDataResult<Customer> getById(int id);
	IDataResult<List<Customer>> getAll();
}
