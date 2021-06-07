package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPostingDao;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;

@Service
public class JobPostingManager implements JobPostingService {
	
	private JobPostingDao jobPostingDao;
	
	@Autowired
	public JobPostingManager(JobPostingDao jobPostingDao) {
		super();
		this.jobPostingDao = jobPostingDao;
	}

	public Result add(JobPosting jobPosting) {
		this.jobPostingDao.save(jobPosting);
		return new SuccessResult("Is ilani basariyla eklendi");
	}
	
	public Result delete(int id) {
		this.jobPostingDao.deleteById(id);
		return new SuccessResult("Is ilani silindi");
	}

	@Override
	public DataResult<JobPosting> findById(int id) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<JobPosting>(this.jobPostingDao.findById(id));
	}

	@Override
	public DataResult<List<JobPosting>> getAll() {
		
		return new SuccessDataResult<List<JobPosting>>(this.jobPostingDao.findAll(), "Tum aktif is ilanlari listelendi");
	}

	@Override
	public DataResult<List<JobPostingDto>> findAllByStatusTrue() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPostingDto>>(this.jobPostingDao.findAllByStatusTrue(), "Aktif is ilanlari listelendi");
	}

	@Override
	public DataResult<List<JobPostingDto>> findAllByStatusTrueOrderByReleaseDateDesc() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPostingDto>>(this.jobPostingDao.findAllByStatusTrueOrderByReleaseDateDesc());
	}

	@Override
	public DataResult<List<JobPostingDto>> findAllByStatusTrueOrderByReleaseDateAsc() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPostingDto>>(this.jobPostingDao.findAllByStatusTrueOrderByReleaseDateAsc());
	}

	@Override
	public DataResult<List<JobPostingDto>> findAllByEmployer(int employerId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobPostingDto>>(this.jobPostingDao.findAllByEmployer(employerId));
	}



}
