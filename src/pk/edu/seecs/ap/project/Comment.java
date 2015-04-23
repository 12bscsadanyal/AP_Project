package pk.edu.seecs.ap.project;

public class Comment {

	private String Forum_Title;
	private String Commented_By;
	private String Comment_Date;
	private String Comment_Time;
	private String Best_Answer;

	
	public Comment(){}
	
	public String getForum_Title() {
		return Forum_Title;
	}
	public void setForum_Title(String forum_Title) {
		Forum_Title = forum_Title;
	}
	public String getCommented_By() {
		return Commented_By;
	}
	public void setCommented_By(String commented_By) {
		Commented_By = commented_By;
	}
	public String getComment_Date() {
		return Comment_Date;
	}
	public void setComment_Date(String comment_Date) {
		Comment_Date = comment_Date;
	}
	public String getComment_Time() {
		return Comment_Time;
	}
	public void setComment_Time(String comment_Time) {
		Comment_Time = comment_Time;
	}
	public String getBest_Answer() {
		return Best_Answer;
	}
	public void setBest_Answer(String best_Answer) {
		Best_Answer = best_Answer;
	}

}
