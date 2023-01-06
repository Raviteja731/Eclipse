package com.xworkz.collections.dto.boot;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.collections.dto.Type;
import com.xworkz.collections.dto.WeaponDTO;

public class WeaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO weDto1 = new WeaponDTO("Mosin", "Surya", 2500, Type.MESSIAL, LocalDate.now());
		WeaponDTO weDto2 = new WeaponDTO("AKM", "Ravi", 20000, Type.GUN, LocalDate.now());
		WeaponDTO weDto3 = new WeaponDTO("DP", "Teja", 30000, Type.PISTOL, LocalDate.now());
		WeaponDTO weDto4 = new WeaponDTO("AUG", "Harshit", 5678, Type.LONG_GUN, LocalDate.now());
		WeaponDTO weDto5 = new WeaponDTO("M416", "Bharata", 76568, Type.LONG_RANGE, LocalDate.now());
		WeaponDTO weDto6 = new WeaponDTO("M16A", "Darshan", 78865, Type.SHORT_RANGE, LocalDate.now());
		WeaponDTO weDto7 = new WeaponDTO("AWM", "Karthi", 23488, Type.CUTTERE_TYPE, LocalDate.now());
		WeaponDTO weDto8 = new WeaponDTO("M24", "Akshay", 7637, Type.GUN, LocalDate.now());
		WeaponDTO weDto9 = new WeaponDTO("SKS", "Shubam", 4896, Type.LONG_GUN, LocalDate.now());
		WeaponDTO weDto10 = new WeaponDTO("Growsa", "Manu", 6598, Type.SHORT_RANGE, LocalDate.now());
		WeaponDTO weDto11 = new WeaponDTO("UMP", "Omkar", 5487, Type.LONG_RANGE, LocalDate.now());
		WeaponDTO weDto12 = new WeaponDTO("UZY", "Nataraj", 9876, Type.PISTOL, LocalDate.now());
		WeaponDTO weDto13 = new WeaponDTO("M14", "Sanju", 53467, Type.SHORT_RANGE, LocalDate.now());
		WeaponDTO weDto14 = new WeaponDTO("MG3", "Arun", 65467, Type.MESSIAL, LocalDate.now());
		WeaponDTO weDto15 = new WeaponDTO("Kar98", "Hareesha", 46453, Type.GUN, LocalDate.now());
		WeaponDTO weDto16 = new WeaponDTO("THOMSN", "Ganesh", 43769, Type.CUTTERE_TYPE, LocalDate.now());
		WeaponDTO weDto17 = new WeaponDTO("M762", "Vinay", 53568, Type.PISTOL, LocalDate.now());
		WeaponDTO weDto18 = new WeaponDTO("SCKRLE", "Somu", 34567, Type.CUTTERE_TYPE, LocalDate.now());
		WeaponDTO weDto19 = new WeaponDTO("AMR", "Varun", 54457, Type.MESSIAL, LocalDate.now());
		WeaponDTO weDto20 = new WeaponDTO("VECTOR", "Rock", 76567, Type.SHORT_RANGE, LocalDate.now());

		WeaponDTO gun = new WeaponDTO();
		Collection<WeaponDTO> wepon = Stream.of(weDto1,weDto2,weDto3,weDto4,weDto5,weDto6,weDto7,weDto8,weDto9,weDto10,weDto11,weDto12,weDto13,weDto14,weDto15,weDto16,weDto17,weDto18,weDto19,weDto20).
			collect(Collectors.toList());
		wepon.stream().forEach(c->System.out.println(c));
		
		System.out.println(System.lineSeparator());
		
		System.out.println("Printing All Weapons by greater price");
		wepon.stream().filter(c -> c.getPrice() > 1000).collect(Collectors.toList())
		.forEach(p -> System.out.println(p));
		
		System.out.println(System.lineSeparator());

		System.out.println("Print all weapons madeby and made on");
		wepon.stream().collect(Collectors.toList())
				.forEach(r -> System.out.println("Made By    : " + r.getMadeBy() + "    Made On  : " + r.getMadeOn()));

		System.out.println(System.lineSeparator());

		System.out.println("Print all the weapons by name sorted in desc order");

		wepon.stream().sorted((a1, a2) -> a2.getName().compareToIgnoreCase(a1.getName())).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by madeBy  :");
		wepon.stream().sorted((a1,a2)-> a1.getMadeBy().compareTo(a2.getMadeBy())).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepon.stream().sorted((a1,a2)->a1.getMadeOn().compareTo(a2.getMadeOn())).collect(Collectors.toList()).forEach(r->System.out.println(r));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepon.stream().sorted((a1,a2)->Double.compare(a1.getPrice(), a2.getPrice())).collect(Collectors.toList()).forEach(p->System.out.println(p));
		
		System.out.println(System.lineSeparator());
		System.out.println("all weapons sort by on  :");
		wepon.stream().sorted((a1,a2)->Double.compare(a2.getPrice(), a1.getPrice())).collect(Collectors.toList()).forEach(p->System.out.println(p));

		
	}

}
