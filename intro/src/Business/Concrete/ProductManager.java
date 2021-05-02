package Business.Concrete;

import java.util.List;

import Business.Abstract.ProductService;
import Core.Utilities.Results.ErrorDataResult;
import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Core.Utilities.Results.SuccessDataResult;
import Core.Utilities.Results.SuccessResult;
import DataAccess.Abstract.ProductDao;
import Entities.Concrete.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public IResult add(Product product) {
		productDao.add(product);	
		return new SuccessResult("Ürün eklendi.");
	}

	@Override
	public IResult update(Product product) {
		productDao.update(product);
		return new SuccessResult("Ürün güncellendi.");
	}

	@Override
	public IResult delete(Product product) {
		productDao.delete(product);
		return new SuccessResult("Ürün silindi.");
	}

	@Override
	public IDataResult<Product> getById(int id) {
		// TODO Auto-generated method stub
		var product = productDao.getById(id);
		if (product.id == 0) {
			return new ErrorDataResult<Product>("Böyle bir ürün bulunmuyor.");
		}
		return new SuccessDataResult<Product>(product);
	}

	@Override
	public IDataResult<List<Product>> getAll() {
		var products = productDao.getAll();
		if (products.size() <= 0) {
			return new ErrorDataResult<List<Product>>("Sistemde kayıtlı ürün bulunmuyor.");
		}
		return new SuccessDataResult<List<Product>>(products);
	}

}
