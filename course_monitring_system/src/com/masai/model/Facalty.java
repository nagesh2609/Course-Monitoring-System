package com.masai.model;

public class Facalty {
	private int facultyId;
    private String facultyName;
    private String facultyAddress;
    private long mobile;
    private String email;
    private String username;
    private String password;
	public Facalty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Facalty(int facultyId, String facultyName, String facultyAddress, long mobile, String email, String username,
			String password) {
		super();
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.facultyAddress = facultyAddress;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getFacultyAddress() {
		return facultyAddress;
	}
	public void setFacultyAddress(String facultyAddress) {
		this.facultyAddress = facultyAddress;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Facalty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", facultyAddress=" + facultyAddress
				+ ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
    
    

}
