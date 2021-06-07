package kodlamaio.hrms.entities.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPostingDto {
	
	private String companyName;
	private String title;
	private int vacantPositionNumber;
	private LocalDate releaseDate;
	private LocalDate applicationDeadline;
	
}
