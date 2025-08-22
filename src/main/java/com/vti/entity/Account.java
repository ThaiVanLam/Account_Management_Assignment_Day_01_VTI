package com.vti.entity;

import java.io.Serializable; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "AccountID")
	@Id
	private int id;

	@Column(name = "Email")
	private String email;

	@Column(name = "Username")
	private String username;

	@Column(name = "FullName")
	private String fullname;

	@Column(name = "DepartmentID")
	private int departmentId;

	@Column(name = "PositionID")
	private int positionId;

	public Account() {
	}

	public Account(int id, String email, String username, String fullname, int departmentId, int positionId) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.fullname = fullname;
		this.departmentId = departmentId;
		this.positionId = positionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", fullname=" + fullname
				+ ", departmentId=" + departmentId + ", positionId=" + positionId + "]";
	}

}
