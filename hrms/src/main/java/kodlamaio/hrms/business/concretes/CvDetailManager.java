package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CvDetailService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CvDetailDao;
import kodlamaio.hrms.entities.concretes.CvDetail;

@Service
public class CvDetailManager implements CvDetailService {
	private CvDetailDao cvDetailDao;

	@Autowired
	public CvDetailManager(CvDetailDao cvDetailDao) {
		super();
		this.cvDetailDao = cvDetailDao;
	}

	@Override
	public Result add(CvDetail cvDetail) {
		// TODO Auto-generated method stub
		this.cvDetailDao.save(cvDetail);
		return new SuccessResult("Kaydedildi");
	}

	@Override
	public DataResult<CvDetail> findByCandidateId(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<CvDetail>(this.cvDetailDao.findByCandidateId(id));
	}


	
}
