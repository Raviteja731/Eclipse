package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEnginer {

	@Autowired
	@Qualifier("employeName")
	private String name;
	@Autowired
	@Qualifier("employeSalary")
	private long salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("employeExp")
	private int exp;
	
	public String getName() {
		return name;
	}
	
	public long getSalary() {
		return salary;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public int getExp() {
		return exp;
	}
}
