package com.xworkz.singles.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@Table(name = "singles_info")
public class SinglesDTO {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "mobileNo")
	private long mobileNo;
	@Column(name = "gender")
	private String gender;
	@Column(name = "location")
	private String location;
	
	public SinglesDTO(String name, int age, long mobileNo, String gender, String location) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.location = location;
	}

	
}
