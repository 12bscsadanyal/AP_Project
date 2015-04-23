package pk.edu.seecs.ap.project;

public class Campuses {
	
	private String University_Name;
	private String Location;
	private String Campus;
	private String Fields; 
	private String HEC_certified;
	
	public Campuses(){}

	public String getUniversity_Name() {
		return University_Name;
	}
	public void setUniversity_Name(String university_Name) {
		University_Name = university_Name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getCampus() {
		return Campus;
	}
	public void setCampus(String campus) {
		Campus = campus;
	}
	public String getFields() {
		return Fields;
	}
	public void setFields(String fields) {
		Fields = fields;
	}
	public String getHEC_certified() {
		return HEC_certified;
	}
	public void setHEC_certified(String hEC_certified) {
		HEC_certified = hEC_certified;
	}	
}
