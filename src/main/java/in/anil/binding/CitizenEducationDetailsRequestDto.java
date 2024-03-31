package in.anil.binding;


public class CitizenEducationDetailsRequestDto {
	

	private String highestDegree;
	
	private String graduationYear;
	
	private String universityName;
	
	private Integer applicationNumber;


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
		return "CitizenEducationDetails [highestDegree=" + highestDegree
				+ ", graduationYear=" + graduationYear + ", universityName=" + universityName + ", applicationNumber="
				+ applicationNumber + "]";
	}
	

}
