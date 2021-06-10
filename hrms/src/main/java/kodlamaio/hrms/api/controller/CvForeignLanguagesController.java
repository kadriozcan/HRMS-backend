package kodlamaio.hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CvForeignLanguageService;
import kodlamaio.hrms.entities.concretes.CvForeignLanguage;

@RestController
@RequestMapping("/api/cvForeignLanguages")
public class CvForeignLanguagesController {
	private CvForeignLanguageService cvForeignLanguageService;

	@Autowired
	public CvForeignLanguagesController(CvForeignLanguageService cvForeignLanguageService) {
		super();
		this.cvForeignLanguageService = cvForeignLanguageService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody CvForeignLanguage cvForeignLanguage) {
		return ResponseEntity.ok(cvForeignLanguageService.add(cvForeignLanguage));
	}
	
	@GetMapping("/findByCandidateId")
	public ResponseEntity<?> findByCandidateId(int id) {
		return ResponseEntity.ok(this.cvForeignLanguageService.findByCandidateId(id));
	}
	
}
