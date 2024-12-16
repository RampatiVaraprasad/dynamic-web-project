package ModelPack;

public class AdminModel {
	private String Username;
	private String Password;
	public AdminModel() {}
	public AdminModel(String Username, String Password) {
		this.Username = Username;
		this.Password = Password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String toString() {
		return"Hello"+ this.Username+this.Password;
		
	}
}
