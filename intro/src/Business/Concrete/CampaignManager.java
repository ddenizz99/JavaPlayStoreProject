package Business.Concrete;

import java.util.List;

import Business.Abstract.CampaignService;
import Core.Utilities.Results.ErrorDataResult;
import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Core.Utilities.Results.SuccessDataResult;
import Core.Utilities.Results.SuccessResult;
import DataAccess.Abstract.CampaignDao;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService{

	private CampaignDao campaignDao;
	
	public CampaignManager(CampaignDao campaignDao) {
		this.campaignDao = campaignDao;
	}

	@Override
	public IResult add(Campaign campaign) {
		// TODO Auto-generated method stub
		this.campaignDao.add(campaign);
		return new SuccessResult("Kampanya Eklendi");
	}

	@Override
	public IResult update(Campaign campaign) {
		// TODO Auto-generated method stub
		this.campaignDao.update(campaign);
		return new SuccessResult("Kampanya Güncellendi");
	}

	@Override
	public IResult delete(Campaign campaign) {
		// TODO Auto-generated method stub
		this.campaignDao.delete(campaign);
		return new SuccessResult("Kampanya Silindi");
	}

	@Override
	public IDataResult<Campaign> getById(int id) {
		// TODO Auto-generated method stub
		var campaign = this.campaignDao.getById(id);
		if (campaign.id == 0) {
			return new ErrorDataResult<Campaign>("Böyle bir kampanya yok.");
		}
		return new SuccessDataResult<Campaign>(campaign);
	}

	@Override
	public IDataResult<List<Campaign>> getAll() {
		// TODO Auto-generated method stub
		var campaigns = this.campaignDao.getAll();
		if (campaigns.size() <= 0) {
			return new ErrorDataResult<List<Campaign>>("Sistemde kayıtlı kampanya bulunmuyor.");
		}
		return new SuccessDataResult<List<Campaign>>(campaigns);
	}

}
