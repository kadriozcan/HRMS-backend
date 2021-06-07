package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "personnel_verification")
@PrimaryKeyJoinColumn(name = "employer_id", referencedColumnName = "user_id")
public class PersonnelVerification {
	
	@Id
	@Column(name = "employer_id")
	private int employerId;
	
	@Column(name = "is_verified")
	private boolean isVerified;
}
