package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import kodlamaio.hrms.core.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "candidates")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Candidate extends User{
	
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_year")
	private int birthYear;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<CvDetail> cvDetails;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<CvEducation> cvEducations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<CvForeignLanguage> cvForeignLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidate")
	private List<CvJobExperience> cvJobExperiences;
	
	
	
}
