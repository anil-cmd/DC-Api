package in.anil.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anil.binding.CitizenEducationDetailsRequestDto;
import in.anil.binding.CitizenEducationDetailsResponseDto;
import in.anil.binding.CitizenIncomeDetailsRequestDto;
import in.anil.binding.CitizenIncomeDetailsResponseDto;
import in.anil.binding.CitizenKidsDetailsRequestDto;
import in.anil.binding.CitizenKidsDetailsResponseDto;
import in.anil.binding.CompleteDataDto;
import in.anil.entity.CitizenEducationDetails;
import in.anil.entity.CitizenIncomeDetails;
import in.anil.entity.CitizenKidsDetails;
import in.anil.repo.EducationRepo;
import in.anil.repo.IncomeRepo;
import in.anil.repo.KidsRepo;

@Service
public class DataCollectionServiceImpl implements DataCollectionService{
	
	@Autowired
	private IncomeRepo incomeRepo;
	
	@Autowired
	private EducationRepo educationRepo;
	
	@Autowired
	private KidsRepo kidsRepo;

	@Override
	public boolean saveCitizenIncomeDetails(CitizenIncomeDetailsRequestDto citizenIncomeDetailsRequestDto) {
		CitizenIncomeDetails citizenIncomeDetails = new CitizenIncomeDetails();
		BeanUtils.copyProperties(citizenIncomeDetailsRequestDto, citizenIncomeDetails);
		CitizenIncomeDetails incomeDetails = incomeRepo.save(citizenIncomeDetails);
		return (incomeDetails.getIncomeId() != null) ? true : false;
	}

	@Override
	public CitizenIncomeDetailsResponseDto getCitizenIncomeDetails(Integer applicationNumber) {
		CitizenIncomeDetailsResponseDto citizenIncomeDetailsResponseDto = new CitizenIncomeDetailsResponseDto();
		CitizenIncomeDetails incomeDetails = incomeRepo.findByApplicationNumber(applicationNumber);
		BeanUtils.copyProperties(incomeDetails, citizenIncomeDetailsResponseDto);
		return citizenIncomeDetailsResponseDto;
	}

	@Override
	public boolean saveCitizenEducationDetails(CitizenEducationDetailsRequestDto citizenEducationDetailsRequestDto) {
		CitizenEducationDetails citizenEducationDetails = new CitizenEducationDetails();
		BeanUtils.copyProperties(citizenEducationDetailsRequestDto, citizenEducationDetails);
		CitizenEducationDetails educationDetails = educationRepo.save(citizenEducationDetails);
		return (educationDetails.getEducationId() != null) ? true : false;
	}

	@Override
	public CitizenEducationDetailsResponseDto getCitizenEducationDetails(Integer applicationNumber) {
		CitizenEducationDetailsResponseDto citizenEducationDetailsResponseDto = new CitizenEducationDetailsResponseDto();
		CitizenEducationDetails educationDetails = educationRepo.findByApplicationNumber(applicationNumber);
		BeanUtils.copyProperties(educationDetails, citizenEducationDetailsResponseDto);
		return citizenEducationDetailsResponseDto;
	}

	@Override
	public boolean saveCitizenKidsDetails(List<CitizenKidsDetailsRequestDto> citizenKidsDetails) {
		List<CitizenKidsDetails> citizenKidsDetailsEntity = new ArrayList<CitizenKidsDetails>();
		citizenKidsDetails.stream().forEach(kid ->{
			CitizenKidsDetails kidObject = new CitizenKidsDetails();
			BeanUtils.copyProperties(kid, kidObject);
			citizenKidsDetailsEntity.add(kidObject);
		});
		List<CitizenKidsDetails> savedKids = kidsRepo.saveAll(citizenKidsDetailsEntity);
		return (savedKids != null) ? true : false;
	}

	@Override
	public List<CitizenKidsDetailsResponseDto> getCitizenKidsDetails(Integer applicationNumber) {
		List<CitizenKidsDetails> allKids = kidsRepo.findByApplicationNumber(applicationNumber);
		List<CitizenKidsDetailsResponseDto> citizenKidsDetailsResponseDto = new ArrayList<CitizenKidsDetailsResponseDto>();
		allKids.stream().forEach(kid -> {
			CitizenKidsDetailsResponseDto kidObject = new CitizenKidsDetailsResponseDto();
			BeanUtils.copyProperties(kid, kidObject);
			citizenKidsDetailsResponseDto.add(kidObject);
		});
		return citizenKidsDetailsResponseDto;
	}

	@Override
	public CompleteDataDto getAllTheCitizenData(Integer applicationNumber) {
		
		//education details
		CitizenEducationDetails educationDetails = educationRepo.findByApplicationNumber(applicationNumber);
		CitizenEducationDetailsResponseDto citizenEducationDetailsResponseDto = new CitizenEducationDetailsResponseDto();
		BeanUtils.copyProperties(educationDetails, citizenEducationDetailsResponseDto);
		
		//income details
		CitizenIncomeDetails incomeDetails = incomeRepo.findByApplicationNumber(applicationNumber);
		CitizenIncomeDetailsResponseDto citizenIncomeDetailsResponseDto = new CitizenIncomeDetailsResponseDto();
		BeanUtils.copyProperties(incomeDetails, citizenIncomeDetailsResponseDto);
		
		//kids details
		List<CitizenKidsDetails> kidsDetails = kidsRepo.findByApplicationNumber(applicationNumber);
		List<CitizenKidsDetailsResponseDto> citizenKidsDetailsResponseDto = new ArrayList<CitizenKidsDetailsResponseDto>();
		kidsDetails.stream().forEach(kid -> {
			CitizenKidsDetailsResponseDto kidObject = new CitizenKidsDetailsResponseDto();
			BeanUtils.copyProperties(kid, kidObject);
			citizenKidsDetailsResponseDto.add(kidObject);
		});
		
		CompleteDataDto completeData = new CompleteDataDto();
		completeData.setApplicationNumber(applicationNumber);
		completeData.setEducationDetailsResponse(citizenEducationDetailsResponseDto);
		completeData.setIncomeDetailsResponse(citizenIncomeDetailsResponseDto);
		completeData.setKidsDetailsResponse(citizenKidsDetailsResponseDto);
		return completeData;
	}

}
