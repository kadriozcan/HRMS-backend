package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvEducation;

public interface CvEducationService {
	Result add(CvEducation cvEducation);
	
	DataResult<CvEducation> findByCandidateId(int id);
}
