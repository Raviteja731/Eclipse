package com.xwork.equal;

public class God {

	private String godName;
	private String wifeName;
	private String weapon;
	private String vechical;
	private boolean children;
	private int noOfChildrens;
	private String fatherName;
	private String motherName;
	private int noOfTemples;;
	private boolean godIsGreat;
	
	public God(String godName, String wifeName, String weapon, String vechical, boolean children, int noOfChildrens,
			String fatherName, String motherName, int noOfTemples, boolean godIsGreat) {
		this.godName = godName;
		this.wifeName = wifeName;
		this.weapon = weapon;
		this.vechical = vechical;
		this.children = children;
		this.noOfChildrens = noOfChildrens;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.noOfTemples = noOfTemples;
		this.godIsGreat = godIsGreat;
	}

	@Override
	public String toString() {
		return "God [godName=" + godName + ", wifeName=" + wifeName + ", weapon=" + weapon + ", vechical=" + vechical
				+ ", children=" + children + ", noOfChildrens=" + noOfChildrens + ", fatherName=" + fatherName
				+ ", motherName=" + motherName + ", noOfTemples=" + noOfTemples + ", godIsGreat=" + godIsGreat + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running equals Method");
		if(obj instanceof God) {
			System.out.println("checking obj is instance of god");
			God god= (God)obj;
			if(this.godName.equals(god.godName)&& this.fatherName.equals(god.fatherName)&& this.motherName.equals(god.motherName)&& this.vechical.equals(god.vechical)&& this.wifeName.equals(god.wifeName)) {
				System.out.println("checking obj is equal to god,u can procced");
				return true;
			}
			else {
				System.out.println("checking obj is equal to god,u cannot procced");
			}
		}
		return false;
	}

	
	public String getGodName() {
		return godName;
	}

	public void setGodName(String godName) {
		this.godName = godName;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getVechical() {
		return vechical;
	}

	public void setVechical(String vechical) {
		this.vechical = vechical;
	}

	public boolean isChildren() {
		return children;
	}

	public void setChildren(boolean children) {
		this.children = children;
	}

	public int getNoOfChildrens() {
		return noOfChildrens;
	}

	public void setNoOfChildrens(int noOfChildrens) {
		this.noOfChildrens = noOfChildrens;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public int getNoOfTemples() {
		return noOfTemples;
	}

	public void setNoOfTemples(int noOfTemples) {
		this.noOfTemples = noOfTemples;
	}

	public boolean isGodIsGreat() {
		return godIsGreat;
	}

	public void setGodIsGreat(boolean godIsGreat) {
		this.godIsGreat = godIsGreat;
	}
	
	
	
	
}
