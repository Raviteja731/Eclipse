package com.xworkz.awards.dto;

import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;

public class AwardDTO {

	@NotNull
	@Size(min = 3, max = 15, message = "Award Name Should Be More Than 3 And less Than 15..!")
	private String awardName;
	@NotNull
	@Size(min = 3, max = 15, message = "awardMadeBy Name Should Be More Than 3 And less Than 15..!")
	private String awardMadeBy;
	@NotNull
	@Size(min = 3, max = 15, message = "ReciverName Name Should Be More Than 3 And less Than 15..!")
	private String firstReciverName;
	@NotNull
	private String recivedDate;
	@NotNull
	@Size(min = 3, max = 15, message = "AwardGivenBy Name Should Be More Than 3 And less Than 15..!")
	private String givenBy;
	@NotNull
	private boolean Recived;
	@NotNull
	private boolean Not_Recived;

	public AwardDTO() {
		System.out.println("Created AwardDTO....");
	}

	@Override
	public String toString() {
		return "AwardDTO [awardName=" + awardName + ", awardMadeBy=" + awardMadeBy + ", firstReciverName="
				+ firstReciverName + ", recivedDate=" + recivedDate + ", givenBy=" + givenBy + ", Recived=" + Recived
				+ ", Not_Recived=" + Not_Recived + "]";
	}

	public AwardDTO(
			@Size(min = 3, max = 15, message = "Award Name Should Be More Than 3 And less Than 15..!") String awardName,
			@Size(min = 3, max = 15, message = "awardMadeBy Name Should Be More Than 3 And less Than 15..!") String awardMadeBy,
			@Size(min = 3, max = 15, message = "ReciverName Name Should Be More Than 3 And less Than 15..!") String firstReciverName,
			String recivedDate,
			@Size(min = 3, max = 15, message = "AwardGivenBy Name Should Be More Than 3 And less Than 15..!") String givenBy,
			boolean recived, boolean not_Recived) {
		super();
		this.awardName = awardName;
		this.awardMadeBy = awardMadeBy;
		this.firstReciverName = firstReciverName;
		this.recivedDate = recivedDate;
		this.givenBy = givenBy;
		Recived = recived;
		Not_Recived = not_Recived;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(String awardName) {
		this.awardName = awardName;
	}

	public String getAwardMadeBy() {
		return awardMadeBy;
	}

	public void setAwardMadeBy(String awardMadeBy) {
		this.awardMadeBy = awardMadeBy;
	}

	public String getFirstReciverName() {
		return firstReciverName;
	}

	public void setFirstReciverName(String firstReciverName) {
		this.firstReciverName = firstReciverName;
	}

	public String getRecivedDate() {
		return recivedDate;
	}

	public void setRecivedDate(String recivedDate) {
		this.recivedDate = recivedDate;
	}

	public String getGivenBy() {
		return givenBy;
	}

	public void setGivenBy(String givenBy) {
		this.givenBy = givenBy;
	}

	public boolean isRecived() {
		return Recived;
	}

	public void setRecived(boolean recived) {
		Recived = recived;
	}

	public boolean isNot_Recived() {
		return Not_Recived;
	}

	public void setNot_Recived(boolean not_Recived) {
		Not_Recived = not_Recived;
	}

	
}
