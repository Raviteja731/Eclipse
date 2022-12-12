package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {

	boolean creat(IplDTO ipl);
	
	default int total() {
		return 0;
	}
}
