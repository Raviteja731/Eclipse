package com.xworkz.examples.boot;

public class Name {

	private final String name;
	Name(){
		name = "Nimesa";
	}
	Name(String name){
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;
		if(obj==null || getClass() != obj.getClass())return false;
		Name name = (Name)obj;
		return name.name.equalsIgnoreCase(this.name);
	
	}
}
