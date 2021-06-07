package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.PersonnelVerification;

public interface PersonnelVerificationDao extends JpaRepository<PersonnelVerification, Integer> {

}
