package Business.Concrete;

import java.util.List;

import Business.Abstract.ProductService;
import DataAccess.Abstract.ProductDao;
import Entities.Concrete.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		productDao.add(product);		
	}

	@Override
	public void update(Product product) {
		productDao.update(product);
	}

	@Override
	public void delete(Product product) {
		productDao.delete(product);
	}

	@Override
	public Product getById(int id) {
		// TODO Auto-generated method stub
		return new Product(6,"Bilgisayar",13223,3);
	}

	@Override
	public List<Product> getAll() {
		return productDao.getAll();
	}

}
