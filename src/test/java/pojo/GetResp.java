package pojo;

public class GetResp {
	
	private String instructor;  //ALT+SHIFT+S to generate getters and setters
	private String url;
	private String service;
	private String expertise ;
	private CoursesSubjs courses;
	
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public CoursesSubjs getCourses() {
		return courses;
	}
	public void setCourses(CoursesSubjs courses) {
		this.courses = courses;
	}
	
	
	

}
