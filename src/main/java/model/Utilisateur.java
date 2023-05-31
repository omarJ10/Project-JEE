package model;

public class Utilisateur {
	private String login; 
	private String password;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	} 
	public boolean  verfifier()
	{	
		if(this.login.equals("admin") && (this.password.equals("pwd")))
			return true;
		else 
			return false;
	}

}

