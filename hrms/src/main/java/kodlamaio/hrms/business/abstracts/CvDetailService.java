package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvDetail;

public interface CvDetailService {
	Result add(CvDetail cvDetail);
	
	DataResult<CvDetail> findByCandidateId(int id);
}
