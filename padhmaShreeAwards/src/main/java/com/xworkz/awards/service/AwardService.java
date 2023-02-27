package com.xworkz.awards.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.awards.dto.AwardDTO;
import com.xworkz.awards.entity.AwardEntity;

public interface AwardService {

	Set<ConstraintViolation<AwardDTO>> validateAndSave(AwardDTO dto);
	
	default AwardDTO findby(int id) {
		System.out.println("Running findBy....");
		return null;
	}
	
}
