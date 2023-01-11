package com.xworkz.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {

	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	@Qualifier("softwareFree")
	private boolean free;
	@Autowired
	@Qualifier("softwareVersion")
	private int version;
	@Autowired
	@Qualifier("releaseDate")
	private int date;
	
	
	public String getName() {
		return name;
	}
	
	public String getDeveloper() {
		return developer;
	}
	
	public boolean getFree() {
		return free;
	}
	
	public int getVersion() {
		return version;
	}
	
	public int getDate() {
		return date;
	}
}
