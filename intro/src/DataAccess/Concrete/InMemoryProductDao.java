package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.ProductDao;
import Entities.Concrete.Product;

public class InMemoryProductDao implements ProductDao {
	
	private List<Product> data = new ArrayList<Product>();

	public InMemoryProductDao() {

		data.add(new Product(1,"Araba",350000,12));
		data.add(new Product(2,"Motor",12000,1));
		data.add(new Product(3,"Bisiklet",2500,31));
		data.add(new Product(4,"PS5",7890,22));
		data.add(new Product(5,"Ekran Kartý",4596,12));
	}

	@Override
	public void add(Product entity) {
		data.add(entity);
		System.out.println("Ürün Eklendi");
	}

	@Override
	public void update(Product entity) {
		System.out.println("Ürün Güncellendi");
		
	}

	@Override
	public void delete(Product entity) {
		System.out.println("Ürün Silindi");
		
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return data;
	}

}
