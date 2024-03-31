package in.anil.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class CitizenIncomeDetailsRequestDto {
	

	private Double salaryIncome;
	
	private Double propertyIncome;
	
	private Integer applicationNumber;


	public Double getSalaryIncome() {
		return salaryIncome;
	}

	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}

	public Double getPropertyIncome() {
		return propertyIncome;
	}

	public void setPropertyIncome(Double propertyIncome) {
		this.propertyIncome = propertyIncome;
	}

	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@Override
	public String toString() {
		return "CitizenIncomeDetails [salaryIncome=" + salaryIncome + ", propertyIncome="
				+ propertyIncome + ", applicationNumber=" + applicationNumber + "]";
	}
	

}
