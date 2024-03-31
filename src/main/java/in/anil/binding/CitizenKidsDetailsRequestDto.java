package in.anil.binding;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CitizenKidsDetailsRequestDto {
	

	private String kidName;
	
	private String kidDob;
	
	private String kidSsn;
	
	private Integer applicationNumber;


	public String getKidName() {
		return kidName;
	}

	public void setKidName(String kidName) {
		this.kidName = kidName;
	}

	public String getKidDob() {
		return kidDob;
	}

	public void setKidDob(String kidDob) {
		this.kidDob = kidDob;
	}

	public String getKidSsn() {
		return kidSsn;
	}

	public void setKidSsn(String kidSsn) {
		this.kidSsn = kidSsn;
	}

	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@Override
	public String toString() {
		return "CitizenKidsDetails [kidName=" + kidName + ", kidDob=" + kidDob + ", kidSsn="
				+ kidSsn + ", applicationNumber=" + applicationNumber + "]";
	}
	
	
}
