package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.exceptions.IplException;

public class IplRepoImple implements IplRepository {

	private IplDTO[] ipls = new IplDTO[10];
	private int index = 0;
	private String argument;

	@Override
	public boolean create(IplDTO ipl) {
		System.out.println("Running created Ipl" + ipl);
		if (this.index >= this.ipls.length) {
			throw new IplException();

		}
		this.ipls[this.index] = ipl;
		System.out.println("save " + ipl + "Index " + this.index);
		this.index++;
		return true;
	}

//	@Override
//	public String findteamName(IplDTO fia) {
//		System.out.println("Running findteamName ");
//
//		for (IplDTO iplDTO : ipls) {
//			if (iplDTO != null && this.ipls.equals(findteamName(fia))) {
//				System.out.println("Found team Name " + iplDTO);
//				return iplDTO;
//			}
//
//		}
//
//		System.out.println("Not found team Name");
//
//		return IplRepository.super.findteamName(fia);
//	}
	@Override
	public   IplDTO findteamName(String argument) {
		System.out.println("running find...");

		for (IplDTO dto : this.ipls) {
			if (dto != null) {
				System.out.println("if checked");
				if (dto.getTeamName().equals(argument)) {
					System.out.println("name matched :"+argument);
					return dto;
				}
				else {
					System.err.println("name not matched");
				}
			}

		}
		return IplRepository.super.findteamName(argument);
	}

}
