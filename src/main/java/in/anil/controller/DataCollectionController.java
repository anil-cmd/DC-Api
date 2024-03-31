package in.anil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.anil.binding.CitizenEducationDetailsRequestDto;
import in.anil.binding.CitizenEducationDetailsResponseDto;
import in.anil.binding.CitizenIncomeDetailsRequestDto;
import in.anil.binding.CitizenIncomeDetailsResponseDto;
import in.anil.binding.CitizenKidsDetailsRequestDto;
import in.anil.binding.CitizenKidsDetailsResponseDto;
import in.anil.binding.CompleteDataDto;
import in.anil.service.DataCollectionService;

@RestController
public class DataCollectionController {
	
	@Autowired
	private DataCollectionService service;
	
	@PostMapping("/education")
	public ResponseEntity<String> saveEducationDetails(@RequestBody CitizenEducationDetailsRequestDto educationDetailsRequest) {
		boolean isSaved = service.saveCitizenEducationDetails(educationDetailsRequest);
		return (isSaved) ? new ResponseEntity<String>("details saved", HttpStatus.CREATED) : new ResponseEntity<String>("something went wrong", HttpStatus.BAD_GATEWAY);
	}
	
	@GetMapping("/education")
	public ResponseEntity<CitizenEducationDetailsResponseDto> getEducationDetails(@RequestParam("applicationNumber") Integer applicationNumber) {
		CitizenEducationDetailsResponseDto citizenEducationDetails = service.getCitizenEducationDetails(applicationNumber);
		return (citizenEducationDetails != null) ? new ResponseEntity<CitizenEducationDetailsResponseDto>(citizenEducationDetails, HttpStatus.OK) : new ResponseEntity<CitizenEducationDetailsResponseDto>(citizenEducationDetails, HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/income")
	public ResponseEntity<String> saveIncomeDetails(@RequestBody CitizenIncomeDetailsRequestDto incomeDetailsRequest) {
		boolean isSaved = service.saveCitizenIncomeDetails(incomeDetailsRequest);
		return (isSaved) ? new ResponseEntity<String>("details saved", HttpStatus.CREATED) : new ResponseEntity<String>("something went wrong", HttpStatus.BAD_GATEWAY);
	}
	
	@GetMapping("/income")
	public ResponseEntity<CitizenIncomeDetailsResponseDto> getIncomeDetails(@RequestParam("applicationNumber") Integer applicationNumber) {
		CitizenIncomeDetailsResponseDto citizenIncomeDetails = service.getCitizenIncomeDetails(applicationNumber);
		return (citizenIncomeDetails != null) ? new ResponseEntity<CitizenIncomeDetailsResponseDto>(citizenIncomeDetails, HttpStatus.OK) : new ResponseEntity<CitizenIncomeDetailsResponseDto>(citizenIncomeDetails, HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("/kids")
	public ResponseEntity<String> saveKidsDetails(@RequestBody List<CitizenKidsDetailsRequestDto> kidsDetailsRequest) {
		boolean isSaved = service.saveCitizenKidsDetails(kidsDetailsRequest);
		return (isSaved) ? new ResponseEntity<String>("details saved", HttpStatus.CREATED) : new ResponseEntity<String>("something went wrong", HttpStatus.BAD_GATEWAY);
	}
	
	@GetMapping("/kids")
	public ResponseEntity<List<CitizenKidsDetailsResponseDto>> getKidsDetails(@RequestParam("applicationNumber") Integer applicationNumber) {
		List<CitizenKidsDetailsResponseDto> citizenKidsDetails = service.getCitizenKidsDetails(applicationNumber);
		return (citizenKidsDetails != null) ? new ResponseEntity<List<CitizenKidsDetailsResponseDto>>(citizenKidsDetails, HttpStatus.OK) : new ResponseEntity<List<CitizenKidsDetailsResponseDto>>(citizenKidsDetails, HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/all-details")
	public ResponseEntity<CompleteDataDto> getCompleteData(@RequestParam("applicationNumber") Integer applicationNumber) {
		CompleteDataDto allTheCitizenData = service.getAllTheCitizenData(applicationNumber);
		return (allTheCitizenData != null) ? new ResponseEntity<CompleteDataDto>(allTheCitizenData, HttpStatus.OK) : new ResponseEntity<CompleteDataDto>(allTheCitizenData, HttpStatus.BAD_REQUEST);
	}

}
