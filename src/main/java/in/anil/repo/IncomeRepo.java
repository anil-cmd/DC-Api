package in.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anil.entity.CitizenIncomeDetails;

public interface IncomeRepo extends JpaRepository<CitizenIncomeDetails, Integer>{
	
	public CitizenIncomeDetails findByApplicationNumber(Integer applicationNumber);

}
