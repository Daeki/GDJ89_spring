package com.winter.app.users;

public class UserDTO {
	
	private String userName;
	private String password;
	private String name;
	private String phone;
	private String email;
	private UserFileDTO userFileDTO;
	
	
	
	public UserFileDTO getUserFileDTO() {
		return userFileDTO;
	}
	public void setUserFileDTO(UserFileDTO userFileDTO) {
		this.userFileDTO = userFileDTO;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
