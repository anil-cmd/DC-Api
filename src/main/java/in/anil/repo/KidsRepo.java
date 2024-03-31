package in.anil.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.anil.entity.CitizenKidsDetails;

public interface KidsRepo extends JpaRepository<CitizenKidsDetails, Integer>{

	public List<CitizenKidsDetails> findByApplicationNumber(Integer applicationNumber);
	
}
