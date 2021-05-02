package Business.Concrete;

import java.util.List;

import Business.Abstract.CustomerService;
import Business.Adapters.PersonService.PersonService;
import Core.Utilities.Results.ErrorDataResult;
import Core.Utilities.Results.ErrorResult;
import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Core.Utilities.Results.SuccessDataResult;
import Core.Utilities.Results.SuccessResult;
import DataAccess.Abstract.CustomerDao;
import Entities.Concrete.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;
	private PersonService personService;

	public CustomerManager(CustomerDao customerDao, PersonService personService) {
		this.customerDao = customerDao;
		this.personService = personService;
	}

	@Override
	public IResult add(Customer customer) {
		// TODO Auto-generated method stub
		var checkIfRealPerson = personService.VerifyCid(customer);
		if (!checkIfRealPerson) {
			return new ErrorResult("TC Kimlik doğrulanamadı.");
		}
		this.customerDao.add(customer);
		return new SuccessResult("Müşteri Eklendi");
	}

	@Override
	public IResult update(Customer customer) {
		// TODO Auto-generated method stub
		this.customerDao.update(customer);
		return new SuccessResult("Müşteri Güncellendi");
	}

	@Override
	public IResult delete(Customer customer) {
		// TODO Auto-generated method stub
		this.customerDao.delete(customer);
		return new SuccessResult("Müşteri Silindi");
	}

	@Override
	public IDataResult<Customer> getById(int id) {
		// TODO Auto-generated method stub
		var customer = this.customerDao.getById(id);
		if (customer.id == 0) {
			return new ErrorDataResult<Customer>("Böyle bir kayıt yok.");
		}
		return new SuccessDataResult<Customer>(customer);
	}

	@Override
	public IDataResult<List<Customer>> getAll() {
		// TODO Auto-generated method stub
		var customers = this.customerDao.getAll();
		if (customers.size() <= 0) {
			return new ErrorDataResult<List<Customer>>("Sistemde kayıtlı müşteri bulunmuyor.");
		}
		return new SuccessDataResult<List<Customer>>(customers);
	}

}
