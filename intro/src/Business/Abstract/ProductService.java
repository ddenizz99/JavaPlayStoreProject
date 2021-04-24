package Business.Abstract;

import java.util.List;

import Entities.Concrete.Product;

public interface ProductService {
	public void add(Product product);
	public void update(Product product);
	public void delete(Product product);
	public Product getById(int id);
	public List<Product> getAll();
}
