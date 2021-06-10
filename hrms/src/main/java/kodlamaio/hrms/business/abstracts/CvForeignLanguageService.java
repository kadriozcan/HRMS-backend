package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;

public interface CvForeignLanguageService {
	
	Result add(CvForeignLanguage cvForeignLanguage);
	
	DataResult<List<CvForeignLanguage>> findByCandidateId(int id);
}
