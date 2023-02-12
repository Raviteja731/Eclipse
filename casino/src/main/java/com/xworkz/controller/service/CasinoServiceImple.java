package com.xworkz.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.controller.dto.CasinoDTO;
import com.xworkz.controller.repository.CasinoRepository;

@Service
public class CasinoServiceImple implements CasinoService {

	@Autowired
	private CasinoRepository casinoRepository;
	
	public CasinoServiceImple() {
		System.out.println("Created CasinoServiceImple..."+getClass().getSimpleName());
	}

	@Override
	public boolean validationAndSave(CasinoDTO dto) {
		System.out.println("Created validationAndSave...");
		boolean save = casinoRepository.save(dto);
		System.out.println(save);
		return true;
	}
}
