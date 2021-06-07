package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cvs")
@AllArgsConstructor
@NoArgsConstructor

public class Cv {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "candidate_id")
	private int candidateId;
	
	@Column(name = "image_link")
	private String imageLink;
	
	@Column(name = "cover_letter")
	private String coverLetter;
	
	@OneToMany(mappedBy = "cv")
	private List<CvJobExperience> cvJobExperiences;
	
	@OneToMany(mappedBy = "cv")
	private List<CvForeignLanguages> cvForeignLanguages;
	
	@OneToMany(mappedBy = "cv")
	private List<CvSocialMedia> cvSocialMedias;
	
	@OneToMany(mappedBy = "cv")
	private List<CvSkills> cvSkills;
}
