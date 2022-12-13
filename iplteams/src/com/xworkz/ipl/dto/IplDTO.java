package com.xworkz.ipl.dto;

public class IplDTO extends AbstractAuditDTO {

	private String teamName;
	private String captianName;
	private boolean ownerAlive;
	private double purse;
	private int wins;
	private int defeats;
	
	@Override
	public String toString() {
		return "IplDTO [teamName=" + teamName + ", captianName=" + captianName + ", ownerAlive=" + ownerAlive
				+ ", purse=" + purse + ", wins=" + wins + ", defeats=" + defeats + ", toString()=" + super.toString()
				+ "]";
	}

	public IplDTO() {
		System.out.println("Running default const of IplDO");
	}

	

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCaptialName() {
		return captianName;
	}

	public void setCaptialName(String captialName) {
		this.captianName = captialName;
	}

	public boolean isOwnerAlive() {
		return ownerAlive;
	}

	public void setOwnerAlive(boolean ownerAlive) {
		this.ownerAlive = ownerAlive;
	}

	public double getPurse() {
		return purse;
	}

	public void setPurse(double purse) {
		this.purse = purse;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getDefeats() {
		return defeats;
	}

	public void setDefeats(int defeats) {
		this.defeats = defeats;
	}
	
	
	
	
}
