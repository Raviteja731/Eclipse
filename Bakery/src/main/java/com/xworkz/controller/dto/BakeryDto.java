package com.xworkz.controller.dto;


public class BakeryDto {

	private String bakeryName;
	private String ownerName;
	private String ownerWifeName;
	private boolean married;
	private String famousFor;
	private int since;
	
	
	public BakeryDto(String bakeryName, String ownerName, String ownerWifeName, boolean married, String famousFor,
			int since) {
		super();
		System.out.println("Created BakeryDto..."+getClass().getSimpleName());
		this.bakeryName = bakeryName;
		this.ownerName = ownerName;
		this.ownerWifeName = ownerWifeName;
		this.married = married;
		this.famousFor = famousFor;
		this.since = since;
	}

	@Override
	public String toString() {
		return "BakeryDto [bakeryName=" + bakeryName + ", ownerName=" + ownerName + ", ownerWifeName=" + ownerWifeName
				+ ", married=" + married + ", famousFor=" + famousFor + ", since=" + since + "]";
	}

	public String getBakeryName() {
		return bakeryName;
	}

	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerWifeName() {
		return ownerWifeName;
	}

	public void setOwnerWifeName(String ownerWifeName) {
		this.ownerWifeName = ownerWifeName;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}
	
	
	
}
