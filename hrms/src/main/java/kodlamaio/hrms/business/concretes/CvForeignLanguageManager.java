package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvForeignLanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvForeignLanguageDao;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;

@Service
public class CvForeignLanguageManager implements CvForeignLanguageService {
	
	private CvForeignLanguageDao cvForeignLanguageDao;

	@Autowired
	public CvForeignLanguageManager(CvForeignLanguageDao cvForeignLanguageDao) {
		super();
		this.cvForeignLanguageDao = cvForeignLanguageDao;
	}

	@Override
	public Result add(CvForeignLanguage cvForeignLanguage) {
		// TODO Auto-generated method stub
		this.cvForeignLanguageDao.save(cvForeignLanguage);
		return new SuccessResult("eklendi");
	}

	@Override
	public DataResult<List<CvForeignLanguage>> findByCandidateId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CvForeignLanguage>>(this.cvForeignLanguageDao.findByCandidateId(id));
	}
	
	
}
