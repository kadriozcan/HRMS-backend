package kodlamaio.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvDetailService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CvDetail;

@RestController
@RequestMapping("/api/cvDetails")
public class CvDetailsController {
	private CvDetailService cvDetailService;

	@Autowired
	public CvDetailsController(CvDetailService cvDetailService) {
		super();
		this.cvDetailService = cvDetailService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CvDetail cvDetail) {
		return this.cvDetailService.add(cvDetail);
	}
	
	@GetMapping("/findByCandidateId")
	public DataResult<CvDetail> findByCandidateId(@RequestParam int id) {
		return this.cvDetailService.findByCandidateId(id);
	}
	
}
