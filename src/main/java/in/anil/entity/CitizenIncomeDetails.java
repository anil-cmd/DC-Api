package in.anil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenIncomeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomeId;
	
	private Double salaryIncome;
	
	private Double propertyIncome;
	
	private Integer applicationNumber;

	public CitizenIncomeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitizenIncomeDetails(Integer incomeId, Double salaryIncome, Double propertyIncome,
			Integer applicationNumber) {
		super();
		this.incomeId = incomeId;
		this.salaryIncome = salaryIncome;
		this.propertyIncome = propertyIncome;
		this.applicationNumber = applicationNumber;
	}

	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

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
		return "CitizenIncomeDetails [incomeId=" + incomeId + ", salaryIncome=" + salaryIncome + ", propertyIncome="
				+ propertyIncome + ", applicationNumber=" + applicationNumber + "]";
	}
	

}
