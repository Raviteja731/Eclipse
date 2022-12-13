package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.exceptions.IplException;

public class WarRepoImpleme implements WarRepository {

	private WarDTO[] war = new WarDTO[10];
	private int index = 0;
	private String argument;
	
	@Override
	public boolean create(WarDTO dto) {
		System.out.println("Running Created WarDTO"+dto);
		if(this.index>=this.war.length) {
			throw new IplException();
		}
		this.war[this.index]=dto;
		System.out.println("save "+dto+"index "+this.index);
		this.index++;
		return true;
	}

	@Override
	public boolean create(WarDTO[] dto) {
		System.out.println("Running Create Method");
		
		return false;
	}

	@Override
	public int total() {
		System.out.println("Running total Method");
		return this.index;
	}
	@Override
	public WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date) {
		System.out.println("Running findByStartDateGreaterThanOrEqualTo Method");
		for (WarDTO warDTO : war) {
			if(date !=null ) {
				System.out.println("if Checked ");
				if( warDTO.getStartdate().isAfter(date))   {
					System.out.println("Name Matched :"+date);
				}
			}
		}
		return WarRepository.super.findByStartDateGreaterThanOrEqualTo(date);
	}
	@Override
	public WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime localdate) {
		System.out.println("Running findByStartDateLesserThanOrEqualTo Method");
		for (WarDTO warDTO : war) {
			if(localdate !=null ) {
				System.out.println("if Checked ");
				if( warDTO.getStartdate().isBefore(localdate))   {
					System.out.println("Name Matched :"+localdate);
				}
			}
		}
		return WarRepository.super.findByStartDateLesserThanOrEqualTo(localdate);
	}
	@Override
	public WarDTO findByStartDateAndEndDate(LocalDateTime start, LocalDateTime end) {
		System.out.println("Running findByStartDateAndEndDate Method");
		for (WarDTO warDTO : war) {
			if(warDTO != null) {
				System.out.println("warDTO is found "+start+end);
			}
		}
		System.out.println("warDTO is not found");
		return WarRepository.super.findByStartDateAndEndDate(start, end);
	}

}
