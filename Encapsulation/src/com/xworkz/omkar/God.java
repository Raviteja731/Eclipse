package com.xworkz.omkar;

public class God {

	private String name = "Shiva";
	String gender;
	String weapon;
	String wifeName;
	String vechicalName;
	String power;
	String Famoustemple;
	String location;
	int avataras;
	boolean powerfull;
	boolean single;
	
	public God(String gender, String weapon, String wifeName, String vechicalName, String power, String famoustemple,
			String location, int avataras, boolean powerfull, boolean single) {
		this.gender = gender;
		this.weapon = weapon;
		this.wifeName = wifeName;
		this.vechicalName = vechicalName;
		this.power = power;
		Famoustemple = famoustemple;
		this.location = location;
		this.avataras = avataras;
		this.powerfull = powerfull;
		this.single = single;
	}
	public String getName()
	
	{
		return this.name;
	}
	void setName(String name)
	{
		this.name=name;
	}
	public void showOff()
	{
		System.out.println(this.single);
		System.out.println(this.wifeName);
		System.out.println(this.power);
		System.out.println(this.powerfull);
		System.out.println(this.avataras);
		System.out.println(this.Famoustemple); 
		System.out.println(this.location);
		System.out.println(this.vechicalName);
		System.out.println(this.gender);
		System.out.println(this.weapon);
		
	}
}
