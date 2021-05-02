package Business.Abstract;

import java.util.List;

import Core.Utilities.Results.IDataResult;
import Core.Utilities.Results.IResult;
import Entities.Concrete.Campaign;

public interface CampaignService {
	IResult add(Campaign campaign);
	IResult update(Campaign campaign);
	IResult delete(Campaign campaign);
	IDataResult<Campaign> getById(int id);
	IDataResult<List<Campaign>> getAll();
}
