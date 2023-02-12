package com.xworkz.component.dto;

import lombok.Data;

@Data
public class InstaDto {

	private String name;
	private String password;
	
	public InstaDto() {
		System.out.println("Running InstaDto...."+getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "InstaDto [name=" + name + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
