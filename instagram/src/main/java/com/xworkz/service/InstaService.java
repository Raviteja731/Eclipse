package com.xworkz.service;

import java.util.Set;

import javax.swing.SpringLayout.Constraints;

import com.xworkz.component.dto.InstaDto;

public interface InstaService {
Set<Constraints> validateAndSave(InstaDto aeroplaneDTO);
	
	default InstaDto findby(int id) {
		System.out.println("Running the findby in AeroplaneService....");
		return null;

}
}
