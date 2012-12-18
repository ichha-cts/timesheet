package com.cts.ts.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "user")
public class User {

	private static final long serialVersionUID = 9216685081907787016L;

	
	@Column(name = "Name")
	private String name;
	
	@Id
	@Column(name = "email_id")
	private String emailID;
	
	@Column(name = "organization")
	private String organization;
	
	@Column(name = "scrum")
	private String scrum;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getScrum() {
		return scrum;
	}
	public void setScrum(String scrum) {
		this.scrum = scrum;
	}
}
