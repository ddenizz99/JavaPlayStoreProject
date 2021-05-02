package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataAccess.Abstract.CustomerDao;
import Entities.Concrete.Customer;

public class InMemoryCustomerDao implements CustomerDao{

	private List<Customer> data = new ArrayList<Customer>();

	public InMemoryCustomerDao() {

		data.add(new Customer(1,"Ali","Veli", new Date(),"24897658421"));
		data.add(new Customer(2,"Ayşe","Ali", new Date(),"98745869514"));
		data.add(new Customer(3,"Buse","Kaya", new Date(),"98563214758"));
	}
	
	@Override
	public void add(Customer entity) {
		// TODO Auto-generated method stub
		this.data.add(entity);
		
	}

	@Override
	public void update(Customer entity) {
		// TODO Auto-generated method stub
		var customer = this.getById(entity.id);
		customer.firstName = entity.firstName;
		customer.lastName = entity.lastName;
		customer.dateOfBirdh = entity.dateOfBirdh;
		customer.nationalityId = entity.nationalityId;
	}

	@Override
	public void delete(Customer entity) {
		// TODO Auto-generated method stub
		var customer = this.getById(entity.id);
		this.data.remove(customer);
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		var customer = this.data.stream()
				.filter((user) -> user.id == id)
				.findFirst().orElse(new Customer(0,"","", new Date(),""));
		return customer;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return this.data;
	}

}
