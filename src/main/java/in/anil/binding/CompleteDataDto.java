package in.anil.binding;

import java.util.List;

public class CompleteDataDto {
	
	private Integer applicationNumber;
	
	private CitizenEducationDetailsResponseDto educationDetailsResponse;
	
	private List<CitizenKidsDetailsResponseDto> kidsDetailsResponse;
	
	private CitizenIncomeDetailsResponseDto incomeDetailsResponse;

	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public CitizenEducationDetailsResponseDto getEducationDetailsResponse() {
		return educationDetailsResponse;
	}

	public void setEducationDetailsResponse(CitizenEducationDetailsResponseDto educationDetailsResponse) {
		this.educationDetailsResponse = educationDetailsResponse;
	}

	public CitizenIncomeDetailsResponseDto getIncomeDetailsResponse() {
		return incomeDetailsResponse;
	}

	public void setIncomeDetailsResponse(CitizenIncomeDetailsResponseDto incomeDetailsResponse) {
		this.incomeDetailsResponse = incomeDetailsResponse;
	}

	public List<CitizenKidsDetailsResponseDto> getKidsDetailsResponse() {
		return kidsDetailsResponse;
	}

	public void setKidsDetailsResponse(List<CitizenKidsDetailsResponseDto> kidsDetailsResponse) {
		this.kidsDetailsResponse = kidsDetailsResponse;
	}
	

}
