package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class AeroplaneDTO {

	public AeroplaneDTO() {
		System.out.println("created AeroplaneDTO..."+getClass().getSimpleName());
	}
	
	@NotNull
	private int id;
	@NotNull
	@Size(min=3, max=45, message = "The companyName Should be more 3 and less den 20")
	private String companyName;
	@NotNull
	@Size(min=3, max=45, message = "The aeroplaneName Should be more 3 and less den 20")
	private String aeroplaneName;
	@NotNull
	@Size(min=3, max=45, message = "The passangerName Should be more 3 and less den 20")
	private String passangerName;
	@NotNull
	@Size(min=3, max=45, message = "The gmail Should be more 3 and less den 20")
	private String gmail;
	@NotNull
	@Size(min=3, max=45, message = "The classType Should be more 3 and less den 20")
	private String classType;
	@NotNull
	@Size(min=3, max=45, message = "The countryName Should be more 3 and less den 20")
	private String countryName;
	@NotNull
	private Double ticketCost;
	@NotNull
	private Double enterPlanenumber;
	
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
