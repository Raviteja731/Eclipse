package com.xworkz.collections.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class WeaponDTO implements Serializable{

	private String name;
	private String madeBy;
	private int price;
	private Type type;
	private LocalDate madeOn;
	
	public WeaponDTO() {
		System.out.println("Running Default Constructor in Weapon");
	}

	public WeaponDTO(String name, String madeBy, int price, Type type, LocalDate madeOn) {
		super();
		this.name = name;
		this.madeBy = madeBy;
		this.price = price;
		this.type = type;
		this.madeOn = madeOn;
	}

	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeBy=" + madeBy + ", price=" + price + ", type=" + type + ", madeOn="
				+ madeOn + "]";
	}

	
	public int hascod() {
		System.out.println("Running Hascode Method");
		return 20;
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Running Equals Method");
		if(obj!=null)
		{
			if(obj instanceof WeaponDTO)
			{
				WeaponDTO dto = (WeaponDTO)obj;
			   if(dto.name.equals(this.name))
			   {
				   System.out.println("Name is matched : "+dto.name);
				   return true;
			   }
			}
		}
		return false;
				
	}
	private int compareTo(WeaponDTO we) {
		return this.name.compareTo(we.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeBy() {
		return madeBy;
	}

	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public LocalDate getMadeOn() {
		return madeOn;
	}

	public void setMadeOn(LocalDate madeOn) {
		this.madeOn = madeOn;
	}
	
}
