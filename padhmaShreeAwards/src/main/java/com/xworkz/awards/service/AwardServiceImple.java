package com.xworkz.awards.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.awards.dto.AwardDTO;
import com.xworkz.awards.entity.AwardEntity;
import com.xworkz.awards.repository.AwardRepository;

@Service
public class AwardServiceImple implements AwardService {

	@Autowired
	private AwardRepository awardRepository;

	public AwardServiceImple() {
		System.out.println("Running AwardServiceImple...");
	}

	@Override
	public Set<ConstraintViolation<AwardDTO>> validateAndSave(AwardDTO dto) {
		System.out.println("Running validateAndSave...");
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AwardDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.out.println("violations in dto " + dto);
			return violations;
		}
		System.out.println("violations not found");
		AwardEntity entity = new AwardEntity();
		entity.setAwardName(dto.getAwardName());
		entity.setAwardMadeBy(dto.getAwardMadeBy());
		entity.setFirstRecived(dto.getFirstReciverName());
		entity.setGivenBy(dto.getGivenBy());
		entity.setRecivedDate(dto.getRecivedDate());
		entity.setRecived(dto.isRecived());
		entity.setNot_Recived(dto.isNot_Recived());
		boolean saved = this.awardRepository.save(entity);
		System.out.println("Entity is Saved :" + saved);
		return Collections.emptySet();
	}

	public AwardDTO findby(int id) {
		if (id > 0) {
			AwardEntity awardEntity = awardRepository.findBy(id);
			System.out.println("Entity is found in service for id" + id);
			AwardDTO dto = new AwardDTO();

			dto.setAwardName(awardEntity.getAwardName());
			dto.setAwardMadeBy(awardEntity.getAwardMadeBy());
			dto.setFirstReciverName(awardEntity.getFirstRecived());
			dto.setGivenBy(awardEntity.getGivenBy());
			dto.setRecivedDate(awardEntity.getRecivedDate());
			dto.setRecived(awardEntity.isRecived());
			dto.setNot_Recived(awardEntity.isNot_Recived());
			System.out.println(awardRepository.save(awardEntity));
			return dto;
		}
		return AwardService.super.findby(id);
	}

}
