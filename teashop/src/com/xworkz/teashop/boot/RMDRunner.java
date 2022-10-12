package com.xworkz.teashop.boot;

import com.xworkz.teashop.RMD;

public class RMDRunner {

	public static void main(String[] args) {

	RMD pan = new RMD();
		System.out.println("RMD FullForm :-"+pan.name);
		System.out.println("Location :-"+pan.factoryLocation);
		System.out.println("Company Founder :-"+pan.founder);
		System.out.println("Company Estb Year :"+pan.companyStartedYear);
		System.out.println("RMD Price :-"+pan.price);
		System.out.println("Packit Weight :-"+pan.rmdPackitWeight);
		System.out.println("Masala Colour :-"+pan.panMasalaColour);
		System.out.println("pan GoodForHealth :-"+pan.rmdGoodForHealth);
		System.out.println("RMD Contains Tobacco :-"+pan.rmdContainsTobacco);
		System.out.println("Does RMD Has Sideeffects"+pan.rmdHasSideeffects);
		System.out.println("Famous Gutuka King :-"+pan.gutukaKing);
		System.out.println("NoOfEmploy :"+pan.noCompEmploy);
		System.out.println("Compy Net Worth :"+pan.compNetWorth);
		System.out.println("per Month Profit :"+pan.compProfitPerMonth);
		System.out.println("No Of Staff :"+pan.noStaffWorking);
		System.out.println("Avilable in India :"+pan.avilableInIndia);
		System.out.println("Chemical Used :"+pan.chemicalUsed);
		
		System.out.println("------updated details------");
	pan.rmdHasSideeffects=true;
	pan.gutukaKing="Suniel Shetty";
	pan.noCompEmploy=500;
	pan.compNetWorth=227000000L;
	pan.compProfitPerMonth=100;
	pan.avilableInIndia=true;
	pan.onlineShoping=true;
	pan.chemicalUsed="Magnesium carbonate";
	System.out.println("RMD FullForm :-"+pan.name);
	System.out.println("Location :-"+pan.factoryLocation);
	System.out.println("Company Founder :-"+pan.founder);
	System.out.println("Company Estb Year :"+pan.companyStartedYear);
	System.out.println("RMD Price :-"+pan.price);
	System.out.println("Packit Weight :-"+pan.rmdPackitWeight);
	System.out.println("Masala Colour :-"+pan.panMasalaColour);
	System.out.println("pan GoodForHealth :-"+pan.rmdGoodForHealth);
	System.out.println("RMD Contains Tobacco :-"+pan.rmdContainsTobacco);
	System.out.println("Does RMD Has Sideeffects"+pan.rmdHasSideeffects);
	System.out.println("Famous Gutuka King :-"+pan.gutukaKing);
	System.out.println("NoOfEmploy :"+pan.noCompEmploy);
	System.out.println("Compy Net Worth :"+pan.compNetWorth);
	System.out.println("per Month Profit :"+pan.compProfitPerMonth);
	System.out.println("No Of Staff :-"+pan.noStaffWorking);
	System.out.println("Avilable in India :-"+pan.avilableInIndia);
	System.out.println("Chemical Used :-"+pan.chemicalUsed);
	}

}
