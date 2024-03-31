package in.anil.binding;


public class CitizenEducationDetailsResponseDto {
	

	private Integer educationId;
	
	private String highestDegree;
	
	private String graduationYear;
	
	private String universityName;
	
	private Integer applicationNumber;

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
