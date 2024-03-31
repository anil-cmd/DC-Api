package in.anil.service;

import java.util.List;

import in.anil.binding.CitizenEducationDetailsRequestDto;
import in.anil.binding.CitizenEducationDetailsResponseDto;
import in.anil.binding.CitizenIncomeDetailsRequestDto;
import in.anil.binding.CitizenIncomeDetailsResponseDto;
import in.anil.binding.CitizenKidsDetailsRequestDto;
import in.anil.binding.CitizenKidsDetailsResponseDto;
import in.anil.binding.CompleteDataDto;

public interface DataCollectionService {
	
	public boolean saveCitizenIncomeDetails(CitizenIncomeDetailsRequestDto citizenIncomeDetailsRequestDto);
	
	public CitizenIncomeDetailsResponseDto getCitizenIncomeDetails(Integer applicationNumber);
	
	public boolean saveCitizenEducationDetails(CitizenEducationDetailsRequestDto citizenEducationDetailsRequestDto);
	
	public CitizenEducationDetailsResponseDto getCitizenEducationDetails(Integer applicationNumber);
	
	public boolean saveCitizenKidsDetails(List<CitizenKidsDetailsRequestDto> citizenKidsDetails);
	
	public List<CitizenKidsDetailsResponseDto> getCitizenKidsDetails(Integer applicationNumber);
	
	public CompleteDataDto getAllTheCitizenData(Integer applicationNumber);

}
