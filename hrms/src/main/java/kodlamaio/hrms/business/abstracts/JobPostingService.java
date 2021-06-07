package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;

public interface JobPostingService {
	Result add(JobPosting jobPosting);
	Result delete(int id);
	
	DataResult<JobPosting> findById(int id);
	
	DataResult<List<JobPosting>> getAll();
	
	DataResult<List<JobPostingDto>> findAllByStatusTrue();
	
	DataResult<List<JobPostingDto>> findAllByStatusTrueOrderByReleaseDateDesc();
	DataResult<List<JobPostingDto>> findAllByStatusTrueOrderByReleaseDateAsc();
	
	DataResult<List<JobPostingDto>> findAllByEmployer(int employerId);
	
	
}
