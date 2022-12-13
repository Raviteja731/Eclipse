package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepoImple;
import com.xworkz.ipl.repository.IplRepository;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository rep = new IplRepoImple();

		IplDTO dto = new IplDTO();
		dto.setCaptialName("Sachin");
		dto.setTeamName("MI");
		dto.setOwnerAlive(true);
		dto.setPurse(49);
		dto.setWins(231);
		dto.setDefeats(120);
		dto.setCreatedBy("Laptop");
		dto.setCreatedDate(LocalDateTime.now());

		rep.create(dto);
		System.out.println(System.lineSeparator());

		
		System.out.println(System.lineSeparator());
		IplDTO dto1 = new IplDTO();
		dto1.setCaptialName("Dhoni");
		dto1.setTeamName("CSK");
		dto1.setOwnerAlive(true);
		dto1.setPurse(10);
		dto1.setWins(231);
		dto1.setDefeats(120);
		dto1.setCreatedBy("Laptop");
		dto1.setCreatedDate(LocalDateTime.now());

		rep.create(dto1);
		System.out.println(System.lineSeparator());

		
		System.out.println(rep.findteamName("MI"));
				
		System.out.println(System.lineSeparator());
		IplDTO dto11 = new IplDTO();
		dto11.setCaptialName("Virat");
		dto11.setTeamName("RCB");
		dto11.setOwnerAlive(true);
		dto11.setPurse(10);
		dto11.setWins(231);
		dto11.setDefeats(120);
		dto11.setCreatedBy("Laptop");
		dto11.setCreatedDate(LocalDateTime.now());
		
		rep.create(dto11);


	}

}
