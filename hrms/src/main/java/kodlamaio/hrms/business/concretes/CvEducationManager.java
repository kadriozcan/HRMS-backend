package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvEducationDao;
import kodlamaio.hrms.entities.concretes.CvEducation;

@Service
public class CvEducationManager implements CvEducationService {

	private CvEducationDao cvEducationDao;
	
	@Autowired
	public CvEducationManager(CvEducationDao cvEducationDao) {
		super();
		this.cvEducationDao = cvEducationDao;
	}

	@Override
	public Result add(CvEducation cvEducation) {
		// TODO Auto-generated method stub
		this.cvEducationDao.save(cvEducation);
		return new SuccessResult("egitim eklendi");
	}

	@Override
	public DataResult<CvEducation> findByCandidateId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<CvEducation>(this.cvEducationDao.findByCandidateId(id));
	}

}
