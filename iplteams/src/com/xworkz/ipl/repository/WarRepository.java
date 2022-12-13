package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository{

	boolean create(WarDTO dto);
	
	boolean create(WarDTO[] dto);
	
	int total();
	
	default WarDTO findByStandardBy(String startedBy) {
		return null;
	}
	default WarDTO findByStandardBy(String startedwith,String startedBy) 
	{
		return null;
	}
	default WarDTO findByStartDateGreaterThanOrEqualTo(LocalDateTime date)
	{
		return null;
	}
	default WarDTO findByStartDateLesserThanOrEqualTo(LocalDateTime date)
	{
		return null;
	}
	default WarDTO findByStartDateAndEndDate(LocalDateTime start,LocalDateTime end)
	{
		return null;
	}
}
