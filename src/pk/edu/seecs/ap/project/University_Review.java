package pk.edu.seecs.ap.project;

public class University_Review {

	private String University_Name;
	private String University_Review;
	private String Reviewed_By;
	private String Reviewed_On;
	private String Stars;
	
	public University_Review(){}
	
	public String getUniversity_Name() {
		return University_Name;
	}
	public void setUniversity_Name(String university_Name) {
		University_Name = university_Name;
	}
	public String getUniversity_Review() {
		return University_Review;
	}
	public void setUniversity_Review(String university_Review) {
		University_Review = university_Review;
	}
	public String getReviewed_By() {
		return Reviewed_By;
	}
	public void setReviewed_By(String reviewed_By) {
		Reviewed_By = reviewed_By;
	}
	public String getReviewed_On() {
		return Reviewed_On;
	}
	public void setReviewed_On(String reviewed_On) {
		Reviewed_On = reviewed_On;
	}
	public String getStars() {
		return Stars;
	}
	public void setStars(String stars) {
		Stars = stars;
	}
}
