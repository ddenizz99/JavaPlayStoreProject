package Business.Abstract;

import java.util.List;

import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Entities.Concrete.Product;

public interface ProductService {
	IResult add(Product product);
	IResult update(Product product);
	IResult delete(Product product);
	IDataResult<Product> getById(int id);
	IDataResult<List<Product>> getAll();
}
