package kodlamaio.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvJobExperienceService;
import kodlamaio.hrms.entities.concretes.CvJobExperience;

@RestController
@RequestMapping("/api/cvJobExperiences")
public class CvJobExperiencesController {
	
	private CvJobExperienceService cvJobExperienceService;
	
	@Autowired
	public CvJobExperiencesController(CvJobExperienceService cvJobExperienceService) {
		super();
		this.cvJobExperienceService = cvJobExperienceService;
	}

	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CvJobExperience cvJobExperience) {
		return ResponseEntity.ok(this.cvJobExperienceService.add(cvJobExperience));
	}
	
	@GetMapping("/findAllByCandidateId")
	public ResponseEntity<?> findAllByCandidateId(@RequestParam int id) {
		return ResponseEntity.ok(this.cvJobExperienceService.findAllByCandidateId(id));
	}
}
