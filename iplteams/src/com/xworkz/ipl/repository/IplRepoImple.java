package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public class IplRepoImple implements IplRepository   {

	private IplDTO[] ipls = new IplDTO[10];
	private int index= 0;
	
	@Override
	public boolean creat(IplDTO ipl) {
		System.out.println("Running created Ipl"+ipl);
		if(this.index>=this.ipls.length) {
			System.out.println("Array Out Of Boundarys");
			return false;
		}
		this.ipls[this.index]=ipl;
		System.out.println("save "+ipl+"Index "+this.index);
		this.index++;
		return true;
	}

}
