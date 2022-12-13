package com.xworkz.ipl.boot;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.repository.IplRepoImple;
import com.xworkz.ipl.repository.IplRepository;

public class Runner {
	public static void main(String[] args) {

		IplRepository repository = new IplRepoImple();

		IplDTO dto = new IplDTO();
		dto.setCaptialName("Virat");
		dto.setTeamName("RCB");
		repository.create(dto);
		IplDTO dto1 = new IplDTO();
		dto1.setTeamName("CSK");
IplDTO ref=repository.findteamName(repository);
		repository.findteamName(ref);

	}
}
