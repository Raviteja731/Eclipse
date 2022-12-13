 package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {

	boolean create(IplDTO ipl);
	
	default int total() {
		return 0;
	}
	default IplDTO findteamName(String argument) {
		return null;
	}
}
