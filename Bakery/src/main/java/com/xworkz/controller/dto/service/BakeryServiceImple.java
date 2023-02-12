package com.xworkz.controller.dto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.controller.dto.BakeryDto;
import com.xworkz.controller.dto.repository.BakeryRepository;

@Service
public class BakeryServiceImple implements BakeryService {

	@Autowired
	private BakeryRepository bakeryRepository;

	public BakeryServiceImple() {
		System.out.println("created BakeryServiceImple..." + getClass().getSimpleName());
	}

	@Override
	public boolean validationAndSave(BakeryDto dto) {
		System.out.println("created validationAndSave..");
		boolean save = bakeryRepository.save(dto);
		System.out.println(save);
		return true;
	}

}
