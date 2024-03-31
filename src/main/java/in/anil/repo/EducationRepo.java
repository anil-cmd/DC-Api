package in.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anil.entity.CitizenEducationDetails;
import in.anil.entity.CitizenIncomeDetails;

public interface EducationRepo extends JpaRepository<CitizenEducationDetails, Integer>{
	
	public CitizenEducationDetails findByApplicationNumber(Integer applicationNumber);

}
