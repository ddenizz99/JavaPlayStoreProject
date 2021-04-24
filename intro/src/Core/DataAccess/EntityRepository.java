package Core.DataAccess;

import java.util.List;

import Entities.Abstract.Entity;

public interface EntityRepository<T extends Entity>{
	public void add(T entity);
	public void update(T entity);
	public void delete(T entity);
	public T getById(int id);
	public List<T> getAll();
}
