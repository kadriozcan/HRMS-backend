package kodlamaio.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPostingService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;

@RestController
@RequestMapping("/api/jobPostings")
public class JobPostingsController {
	
	private JobPostingService jobPostingService;
	
	@Autowired
	public JobPostingsController(JobPostingService jobPostingService) {
		super();
		this.jobPostingService = jobPostingService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosting jobPosting) {
		return this.jobPostingService.add(jobPosting);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int id) {
		return this.jobPostingService.delete(id);
	}
	
	@GetMapping("/findAllByStatusTrue")
	public DataResult<List<JobPostingDto>> findAllByStatusTrue() {
		return this.jobPostingService.findAllByStatusTrue();
	}
	
	@GetMapping("/findAllByStatusTrueOrderByReleaseDateDesc")
	public DataResult<List<JobPostingDto>> findAllByStatusTrueOrderByReleaseDateDesc() {
		return this.jobPostingService.findAllByStatusTrueOrderByReleaseDateDesc();
	}
	
	@GetMapping("/findAllByStatusTrueOrderByReleaseDateAsc")
	public DataResult<List<JobPostingDto>> findAllByStatusTrueOrderByReleaseDateAsc() {
		return this.jobPostingService.findAllByStatusTrueOrderByReleaseDateAsc();
	}
	
	@GetMapping("/findAllByEmployer")
	public DataResult<List<JobPostingDto>> findAllByEmployer(@RequestParam int employerId) {
		return this.jobPostingService.findAllByEmployer(employerId);
	}
	
	
	
	

	
	
	
}
