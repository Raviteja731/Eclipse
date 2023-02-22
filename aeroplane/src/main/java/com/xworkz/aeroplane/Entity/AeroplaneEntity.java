package com.xworkz.aeroplane.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aeroplane")
public class AeroplaneEntity {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "companyName")
	private String companyName;
	@Column(name = "aeroplaneName")
	private String aeroplaneName;
	@Column(name = "passangerName")
	private String passangerName;
	@Column(name = "gmail")
	private String gmail;
	@Column(name = "classType")
	private String classType;
	@Column(name = "countryName")
	private String countryName;
	@Column(name = "ticketCost")
	private Double ticketCost;
	@Column(name = "enterPlanenumber")
	private Double enterPlanenumber;
	
	public AeroplaneEntity() {
		System.out.println("created AeroplaneEntity"+getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "AeroplaneEntity [id=" + id + ", companyName=" + companyName + ", aeroplaneName=" + aeroplaneName
				+ ", passangerName=" + passangerName + ", gmail=" + gmail + ", classType=" + classType
				+ ", countryName=" + countryName + ", ticketCost=" + ticketCost + ", enterPlanenumber="
				+ enterPlanenumber + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAeroplaneName() {
		return aeroplaneName;
	}

	public void setAeroplaneName(String aeroplaneName) {
		this.aeroplaneName = aeroplaneName;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}

	public Double getEnterPlanenumber() {
		return enterPlanenumber;
	}

	public void setEnterPlanenumber(Double enterPlanenumber) {
		this.enterPlanenumber = enterPlanenumber;
	}
	
	
}
