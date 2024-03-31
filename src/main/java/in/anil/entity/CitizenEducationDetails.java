package in.anil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CitizenEducationDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer educationId;
	
	private String highestDegree;
	
	private String graduationYear;
	
	private String universityName;
	
	private Integer applicationNumber;

	public CitizenEducationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CitizenEducationDetails(Integer educationId, String highestDegree, String graduationYear,
			String universityName, Integer applicationNumber) {
		super();
		this.educationId = educationId;
		this.highestDegree = highestDegree;
		this.graduationYear = graduationYear;
		this.universityName = universityName;
		this.applicationNumber = applicationNumber;
	}

	public Integer getEducationId() {
		return educationId;
	}

	public void setEducationId(Integer educationId) {
		this.educationId = educationId;
	}

	public String getHighestDegree() {
		return highestDegree;
	}

	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}

	public String getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(String graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Integer getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(Integer applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	@Override
	public String toString() {
		return "CitizenEducationDetails [educationId=" + educationId + ", highestDegree=" + highestDegree
				+ ", graduationYear=" + graduationYear + ", universityName=" + universityName + ", applicationNumber="
				+ applicationNumber + "]";
	}
	

}
