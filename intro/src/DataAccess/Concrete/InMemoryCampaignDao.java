package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.CampaignDao;
import Entities.Concrete.Campaign;

public class InMemoryCampaignDao implements CampaignDao{

	private List<Campaign> data = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign entity) {
		// TODO Auto-generated method stub
		this.data.add(entity);
	}

	@Override
	public void update(Campaign entity) {
		// TODO Auto-generated method stub
		var campaign = this.getById(entity.id);
		campaign.description = entity.description;
		campaign.discount = entity.discount;
	}

	@Override
	public void delete(Campaign entity) {
		// TODO Auto-generated method stub
		var campaign = this.getById(entity.id);
		this.data.remove(entity);
	}

	@Override
	public Campaign getById(int id) {
		// TODO Auto-generated method stub
		var campaign = this.data.stream()
				.filter((c) -> c.id == id)
				.findFirst().orElse(new Campaign(0,"",0));
		return campaign;
	}

	@Override
	public List<Campaign> getAll() {
		// TODO Auto-generated method stub
		return this.data;
	}

}
