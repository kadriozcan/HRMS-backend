package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobPosting;
import kodlamaio.hrms.entities.dtos.JobPostingDto;

public interface JobPostingDao extends JpaRepository<JobPosting, Integer> {
	JobPosting findById(int id);
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobPostingDto"
			+ "(e.companyName, jobT.title, j.vacantPositionNumber, j.releaseDate, j.applicationDeadline) "
			+ "From JobPosting j Inner Join j.employer e Inner Join j.jobTitle jobT")
	List<JobPostingDto> findAllByStatusTrue();
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobPostingDto"
			+ "(e.companyName, jobT.title, j.vacantPositionNumber, j.releaseDate, j.applicationDeadline) "
			+ "From JobPosting j Inner Join j.employer e Inner Join j.jobTitle jobT ORDER BY j.releaseDate DESC")
	List<JobPostingDto> findAllByStatusTrueOrderByReleaseDateDesc();
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobPostingDto"
			+ "(e.companyName, jobT.title, j.vacantPositionNumber, j.releaseDate, j.applicationDeadline) "
			+ "From JobPosting j Inner Join j.employer e Inner Join j.jobTitle jobT ORDER BY j.releaseDate ASC")
	List<JobPostingDto> findAllByStatusTrueOrderByReleaseDateAsc();
	
	
	@Query("Select new kodlamaio.hrms.entities.dtos.JobPostingDto"
			+ "(e.companyName, jobT.title, j.vacantPositionNumber, j.releaseDate, j.applicationDeadline) "
			+ "From JobPosting j Inner Join j.employer e Inner Join j.jobTitle jobT WHERE user_id=:employerId ")
	List<JobPostingDto> findAllByEmployer(int employerId);
	
}
