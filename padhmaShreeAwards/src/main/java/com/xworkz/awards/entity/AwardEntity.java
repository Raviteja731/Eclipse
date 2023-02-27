package com.xworkz.awards.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "award")
@NoArgsConstructor
public class AwardEntity {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "AwardName")
	private String AwardName;
	@Column(name = "FirstRecived")
	private String FirstRecived;
	@Column(name = "awardMadeBy")
	private String awardMadeBy;
	@Column(name = "GivenBy")
	private String GivenBy;
	@Column(name = "RecivedDate")
	private String RecivedDate;
	@Column(name = "Recived")
	private boolean Recived;
	@Column(name = "Not_Recived")
	private boolean Not_Recived;

	public AwardEntity() {
		System.out.println("created AwardEntity....");
	}

	public AwardEntity(int id, String awardName, String firstRecived, String awardMadeBy, String givenBy,
			String recivedDate, boolean recived, boolean not_Recived) {
		super();
		this.id = id;
		AwardName = awardName;
		FirstRecived = firstRecived;
		this.awardMadeBy = awardMadeBy;
		GivenBy = givenBy;
		RecivedDate = recivedDate;
		Recived = recived;
		Not_Recived = not_Recived;
	}

	@Override
	public String toString() {
		return "AwardEntity [id=" + id + ", AwardName=" + AwardName + ", FirstRecived=" + FirstRecived
				+ ", awardMadeBy=" + awardMadeBy + ", GivenBy=" + GivenBy + ", RecivedDate=" + RecivedDate
				+ ", Recived=" + Recived + ", Not_Recived=" + Not_Recived + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAwardName() {
		return AwardName;
	}

	public void setAwardName(String awardName) {
		AwardName = awardName;
	}

	public String getFirstRecived() {
		return FirstRecived;
	}

	public void setFirstRecived(String firstRecived) {
		FirstRecived = firstRecived;
	}

	public String getAwardMadeBy() {
		return awardMadeBy;
	}

	public void setAwardMadeBy(String awardMadeBy) {
		this.awardMadeBy = awardMadeBy;
	}

	public String getGivenBy() {
		return GivenBy;
	}

	public void setGivenBy(String givenBy) {
		GivenBy = givenBy;
	}

	public String getRecivedDate() {
		return RecivedDate;
	}

	public void setRecivedDate(String recivedDate) {
		RecivedDate = recivedDate;
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
