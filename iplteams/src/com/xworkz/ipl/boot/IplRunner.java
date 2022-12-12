package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepoImple;
import com.xworkz.ipl.repository.IplRepository;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository rep =new IplRepoImple();
		
		IplDTO dto = new IplDTO();
		dto.setCaptialName("Sachin");
		dto.setTeamName("MI");
		dto.setOwnerAlive(true);
		dto.setPurse(49);
		dto.setWins(231);
		dto.setDefeats(120);
		dto.setCreatedBy("Laptop");
		dto.setCreatedDate(LocalDateTime.now());
		
		rep.creat(dto);
	}

}
