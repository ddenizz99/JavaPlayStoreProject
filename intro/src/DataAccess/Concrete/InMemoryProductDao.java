package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DataAccess.Abstract.ProductDao;
import Entities.Concrete.Customer;
import Entities.Concrete.Product;

public class InMemoryProductDao implements ProductDao {
	
	private List<Product> data = new ArrayList<Product>();

	public InMemoryProductDao() {

		data.add(new Product(1,"Araba",350000,12));
		data.add(new Product(2,"Motor",12000,1));
		data.add(new Product(3,"Bisiklet",2500,31));
		data.add(new Product(4,"PS5",7890,22));
		data.add(new Product(5,"Ekran Kartı",4596,12));
	}

	@Override
	public void add(Product entity) {
		data.add(entity);
	}

	@Override
	public void update(Product entity) {
		var product = this.getById(entity.id);		
		product.productName = entity.productName;
		product.unitPrice = entity.unitPrice;
		product.unitsInStock = entity.unitsInStock;
	}

	@Override
	public void delete(Product entity) {
		var product = this.getById(entity.id);
		this.data.remove(product);
	}

	@Override
	public Product getById(int id) {
		var product = this.data.stream()
				.filter((p) -> p.id == id)
				.findFirst().orElse(new Product(0,"",0,0));
		return product;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return data;
	}

}
