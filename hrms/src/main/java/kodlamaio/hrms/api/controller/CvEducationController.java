package kodlamaio.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvEducationService;
import kodlamaio.hrms.entities.concretes.CvEducation;

@RestController
@RequestMapping("/api/cvEducations")
public class CvEducationController {

	private CvEducationService cvEducationService;

	@Autowired
	public CvEducationController(CvEducationService cvEducationService) {
		super();
		this.cvEducationService = cvEducationService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CvEducation cvEducation) {
		return ResponseEntity.ok(this.cvEducationService.add(cvEducation));
	}

	@GetMapping("/findByCandidateId")
	public ResponseEntity<?> findByCandidateId(@RequestParam int id) {
		return ResponseEntity.ok(this.cvEducationService.findByCandidateId(id));
	}

}
