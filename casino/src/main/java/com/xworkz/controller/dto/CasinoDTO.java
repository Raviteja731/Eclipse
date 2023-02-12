package com.xworkz.controller.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "casino_tbl")
public class CasinoDTO {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "CasinoName")
	private String CasinoName;
	@Column(name = "ownerName")
	private String ownerName;
	@Column(name = "WifeName")
	private String WifeName;
	@Column(name = "freeFood")
	private boolean freeFood;
	@Column(name = "freeAlchocal")
	private boolean freeAlchocal;
	@Column(name = "since")
	private int since;

	public CasinoDTO(String casinoName, String ownerName, String wifeName, boolean freeFood, boolean freeAlchocal,
			int since) {
		super();
		System.out.println("Created CasinoController..." + getClass().getSimpleName());
		CasinoName = casinoName;
		this.ownerName = ownerName;
		WifeName = wifeName;
		this.freeFood = freeFood;
		this.freeAlchocal = freeAlchocal;
		this.since = since;
	}

	@Override
	public String toString() {
		return "CasinoDTO [CasinoName=" + CasinoName + ", ownerName=" + ownerName + ", WifeName=" + WifeName
				+ ", freeFood=" + freeFood + ", freeAlchocal=" + freeAlchocal + ", since=" + since + "]";
	}

	public String getCasinoName() {
		return CasinoName;
	}

	public void setCasinoName(String casinoName) {
		CasinoName = casinoName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getWifeName() {
		return WifeName;
	}

	public void setWifeName(String wifeName) {
		WifeName = wifeName;
	}

	public boolean isFreeFood() {
		return freeFood;
	}

	public void setFreeFood(boolean freeFood) {
		this.freeFood = freeFood;
	}

	public boolean isFreeAlchocal() {
		return freeAlchocal;
	}

	public void setFreeAlchocal(boolean freeAlchocal) {
		this.freeAlchocal = freeAlchocal;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

}
