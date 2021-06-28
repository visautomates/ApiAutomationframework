package pojo;

import java.util.List;

public class CoursesSubjs {
	
	private List<Webautomation> webautomation;
	private List<Apiautomation> APIautomation;
	private List<Someautomation> someautomation;
	
	public List<Apiautomation> getAPIautomation() {
		return APIautomation;
	}

	public void setWebautomation(List<Apiautomation> APIautomation) {
		this.APIautomation = APIautomation;
	}

	public List<Someautomation> getSomeautomation() {
		return someautomation;
	}

	public void setSomeautomation(List<Someautomation> someautomation) {
		this.someautomation = someautomation;
	}

	
	public List<Webautomation> getwebautomation() {
		return webautomation;
	}
	
	public void getwebautomation(List<Webautomation>  webautomation) {
		
		this.webautomation =webautomation;
	}
}
