package com.vti.entity;

import java.io.Serializable; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Position")
public class Position implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "PositionID")
	@Id
	private int id;

	@Column(name = "PositionName")
	private String positionName;

	public Position() {
		super();
	}

	public Position(int id, String positionName) {
		super();
		this.id = id;
		this.positionName = positionName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	@Override
	public String toString() {
		return "Position [id=" + id + ", positionName=" + positionName + "]";
	}

}
