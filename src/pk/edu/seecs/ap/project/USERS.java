package pk.edu.seecs.ap.project;

public class USERS {

	private String Username;
	private String First_Name;
	private String Last_Name;
	private String e_mail;
	private String Password;
	private String Opting;
	
	public USERS(){}
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getOpting() {
		return Opting;
	}
	public void setOpting(String opting) {
		Opting = opting;
	}

}
