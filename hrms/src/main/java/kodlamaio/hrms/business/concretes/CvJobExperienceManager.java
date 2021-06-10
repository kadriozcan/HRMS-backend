package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvJobExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvJobExperiencesDao;
import kodlamaio.hrms.entities.concretes.CvJobExperience;

@Service
public class CvJobExperienceManager implements CvJobExperienceService {
	private CvJobExperiencesDao cvJobExperiencesDao;

	@Autowired
	public CvJobExperienceManager(CvJobExperiencesDao cvJobExperiencesDao) {
		super();
		this.cvJobExperiencesDao = cvJobExperiencesDao;
	}

	@Override
	public Result add(CvJobExperience cvJobExperience) {
		// TODO Auto-generated method stub
		this.cvJobExperiencesDao.save(cvJobExperience);
		return new SuccessResult("eklendi");
	}

	@Override
	public DataResult<List<CvJobExperience>> findAllByCandidateId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<CvJobExperience>>(this.cvJobExperiencesDao.findAllByCandidateId(id));
	}
}
