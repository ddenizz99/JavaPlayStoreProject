package Core.DataAccess;

import java.util.List;

import Entities.Abstract.Entity;

public class EntityRepositoryBase<TEntity extends Entity> implements EntityRepository<TEntity> {

	@Override
	public void add(TEntity entity) {
		System.out.println("Veritabanýna Kayýt Edildi.");		
	}

	@Override
	public void update(TEntity entity) {
		System.out.println("Güncellendi.");			
	}

	@Override
	public void delete(TEntity entity) {
		System.out.println("Silindi.");	
	}

	@Override
	public TEntity getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TEntity> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
