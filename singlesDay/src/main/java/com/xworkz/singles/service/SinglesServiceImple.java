package com.xworkz.singles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.singles.dto.SinglesDTO;
import com.xworkz.singles.repository.SinglesRepo;

@Service
public class SinglesServiceImple implements SinglesService {

	@Autowired
	private SinglesRepo singlesRepo;
	
	public SinglesServiceImple() {
		System.out.println("Running SinglesServiceImple.."+getClass().getSimpleName());
	}
	
	@Override
	public boolean validationAndSave(SinglesDTO dto) {
		System.out.println("Running validationAndSave...");
		boolean save = singlesRepo.save(dto);
		System.out.println("Saved.."+save);
		return true;
	}

}
