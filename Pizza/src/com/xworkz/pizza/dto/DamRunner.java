package com.xworkz.pizza.dto;

import java.awt.Panel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import javax.swing.text.AsyncBoxView.ChildLocator;

public class DamRunner {

	public static void main(String[] args) {

		Collection<String> karnatakaDams = new ArrayList<String>();

		karnatakaDams.add("VaniVilasa Sagara");
		karnatakaDams.add("SRS");
		karnatakaDams.add("Linganamakki");
		karnatakaDams.add("Almatti Dam");
		karnatakaDams.add("Basava Sagara");
		karnatakaDams.add("Raja Lakshmana");
		karnatakaDams.add("Tunga Bhadara");
		karnatakaDams.add("Hemavathi");
		karnatakaDams.add("Kabbi Reserver");
		karnatakaDams.add("Lingana Makki");
		karnatakaDams.add("Supa ");
		karnatakaDams.add("Kadra");
		karnatakaDams.add("Karanaja Dam");
		System.out.println("Karanata Dam  name Is   :" + karnatakaDams);

		System.out.println("Karanata Dam  Size Is   :" + karnatakaDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> ref = karnatakaDams.iterator();
		System.out.println("starts  With T =============================================");

		while (ref.hasNext()) {
			String element = ref.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> ref1 = karnatakaDams.iterator();

		while (ref1.hasNext()) {
			String element = ref1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> ref2 = karnatakaDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (ref2.hasNext()) {
			String element = (String) ref2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> ref3 = karnatakaDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (ref3.hasNext()) {
			String element = ref3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> ref4 = karnatakaDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (ref4.hasNext()) {
			String element = ref4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> ref5 = karnatakaDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (ref5.hasNext()) {
			String element = ref5.next();
			StringBuffer rev = new StringBuffer(element);

			if (element.equals(rev.reverse().toString())) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> ref6 = karnatakaDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (ref6.hasNext()) {
			String element = ref6.next();
			if (element.contains("P")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Tamil Nadu Dams ----------------------------------------------------------");
		Collection<String> tamilNaduDams = new ArrayList<String>();

		tamilNaduDams.add("Animaduvu Dam");
		tamilNaduDams.add("Adavinainarkovil Dam");
		tamilNaduDams.add("Aliyar Dam");
		tamilNaduDams.add("Amaravathi Dam");
		tamilNaduDams.add("Anaikuttam Dam");
		tamilNaduDams.add("Andiappanur Odai Dam");
		tamilNaduDams.add("Avalanche Dam");
		tamilNaduDams.add("Barur Dam");
		tamilNaduDams.add("Chinnar Dam");
		tamilNaduDams.add("Chembarambakkam Dam");
		tamilNaduDams.add("Chittar I Dam");
		tamilNaduDams.add("Emerald Dam");
		tamilNaduDams.add("Eravangalar Dam");
		tamilNaduDams.add("Gatana Dam");
		tamilNaduDams.add("Glenmorgan");
		tamilNaduDams.add("Golwarpatti Dam");
		tamilNaduDams.add("Highwavys Dam");
		tamilNaduDams.add("Gundar Dam");
		tamilNaduDams.add("Kuttiyar Dam");
		tamilNaduDams.add("Lower Bhavani Dam");
		tamilNaduDams.add("Lower Kodayar Dam");
		tamilNaduDams.add("Lower Nirar Dam");
		tamilNaduDams.add("Manalar Dam");
		tamilNaduDams.add("Manimukthanadhi Dam");
		tamilNaduDams.add("Manjalar Dam");
		tamilNaduDams.add("Maravakandi Forbay Dam");
		tamilNaduDams.add("Mirugandanadhi Dam");
		tamilNaduDams.add("Mordhana Dam");
		tamilNaduDams.add("Moyar Forebay Dam");
		tamilNaduDams.add("Nambiar Dam");
		tamilNaduDams.add("Nilayur Bed Dam");
		tamilNaduDams.add("Palar Porundalar Dam");

		System.out.println("Tamil Nadu  Dam name Is   :" + tamilNaduDams);
		System.out.println("Tamil Nadu Dam Size Is   :" + tamilNaduDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> tamil = tamilNaduDams.iterator();
		System.out.println("starts  With T =============================================");

		while (tamil.hasNext()) {
			String element = tamil.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> tamil1 = tamilNaduDams.iterator();

		while (tamil1.hasNext()) {
			String element = tamil1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> tamil2 = tamilNaduDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (tamil2.hasNext()) {
			String element = (String) tamil2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> tamil3 = tamilNaduDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (tamil3.hasNext()) {
			String element = tamil3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> tamil4 = tamilNaduDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (tamil4.hasNext()) {
			String element = tamil4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> tamil5 = tamilNaduDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (tamil5.hasNext()) {
			String element = tamil5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(element)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> tamil6 = tamilNaduDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (tamil6.hasNext()) {
			String element = tamil6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Maharastra  Dams ----------------------------------------------------------");
		Collection<String> maharastraDams = new ArrayList<String>();
		maharastraDams.add("Dhamapur");
		maharastraDams.add("Ekrukh");
		maharastraDams.add("Shirsufal");
		maharastraDams.add("Tulshi");
		maharastraDams.add("Khadakwasla");
		maharastraDams.add("Mhaswad");
		maharastraDams.add("Chandpur");
		maharastraDams.add("Walwan");
		maharastraDams.add("Asolamendha");
		maharastraDams.add("Shirvata");
		maharastraDams.add("Thokarwadi");
		maharastraDams.add("Bhandardara");
		maharastraDams.add("Khasapur");
		maharastraDams.add("Purmepeda");
		maharastraDams.add("Sindphana");
		maharastraDams.add("Khelocala");
		maharastraDams.add("Upper Dudhana");
		maharastraDams.add("Koyna");
		maharastraDams.add("Bhudihal");
		maharastraDams.add("Gangapur");
		maharastraDams.add("Nalganga");
		maharastraDams.add("Siddheshwar");

		System.out.println("maharastraDams   name Is   :" + maharastraDams);
		System.out.println("maharastraDams  Size Is   :" + maharastraDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> maharastra = maharastraDams.iterator();
		System.out.println("starts  With T =============================================");

		while (maharastra.hasNext()) {
			String element = maharastra.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> maharastra1 = maharastraDams.iterator();

		while (maharastra1.hasNext()) {
			String element = maharastra1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> maharastra2 = maharastraDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (maharastra2.hasNext()) {
			String element = (String) maharastra2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> maharastra3 = maharastraDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (maharastra3.hasNext()) {
			String element = maharastra3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> maharastra4 = maharastraDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (maharastra4.hasNext()) {
			String element = maharastra4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> maharastra5 = maharastraDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (maharastra5.hasNext()) {
			String element = maharastra5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(element)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> maharastra6 = maharastraDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (maharastra6.hasNext()) {
			String element = maharastra6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("madyapredesh   Dams ----------------------------------------------------------");
		Collection<String> madyapredeshdams = new ArrayList<String>();
		madyapredeshdams.add("Adampura Dam");
		madyapredeshdams.add("Adner Dam");
		madyapredeshdams.add("Agar Agari Dam");
		madyapredeshdams.add("Agar Dam");
		madyapredeshdams.add("Ahirkheda Dam");
		madyapredeshdams.add("Ahmadpur Dam");
		madyapredeshdams.add("Akhajhiri Dam");
		madyapredeshdams.add("Akhetpur Dam");
		madyapredeshdams.add("Ama (Old) Dam");
		madyapredeshdams.add("Amadehi Dam");
		madyapredeshdams.add("Amadi Dam");
		madyapredeshdams.add("Balasamund Dam");
		madyapredeshdams.add("Balia Dam");
		madyapredeshdams.add("Balwantpura Dam");
		madyapredeshdams.add("Bamhodi Dam");
		madyapredeshdams.add("Banchor Dam");
		madyapredeshdams.add("Bandia Dam");
		madyapredeshdams.add("Banganga Dam");
		madyapredeshdams.add("Bankuiya Dam");
		madyapredeshdams.add("Bansagar Dam");
		madyapredeshdams.add("Chhapi Dam");
		madyapredeshdams.add("Chhoti Deori Dam");
		madyapredeshdams.add("Chichbund Dam");
		madyapredeshdams.add("Chichwari Dam");
		madyapredeshdams.add("Chikhalia Dam");
		madyapredeshdams.add("Dadla Dam");
		madyapredeshdams.add("Deep Sagar Dam");
		madyapredeshdams.add("Deogaon Dam");
		madyapredeshdams.add("Gadigaltar Dam");
		madyapredeshdams.add("Gandhi Sagar Dam");
		madyapredeshdams.add("Ghorapachhar Dam");
		madyapredeshdams.add("Guradia Roopchand Dam");
		madyapredeshdams.add("Gurtara Dam");
		madyapredeshdams.add("Mehgawan Dam");
		madyapredeshdams.add("Mod Sagar Dam");

		System.out.println("madyapredeshdams   name Is   :" + madyapredeshdams);
		System.out.println("madyapredeshdams  Size Is   :" + madyapredeshdams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> madyapredesh = madyapredeshdams.iterator();
		System.out.println("starts  With T =============================================");

		while (madyapredesh.hasNext()) {
			String element = madyapredesh.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> madyapredesh1 = madyapredeshdams.iterator();

		while (madyapredesh1.hasNext()) {
			String element = madyapredesh1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> madyapredesh2 = madyapredeshdams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (madyapredesh2.hasNext()) {
			String element = (String) madyapredesh2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> madyapredesh3 = madyapredeshdams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (madyapredesh3.hasNext()) {
			String element = madyapredesh3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> madyapredesh4 = madyapredeshdams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (madyapredesh4.hasNext()) {
			String element = madyapredesh4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> madyapredesh5 = madyapredeshdams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (madyapredesh5.hasNext()) {
			String element = madyapredesh5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(element)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> madyapredesh6 = madyapredeshdams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (madyapredesh6.hasNext()) {
			String element = madyapredesh6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Goa   Dams ----------------------------------------------------------");
		Collection<String> goaDams = new ArrayList<String>();

		goaDams.add("Anjunam Dam");
		goaDams.add("M.I. Dam");
		goaDams.add("Salaulim Dam");

		System.out.println("goaDams   name Is   :" + goaDams);
		System.out.println("goaDams  Size Is   :" + goaDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> goa = goaDams.iterator();
		System.out.println("starts  With T =============================================");

		while (goa.hasNext()) {
			String element = goa.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> goa1 = goaDams.iterator();

		while (goa1.hasNext()) {
			String element = goa1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> goa2 = goaDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (goa2.hasNext()) {
			String element = goa2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> goa3 = goaDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (goa3.hasNext()) {
			String element = goa3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> goa4 = goaDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (goa4.hasNext()) {
			String element = goa4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> goa5 = goaDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (goa5.hasNext()) {
			String element = goa5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(element)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> goa6 = goaDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (goa6.hasNext()) {
			String element = goa6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("telangana   Dams ----------------------------------------------------------");
		Collection<String> telanganadams = new ArrayList<String>();

		telanganadams.add("Singur Dam, Sangareddy");
		telanganadams.add("Nizam Sagar, Kamareddy");
		telanganadams.add("Sriram Sagar Project	");
		telanganadams.add("Sadarmat Barrage");
		telanganadams.add("Yellampalli, Karimnagar");
		telanganadams.add("Lower Manair Dam, Karimnagar");
		telanganadams.add("Mid Manair Dam, Karimagar");
		telanganadams.add("Upper Manair Dam,(narmala)Karimnagar");
		telanganadams.add("Tummidihetti Barrage");
		telanganadams.add("Medigadda Barrage");
		telanganadams.add("Annaram Barrage");
		telanganadams.add("Sundilla Barrage");
		telanganadams.add("Icchampally Project");
		telanganadams.add("Sammakka Barrage");
		telanganadams.add("Janampet Barrage");
		telanganadams.add("Sitamma Sagar Barrage");
		telanganadams.add("Kadam Reservoir, Adilabad");
		telanganadams.add("Pocharam Dam Reservoir");
		telanganadams.add("Manjeera Reservoir");
		telanganadams.add("Devadula project");
		telanganadams.add("Pakhala Reservoir");
		telanganadams.add("Sadarmat, Adilabad");
		telanganadams.add("Rajolibanda Dam");
		telanganadams.add("Dindi Reservoir");
		telanganadams.add("Musi Reservoir");
		telanganadams.add("Palair Reservoir");
		telanganadams.add("Wyra Reservoir");
		telanganadams.add("Thotapally Reservoir");

		System.out.println("telanganadams   name Is   :" + telanganadams);
		System.out.println("telanganadams  Size Is   :" + telanganadams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> telangana = telanganadams.iterator();
		System.out.println("starts  With T =============================================");

		while (telangana.hasNext()) {
			String element = telangana.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> telangana1 = telanganadams.iterator();

		while (telangana1.hasNext()) {
			String element = telangana1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> telangana2 = telanganadams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (telangana2.hasNext()) {
			String element = telangana2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> telangana3 = telanganadams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (telangana3.hasNext()) {
			String element = telangana3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> telangana4 = telanganadams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (telangana4.hasNext()) {
			String element = telangana4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> telangana5 = telanganadams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (telangana5.hasNext()) {
			String element = telangana5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(element)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> telangana6 = telanganadams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (telangana6.hasNext()) {
			String element = telangana6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("andhraPradesh   Dams ----------------------------------------------------------");
		Collection<String> andhraPradeshdams = new ArrayList<String>();

		andhraPradeshdams.add("Nagarjuna Sagar Dam, Vijayapuri South");
		andhraPradeshdams.add("Srisailam Dam, Srisailam");
		andhraPradeshdams.add("Polavaram Project, Polavaram");
		andhraPradeshdams.add("Somasila Dam, Somasila village");
		andhraPradeshdams.add("Pulichinthala Project, Pulichinthala village");
		andhraPradeshdams.add("Nallamalasagar Reservoir, Markapur");
		andhraPradeshdams.add("Jalaput Dam, Jalaput");
		andhraPradeshdams.add("Gandikota Reservoir, Gandikota village");
		andhraPradeshdams.add("Kalyani Dam, Tirupati");
		andhraPradeshdams.add("Brahmamsagar Reservoir, Bramhamgari Matham");
		andhraPradeshdams.add("Velugodu Balancing Reservoir, Velgode");
		andhraPradeshdams.add("PABR Dam, Penna Ahobilam");
		andhraPradeshdams.add("Vykuntapuram Barrage, Amaravati");
		andhraPradeshdams.add("Chitravathi Balancing Reservoir, Parnapalli village");
		andhraPradeshdams.add("Mylavaram Dam, Mylavaram");
		andhraPradeshdams.add("Mid Pennar Dam, Marutla village");
		andhraPradeshdams.add("Dowleswaram Barrage, Rajahmundry");
		andhraPradeshdams.add("Rajolibanda Dam, Kurnool");
		andhraPradeshdams.add("Tatipudi Reservoir, Tatipudi");
		andhraPradeshdams.add("Prakasham Barrage, Vijayawada");
		andhraPradeshdams.add("Thotapalli Barrage, Thotapali village");

		System.out.println("andhraPradeshdams   name Is   :" + andhraPradeshdams);
		System.out.println("andhraPradeshdams  Size Is   :" + andhraPradeshdams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> andhraPradesh = andhraPradeshdams.iterator();
		System.out.println("starts  With T =============================================");

		while (andhraPradesh.hasNext()) {
			String element = andhraPradesh.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> andhraPradesh1 = andhraPradeshdams.iterator();

		while (andhraPradesh1.hasNext()) {
			String element = andhraPradesh1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> andhraPradesh2 = andhraPradeshdams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (andhraPradesh2.hasNext()) {
			String element = andhraPradesh2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> andhraPradesh3 = andhraPradeshdams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (andhraPradesh3.hasNext()) {
			String element = andhraPradesh3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> andhraPradesh4 = andhraPradeshdams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (andhraPradesh4.hasNext()) {
			String element = andhraPradesh4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> andhraPradesh5 = andhraPradeshdams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (andhraPradesh5.hasNext()) {
			String element = andhraPradesh5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(element)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> andhraPradesh6 = andhraPradeshdams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (andhraPradesh6.hasNext()) {
			String element = andhraPradesh6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("ArunachalPradesh    Dams ----------------------------------------------------------");
		Collection<String> arunachalPradeshdams = new ArrayList<String>();

		arunachalPradeshdams.add("Ranganadi Dam");
		arunachalPradeshdams.add("Subansiri Lower HE (Nhpc) Dam");

		System.out.println("andhraPradeshdams   name Is   :" + andhraPradeshdams);
		System.out.println("andhraPradeshdams  Size Is   :" + andhraPradeshdams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> arunachalPradesh = arunachalPradeshdams.iterator();
		System.out.println("starts  With T =============================================");

		while (andhraPradesh.hasNext()) {
			String element = arunachalPradesh.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> arunachalPradesh1 = arunachalPradeshdams.iterator();

		while (arunachalPradesh1.hasNext()) {
			String element = arunachalPradesh1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> arunachalPradesh2 = arunachalPradeshdams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (arunachalPradesh2.hasNext()) {
			String element = arunachalPradesh2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> arunachalPradesh3 = arunachalPradeshdams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (arunachalPradesh3.hasNext()) {
			String element = arunachalPradesh3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> arunachalPradesh4 = arunachalPradeshdams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (arunachalPradesh4.hasNext()) {
			String element = arunachalPradesh4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> arunachalPradesh5 = arunachalPradeshdams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (arunachalPradesh5.hasNext()) {
			String element = arunachalPradesh5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> arunachalPradesh6 = arunachalPradeshdams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (arunachalPradesh6.hasNext()) {
			String element = arunachalPradesh6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("assam    Dams ----------------------------------------------------------");
		Collection<String> assamdams = new ArrayList<String>();

		assamdams.add("Umrong Dam");
		assamdams.add("	Karbi Langpi Dam");

		System.out.println("assamdams   name Is   :" + assamdams);
		System.out.println("assamdams  Size Is   :" + assamdams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> assam = assamdams.iterator();
		System.out.println("starts  With T =============================================");

		while (assam.hasNext()) {
			String element = assam.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> assam1 = assamdams.iterator();

		while (assam1.hasNext()) {
			String element = assam1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> assam2 = assamdams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (assam2.hasNext()) {
			String element = assam2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> assam3 = assamdams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (assam3.hasNext()) {
			String element = assam3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> assam4 = assamdams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (assam4.hasNext()) {
			String element = assam4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> assam5 = assamdams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (assam5.hasNext()) {
			String element = assam5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> assam6 = assamdams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (assam6.hasNext()) {
			String element = assam6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Bihar    Dams ----------------------------------------------------------");
		Collection<String> bihardams = new ArrayList<String>();

		bihardams.add("Ajan Dam");
		bihardams.add("Amrity Dam");
		bihardams.add("	Baskund Dam");
		bihardams.add("Belharna Dam");
		bihardams.add("Durgawati Dam");
		bihardams.add("Kohira Dam");
		bihardams.add("Nakti (Bihar) Dam");
		bihardams.add("Phulwaria Dam");
		bihardams.add("Upper Kiul Dam");
		bihardams.add("Gaighat Dam");

		System.out.println("bihardams   name Is   :" + bihardams);
		System.out.println("bihardams  Size Is   :" + bihardams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> bihar = bihardams.iterator();
		System.out.println("starts  With T =============================================");

		while (bihar.hasNext()) {
			String element = bihar.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> bihar1 = bihardams.iterator();

		while (bihar1.hasNext()) {
			String element = bihar1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> bihar2 = bihardams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (bihar2.hasNext()) {
			String element = bihar2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> bihar3 = bihardams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (bihar3.hasNext()) {
			String element = bihar3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> bihar4 = bihardams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (bihar4.hasNext()) {
			String element = bihar4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> bihar5 = bihardams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (bihar5.hasNext()) {
			String element = bihar5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> bihar6 = bihardams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (bihar6.hasNext()) {
			String element = bihar6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Chhattisgarh    Dams ----------------------------------------------------------");
		Collection<String> chhattisgarhdams = new ArrayList<String>();
		chhattisgarhdams.add("Hasdeo Bango");
		chhattisgarhdams.add("Agariya Dam");
		chhattisgarhdams.add("Amabeda");
		chhattisgarhdams.add("Amachuwa");
		chhattisgarhdams.add("Auramimunda");
		chhattisgarhdams.add("Belhari Dam");
		chhattisgarhdams.add("Bhoramdeo");
		chhattisgarhdams.add("Bhulsi Dam");
		chhattisgarhdams.add("Chiniya Dam");
		chhattisgarhdams.add("Chilputi Dam");
		chhattisgarhdams.add("Dandgaon Dam");
		chhattisgarhdams.add("Dhab Dam");
		chhattisgarhdams.add("Dhara Dam");
		chhattisgarhdams.add("Fulwari Dam");
		chhattisgarhdams.add("Gangpur Dam");
		chhattisgarhdams.add("Gatatola Dam");

		System.out.println("chhattisgarhdams   name Is   :" + chhattisgarhdams);
		System.out.println("chhattisgarhdams  Size Is   :" + chhattisgarhdams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> chhattisgarh = chhattisgarhdams.iterator();
		System.out.println("starts  With T =============================================");

		while (chhattisgarh.hasNext()) {
			String element = chhattisgarh.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> chhattisgarh1 = chhattisgarhdams.iterator();

		while (chhattisgarh1.hasNext()) {
			String element = chhattisgarh1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> chhattisgarh2 = chhattisgarhdams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (chhattisgarh2.hasNext()) {
			String element = chhattisgarh2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> chhattisgarh3 = chhattisgarhdams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (chhattisgarh3.hasNext()) {
			String element = chhattisgarh3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> chhattisgarh4 = chhattisgarhdams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (chhattisgarh4.hasNext()) {
			String element = chhattisgarh4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> chhattisgarh5 = chhattisgarhdams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (chhattisgarh5.hasNext()) {
			String element = chhattisgarh5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> chhattisgarh6 = chhattisgarhdams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (chhattisgarh6.hasNext()) {
			String element = chhattisgarh6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Gujarat    Dams ----------------------------------------------------------");
		Collection<String> gujaratDams = new ArrayList<String>();
		gujaratDams.add("Aamli Chharchhoda");
		gujaratDams.add("Abhalwad");
		gujaratDams.add("Adhia");
		gujaratDams.add("Adhochhani");
		gujaratDams.add("Adhoi-");
		gujaratDams.add("Advana ");
		gujaratDams.add("Bamanbore");
		gujaratDams.add("Bandi ");
		gujaratDams.add("Bangawadi");
		gujaratDams.add("Bela");
		gujaratDams.add("Dalvada");
		gujaratDams.add("Don");
		gujaratDams.add("Dholi");
		gujaratDams.add("Dantiwada");
		gujaratDams.add("Fulzar");

		System.out.println("gujaratDams   name Is   :" + gujaratDams);
		System.out.println("gujaratDams  Size Is   :" + gujaratDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> gujarat = gujaratDams.iterator();
		System.out.println("starts  With T =============================================");

		while (gujarat.hasNext()) {
			String element = gujarat.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> gujarat1 = gujaratDams.iterator();

		while (gujarat1.hasNext()) {
			String element = gujarat1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> gujarat2 = gujaratDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (gujarat2.hasNext()) {
			String element = gujarat2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> gujarat3 = gujaratDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (gujarat3.hasNext()) {
			String element = gujarat3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> gujarat4 = gujaratDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (gujarat4.hasNext()) {
			String element = gujarat4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> gujarat5 = gujaratDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (gujarat5.hasNext()) {
			String element = gujarat5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> gujarat6 = gujaratDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (gujarat6.hasNext()) {
			String element = gujarat6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Haryana     Dams ----------------------------------------------------------");
		Collection<String> haryanadams = new ArrayList<String>();
		haryanadams.add("Anangpur Dam");
		haryanadams.add("Hathni Kund Barrage");
		haryanadams.add("Masani barrage");
		haryanadams.add("Kaushalya Dam");
		haryanadams.add("Ottu barrage");
		haryanadams.add("Palla barrage");
		haryanadams.add("Tajewala Barrage");

		System.out.println("haryanadams   name Is   :" + haryanadams);
		System.out.println("haryanadams  Size Is   :" + haryanadams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> haryana = haryanadams.iterator();
		System.out.println("starts  With T =============================================");

		while (haryana.hasNext()) {
			String element = haryana.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> haryana1 = haryanadams.iterator();

		while (haryana1.hasNext()) {
			String element = haryana1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> haryana2 = haryanadams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (haryana2.hasNext()) {
			String element = haryana2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> haryana3 = haryanadams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (haryana3.hasNext()) {
			String element = haryana3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> haryana4 = haryanadams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (haryana4.hasNext()) {
			String element = haryana4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> haryana5 = haryanadams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (haryana5.hasNext()) {
			String element = haryana5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> haryana6 = haryanadams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (haryana6.hasNext()) {
			String element = haryana6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Himachal Pradesh     Dams ----------------------------------------------------------");
		Collection<String> himachalPradeshDams = new ArrayList<String>();
		himachalPradeshDams.add("Baira Siul Dam");
		himachalPradeshDams.add("Bassi ");
		himachalPradeshDams.add("Bhakra");
		himachalPradeshDams.add("Chamera");
		himachalPradeshDams.add("Karchham-Wangtoo");
		himachalPradeshDams.add("Largi");
		himachalPradeshDams.add("Nathpa");
		himachalPradeshDams.add("Pandoh");
		himachalPradeshDams.add("Pong");
		himachalPradeshDams.add("Parbati");

		System.out.println("himachalPradeshDams   name Is   :" + himachalPradeshDams);
		System.out.println("himachalPradeshDams  Size Is   :" + himachalPradeshDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> himachalPradesh = himachalPradeshDams.iterator();
		System.out.println("starts  With T =============================================");

		while (himachalPradesh.hasNext()) {
			String element = himachalPradesh.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> himachalPradesh1 = himachalPradeshDams.iterator();

		while (himachalPradesh1.hasNext()) {
			String element = himachalPradesh1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> himachalPradesh2 = himachalPradeshDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (himachalPradesh2.hasNext()) {
			String element = himachalPradesh2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> himachalPradesh3 = himachalPradeshDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (himachalPradesh3.hasNext()) {
			String element = himachalPradesh3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> himachalPradesh4 = himachalPradeshDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (himachalPradesh4.hasNext()) {
			String element = himachalPradesh4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> himachalPradesh5 = himachalPradeshDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (himachalPradesh5.hasNext()) {
			String element = himachalPradesh5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> himachalPradesh6 = himachalPradeshDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (himachalPradesh6.hasNext()) {
			String element = himachalPradesh6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Jammu & Kashmir –     Dams ----------------------------------------------------------");
		Collection<String> jammuKashmirdams = new ArrayList<String>();

		jammuKashmirdams.add("Baglihar");
		jammuKashmirdams.add("Dulhasti");
		jammuKashmirdams.add("Kishenganga");
		jammuKashmirdams.add("Nimoo");
		jammuKashmirdams.add("Niu Karewa");
		jammuKashmirdams.add("Pakal Dul");
		jammuKashmirdams.add("Salal");

		System.out.println("jammuKashmirdams   name Is   :" + jammuKashmirdams);
		System.out.println("jammuKashmirdams  Size Is   :" + jammuKashmirdams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> jammuKashmir = jammuKashmirdams.iterator();
		System.out.println("starts  With T =============================================");

		while (jammuKashmir.hasNext()) {
			String element = jammuKashmir.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> jammuKashmir1 = jammuKashmirdams.iterator();

		while (jammuKashmir1.hasNext()) {
			String element = jammuKashmir1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> jammuKashmir2 = jammuKashmirdams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (jammuKashmir2.hasNext()) {
			String element = jammuKashmir2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> jammuKashmir3 = jammuKashmirdams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (jammuKashmir3.hasNext()) {
			String element = jammuKashmir3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> jammuKashmir4 = jammuKashmirdams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (jammuKashmir4.hasNext()) {
			String element = jammuKashmir4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> jammuKashmir5 = jammuKashmirdams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (jammuKashmir5.hasNext()) {
			String element = jammuKashmir5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> jammuKashmir6 = jammuKashmirdams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (jammuKashmir6.hasNext()) {
			String element = jammuKashmir6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Jharkhand–     Dams ----------------------------------------------------------");
		Collection<String> jharkhanddams = new ArrayList<String>();
		jharkhanddams.add("Amanat");
		jharkhanddams.add("Anjanwa");
		jharkhanddams.add("Anraj ");
		jharkhanddams.add("Baranadi");
		jharkhanddams.add("Chandil ");
		jharkhanddams.add("Chirka ");
		jharkhanddams.add("Dhankai");
		jharkhanddams.add("Dhulki");
		jharkhanddams.add("Gonda ");
		jharkhanddams.add("Jenasai");
		jharkhanddams.add("Kans");
		jharkhanddams.add("Latratu");
		jharkhanddams.add("Lotia");

		System.out.println("jharkhanddams   name Is   :" + jharkhanddams);
		System.out.println("jharkhanddams  Size Is   :" + jharkhanddams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> jharkhand = jharkhanddams.iterator();
		System.out.println("starts  With T =============================================");

		while (jharkhand.hasNext()) {
			String element = jharkhand.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> jharkhand1 = jharkhanddams.iterator();

		while (jharkhand1.hasNext()) {
			String element = jharkhand1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> jharkhand2 = jharkhanddams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (jharkhand2.hasNext()) {
			String element = jharkhand2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> jharkhand3 = jharkhanddams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (jharkhand3.hasNext()) {
			String element = jharkhand3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> jharkhand4 = jharkhanddams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (jharkhand4.hasNext()) {
			String element = jharkhand4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> jharkhand5 = jharkhanddams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (jharkhand5.hasNext()) {
			String element = jharkhand5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> jharkhand6 = jharkhanddams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (jharkhand6.hasNext()) {
			String element = jharkhand6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Kerala–     Dams ----------------------------------------------------------");
		Collection<String> keralaDams = new ArrayList<String>();

		keralaDams.add("Malampuzha");
		keralaDams.add("Mangalam");
		keralaDams.add("Meenkara ");
		keralaDams.add("Chulliar ");
		keralaDams.add("Pothundi");
		keralaDams.add("Walayar");
		keralaDams.add("Siruvani");
		keralaDams.add("Kanjirapuzha");
		keralaDams.add("Sholayar");
		keralaDams.add("Thenmala ");
		keralaDams.add("Peechi ");
		keralaDams.add("Neyyar");
		keralaDams.add("Pamba ");
		keralaDams.add("Kakki");
		keralaDams.add("Anayirankal ");
		keralaDams.add("Kundala");
		keralaDams.add("Mattupatti");

		System.out.println("keralaDams   name Is   :" + keralaDams);
		System.out.println("keralaDams  Size Is   :" + keralaDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> kerala = keralaDams.iterator();
		System.out.println("starts  With T =============================================");

		while (kerala.hasNext()) {
			String element = kerala.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> kerala1 = keralaDams.iterator();

		while (kerala1.hasNext()) {
			String element = kerala1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> kerala2 = keralaDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (kerala2.hasNext()) {
			String element = kerala2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> kerala3 = keralaDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (kerala3.hasNext()) {
			String element = kerala3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> kerala4 = keralaDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (kerala4.hasNext()) {
			String element = kerala4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> kerala5 = keralaDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (kerala5.hasNext()) {
			String element = kerala5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> kerala6 = keralaDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (kerala6.hasNext()) {
			String element = kerala6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Manipur–     Dams ----------------------------------------------------------");
		Collection<String> manipurDams = new ArrayList<String>();

		manipurDams.add("Khoupum Dam");
		manipurDams.add("Singda ");
		manipurDams.add("Thoubal");
		manipurDams.add("Khuga Dam");

		System.out.println("manipurDams   name Is   :" + manipurDams);
		System.out.println("manipurDams  Size Is   :" + manipurDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> manipur = manipurDams.iterator();
		System.out.println("starts  With T =============================================");

		while (manipur.hasNext()) {
			String element = manipur.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> manipur1 = manipurDams.iterator();

		while (manipur1.hasNext()) {
			String element = manipur1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> manipur2 = manipurDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (manipur2.hasNext()) {
			String element = manipur2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> manipur3 = manipurDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (manipur3.hasNext()) {
			String element = manipur3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> manipur4 = manipurDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (manipur4.hasNext()) {
			String element = manipur4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> manipur5 = manipurDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (manipur5.hasNext()) {
			String element = manipur5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> manipur6 = manipurDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (manipur6.hasNext()) {
			String element = manipur6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Meghalaya–     Dams ----------------------------------------------------------");
		Collection<String> meghalayaDams = new ArrayList<String>();

		meghalayaDams.add("Khandong");
		meghalayaDams.add("Kyrdemkulai");
		meghalayaDams.add("Mawphlang");
		meghalayaDams.add("Myntdu");

		System.out.println("meghalayaDams   name Is   :" + meghalayaDams);
		System.out.println("meghalayaDams  Size Is   :" + meghalayaDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> meghalaya = meghalayaDams.iterator();
		System.out.println("starts  With T =============================================");

		while (meghalaya.hasNext()) {
			String element = meghalaya.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> meghalaya1 = meghalayaDams.iterator();

		while (meghalaya1.hasNext()) {
			String element = meghalaya1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> meghalaya2 = meghalayaDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (meghalaya.hasNext()) {
			String element = meghalaya2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> meghalaya3 = meghalayaDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (meghalaya3.hasNext()) {
			String element = meghalaya3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> meghalaya5 = meghalayaDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (meghalaya5.hasNext()) {
			String element = meghalaya5.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> meghalaya4 = meghalayaDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (meghalaya4.hasNext()) {
			String element = meghalaya4.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> meghalaya6 = meghalayaDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (meghalaya6.hasNext()) {
			String element = meghalaya6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Mizoram–     Dams ----------------------------------------------------------");
		Collection<String> mizoramDams = new ArrayList<String>();

		mizoramDams.add("Mizoram.");
		mizoramDams.add("Kolasib");

		System.out.println("mizoramDams   name Is   :" + mizoramDams);
		System.out.println("mizoramDams  Size Is   :" + mizoramDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> mizoram = mizoramDams.iterator();
		System.out.println("starts  With T =============================================");

		while (mizoram.hasNext()) {
			String element = mizoram.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> mizoram1 = mizoramDams.iterator();

		while (mizoram1.hasNext()) {
			String element = mizoram1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> mizoram2 = meghalayaDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (mizoram2.hasNext()) {
			String element = mizoram2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> mizoram3 = mizoramDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (mizoram3.hasNext()) {
			String element = mizoram3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> mizoram4 = mizoramDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (mizoram4.hasNext()) {
			String element = mizoram4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> mizoram5 = mizoramDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (mizoram5.hasNext()) {
			String element = mizoram5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> mizoram6 = mizoramDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (mizoram6.hasNext()) {
			String element = mizoram6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Nagaland–     Dams ----------------------------------------------------------");
		Collection<String> nagalandDams = new ArrayList<String>();
		nagalandDams.add("Doyang Hep Dam");

		System.out.println("nagalandDams   name Is   :" + nagalandDams);
		System.out.println("nagalandDams  Size Is   :" + nagalandDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> nagaland = mizoramDams.iterator();
		System.out.println("starts  With T =============================================");

		while (nagaland.hasNext()) {
			String element = nagaland.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> nagaland1 = nagalandDams.iterator();

		while (nagaland1.hasNext()) {
			String element = nagaland1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> nagaland2 = nagalandDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (nagaland2.hasNext()) {
			String element = nagaland2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> nagaland3 = nagalandDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (nagaland3.hasNext()) {
			String element = nagaland3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> nagaland4 = nagalandDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (nagaland4.hasNext()) {
			String element = nagaland4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> nagaland5 = nagalandDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (nagaland5.hasNext()) {
			String element = nagaland5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> nagaland6 = nagalandDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (nagaland6.hasNext()) {
			String element = nagaland6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Orissa–     Dams ----------------------------------------------------------");
		Collection<String> orissaDams = new ArrayList<String>();
		orissaDams.add("Doyang Hep Dam");
		orissaDams.add("Baghua Dam");
		orissaDams.add("Balaskumpa ");
		orissaDams.add("Balimela");
		orissaDams.add("Bhatrajore");
		orissaDams.add("Deras");
		orissaDams.add("Domkutch");
		orissaDams.add("Gurlijore");
		orissaDams.add("Haguri");
		orissaDams.add("Jamuna");

		System.out.println("orissaDams   name Is   :" + orissaDams);
		System.out.println("orissaDams  Size Is   :" + orissaDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> orissa = orissaDams.iterator();
		System.out.println("starts  With T =============================================");

		while (orissa.hasNext()) {
			String element = orissa.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> orissa1 = orissaDams.iterator();

		while (orissa1.hasNext()) {
			String element = orissa1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> orissa2 = orissaDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (orissa2.hasNext()) {
			String element = orissa2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> orissa3 = orissaDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (orissa3.hasNext()) {
			String element = orissa3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> orissa4 = orissaDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (orissa4.hasNext()) {
			String element = orissa4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> orissa5 = orissaDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (orissa5.hasNext()) {
			String element = orissa5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> orissa6 = orissaDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (orissa6.hasNext()) {
			String element = orissa6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Punjab–     Dams ----------------------------------------------------------");
		Collection<String> punjabDams = new ArrayList<String>();

		punjabDams.add("Chohal");
		punjabDams.add("Damsal");
		punjabDams.add("Dholbaha");
		punjabDams.add("Jainti");
		punjabDams.add("Janauri");
		punjabDams.add("Maili");
		punjabDams.add("Perch");
		punjabDams.add("Saleran");
		punjabDams.add("Shahpur");
		punjabDams.add("Thana");

		System.out.println("punjabDams   name Is   :" + punjabDams);
		System.out.println("punjabDams  Size Is   :" + punjabDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> punjab = punjabDams.iterator();
		System.out.println("starts  With T =============================================");

		while (punjab.hasNext()) {
			String element = punjab.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> punjab1 = punjabDams.iterator();

		while (punjab1.hasNext()) {
			String element = punjab1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> punjab2 = punjabDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (punjab2.hasNext()) {
			String element = punjab2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> punjab3 = punjabDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (punjab3.hasNext()) {
			String element = punjab3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> punjab4 = punjabDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (punjab4.hasNext()) {
			String element = punjab4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> punjab5 = punjabDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (punjab5.hasNext()) {
			String element = punjab5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> punjab6 = punjabDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (punjab6.hasNext()) {
			String element = punjab6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Rajasthan–     Dams ----------------------------------------------------------");
		Collection<String> rajasthanDams = new ArrayList<String>();

		rajasthanDams.add("Abhaypura");
		rajasthanDams.add("Aklera");
		rajasthanDams.add("Alnia");
		rajasthanDams.add("Amli");
		rajasthanDams.add("Bethali");
		rajasthanDams.add("Burdha");
		rajasthanDams.add("Chandelas");
		rajasthanDams.add("Godana");

		System.out.println("rajasthanDams   name Is   :" + rajasthanDams);
		System.out.println("rajasthanDams  Size Is   :" + rajasthanDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> rajasthan = rajasthanDams.iterator();
		System.out.println("starts  With T =============================================");

		while (rajasthan.hasNext()) {
			String element = rajasthan.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> rajasthan1 = rajasthanDams.iterator();

		while (rajasthan1.hasNext()) {
			String element = rajasthan1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> rajasthan2 = rajasthanDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (rajasthan2.hasNext()) {
			String element = rajasthan2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> rajasthan3 = rajasthanDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (rajasthan3.hasNext()) {
			String element = rajasthan3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> rajasthan4 = rajasthanDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (rajasthan4.hasNext()) {
			String element = rajasthan4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> rajasthan5 = rajasthanDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (rajasthan5.hasNext()) {
			String element = rajasthan5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> rajasthan6 = rajasthanDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (rajasthan6.hasNext()) {
			String element = rajasthan6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}
		System.out.println(System.lineSeparator());
		System.err.println("Sikkim–     Dams ----------------------------------------------------------");
		Collection<String> sikkimDams = new ArrayList<String>();

		sikkimDams.add("Rangpo");
		sikkimDams.add("Rongli");
		sikkimDams.add("Teesta");
		sikkimDams.add("Rangit");

		System.out.println("sikkimDams   name Is   :" + sikkimDams);
		System.out.println("sikkimDams  Size Is   :" + sikkimDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> sikkim = sikkimDams.iterator();
		System.out.println("starts  With T =============================================");

		while (sikkim.hasNext()) {
			String element = sikkim.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> sikkim1 = sikkimDams.iterator();

		while (sikkim1.hasNext()) {
			String element = sikkim1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> sikkim2 = sikkimDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (sikkim2.hasNext()) {
			String element = sikkim2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> sikkim3 = sikkimDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (sikkim3.hasNext()) {
			String element = sikkim3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> sikkim4 = sikkimDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (sikkim4.hasNext()) {
			String element = sikkim4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> sikkim5 = sikkimDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (sikkim5.hasNext()) {
			String element = sikkim5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> sikkim6 = sikkimDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (sikkim6.hasNext()) {
			String element = sikkim6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("Uttar Pradesh –     Dams ----------------------------------------------------------");
		Collection<String> uttarPradeshdames = new ArrayList<String>();
		uttarPradeshdames.add("Adwa");
		uttarPradeshdames.add("Aunjhar");
		uttarPradeshdames.add("Baghel");
		uttarPradeshdames.add("Chandra");
		uttarPradeshdames.add("Deori");
		uttarPradeshdames.add("Dongia");
		uttarPradeshdames.add("Jamini");
		uttarPradeshdames.add("Kachnoda");
		uttarPradeshdames.add("Lower");

		System.out.println("uttarPradeshdames   name Is   :" + uttarPradeshdames);
		System.out.println("uttarPradeshdames  Size Is   :" + uttarPradeshdames.size());
		System.out.println(System.lineSeparator());
		Iterator<String> uttarPradesh = uttarPradeshdames.iterator();
		System.out.println("starts  With T =============================================");

		while (uttarPradesh.hasNext()) {
			String element = uttarPradesh.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> uttarPradesh1 = uttarPradeshdames.iterator();

		while (uttarPradesh1.hasNext()) {
			String element = uttarPradesh1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> uttarPradesh2 = uttarPradeshdames.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (uttarPradesh2.hasNext()) {
			String element = uttarPradesh2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> uttarPradesh3 = uttarPradeshdames.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (uttarPradesh3.hasNext()) {
			String element = uttarPradesh3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> uttarPradesh4 = uttarPradeshdames.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (uttarPradesh4.hasNext()) {
			String element = uttarPradesh4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> uttarPradesh5 = uttarPradeshdames.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (uttarPradesh5.hasNext()) {
			String element = uttarPradesh5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> uttarPradesh6 = uttarPradeshdames.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (uttarPradesh6.hasNext()) {
			String element = uttarPradesh6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}
		System.out.println(System.lineSeparator());
		System.err.println("Uttarakhand –     Dams ----------------------------------------------------------");
		Collection<String> Uttarakhanddames = new ArrayList<String>();

		Uttarakhanddames.add("Baigul");
		Uttarakhanddames.add("Dhauliganga");
		Uttarakhanddames.add("Jamrani");
		Uttarakhanddames.add("Koteshwar");
		Uttarakhanddames.add("Tumaria");
		Uttarakhanddames.add("Tehri");
		Uttarakhanddames.add("Nanak");
		Uttarakhanddames.add("Maneri");
		Uttarakhanddames.add("Haripura");

		System.out.println("Uttarakhanddames   name Is   :" + Uttarakhanddames);
		System.out.println("Uttarakhanddames  Size Is   :" + Uttarakhanddames.size());
		System.out.println(System.lineSeparator());
		Iterator<String> Uttarakhandd = Uttarakhanddames.iterator();
		System.out.println("starts  With T =============================================");

		while (Uttarakhandd.hasNext()) {
			String element = Uttarakhandd.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> Uttarakhandd1 = Uttarakhanddames.iterator();

		while (Uttarakhandd1.hasNext()) {
			String element = Uttarakhandd1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> Uttarakhandd2 = Uttarakhanddames.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (Uttarakhandd2.hasNext()) {
			String element = Uttarakhandd2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> Uttarakhandd3 = Uttarakhanddames.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (Uttarakhandd3.hasNext()) {
			String element = Uttarakhandd3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> Uttarakhandd4 = Uttarakhanddames.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (Uttarakhandd4.hasNext()) {
			String element = Uttarakhandd4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> Uttarakhandd5 = Uttarakhanddames.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (Uttarakhandd5.hasNext()) {
			String element = Uttarakhandd5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> Uttarakhandd6 = Uttarakhanddames.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (Uttarakhandd6.hasNext()) {
			String element = Uttarakhandd6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		System.out.println(System.lineSeparator());
		System.err.println("West Bengal –     Dams ----------------------------------------------------------");
		Collection<String> westBengalDams = new ArrayList<String>();

		westBengalDams.add("Bakreshwar");
		westBengalDams.add("Bandhu");
		westBengalDams.add("Beko");
		westBengalDams.add("Golamarajore");
		westBengalDams.add("Hanumata");
		westBengalDams.add("Scheme");
		westBengalDams.add("Karrior");
		westBengalDams.add("Tatko");
		westBengalDams.add("Teesta");
		westBengalDams.add("Kumari");

		System.out.println("westBengalDams   name Is   :" + westBengalDams);
		System.out.println("westBengalDams  Size Is   :" + westBengalDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> westBengal = westBengalDams.iterator();
		System.out.println("starts  With T =============================================");

		while (westBengal.hasNext()) {
			String element = westBengal.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> westBengal1 = westBengalDams.iterator();

		while (westBengal1.hasNext()) {
			String element = westBengal1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> westBengal2 = westBengalDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (westBengal2.hasNext()) {
			String element = westBengal2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> westBengal3 = westBengalDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (westBengal3.hasNext()) {
			String element = westBengal3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> westBengal4 = westBengalDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (westBengal4.hasNext()) {
			String element = westBengal4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> westBengal5 = westBengalDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (westBengal5.hasNext()) {
			String element = westBengal5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> westBengal6 = westBengalDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (westBengal6.hasNext()) {
			String element = westBengal6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		
		
		System.out.println(System.lineSeparator());
		System.err.println("Total No Of Dams in india ----------------------------------------------------------");
		Collection<String> totalStatesDams=new ArrayList<String>();
		
		totalStatesDams.addAll(andhraPradeshdams);
		totalStatesDams.addAll(arunachalPradeshdams);
		totalStatesDams.addAll(assamdams);
		totalStatesDams.addAll(bihardams);
		totalStatesDams.addAll(chhattisgarhdams);
		totalStatesDams.addAll(goaDams);
		totalStatesDams.addAll(gujaratDams);
		totalStatesDams.addAll(haryanadams);
		totalStatesDams.addAll(himachalPradeshDams);
		totalStatesDams.addAll(jammuKashmirdams);
		totalStatesDams.addAll(jharkhanddams);
		totalStatesDams.addAll(karnatakaDams);
		totalStatesDams.addAll(keralaDams);
		totalStatesDams.addAll(madyapredeshdams);
		totalStatesDams.addAll(maharastraDams);
		totalStatesDams.addAll(manipurDams);
		totalStatesDams.addAll(meghalayaDams);
		totalStatesDams.addAll(mizoramDams);
		totalStatesDams.addAll(nagalandDams);
		totalStatesDams.addAll(orissaDams);
		totalStatesDams.addAll(punjabDams);
		totalStatesDams.addAll(rajasthanDams);
		totalStatesDams.addAll(sikkimDams);
		totalStatesDams.addAll(tamilNaduDams);
		totalStatesDams.addAll(telanganadams);
		totalStatesDams.addAll(westBengalDams);
		totalStatesDams.addAll(uttarPradeshdames);
		totalStatesDams.addAll(Uttarakhanddames);
		

		

		System.out.println("totalStatesDams   name Is   :" + totalStatesDams);
		System.out.println("totalStatesDams  Size Is   :" + totalStatesDams.size());
		System.out.println(System.lineSeparator());
		Iterator<String> total = totalStatesDams.iterator();
		System.out.println("starts  With T =============================================");

		while (total.hasNext()) {
			String element = total.next();
			if (element.startsWith("T")) {

				System.out.println(element);

			}
		}
		System.out.println(System.lineSeparator());

		System.out.println("Ends With ra =============================================");
		Iterator<String> total1 = totalStatesDams.iterator();

		while (total1.hasNext()) {
			String element = total1.next();
			if (element.endsWith("ra")) {
				System.out.println("Ends With ra   " + element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<String> total2 = totalStatesDams.iterator();

		System.out.println("Length over 15 Element =============================================");
		while (total2.hasNext()) {
			String element = total2.next();
			if (element.length() > 15) {
				System.out.println(element);
			}
		}

		System.out.println(System.lineSeparator());
		Iterator<String> total3 = totalStatesDams.iterator();

		System.out.println("All Dam Elements Upper Case =============================================");
		while (total3.hasNext()) {
			String element = total3.next();
			String upper = element.toUpperCase();
			System.out.println(upper);

		}
		System.out.println(System.lineSeparator());
		Iterator<String> total4 = totalStatesDams.iterator();

		System.out.println("All Dam Elements Lower Case =============================================");
		while (total4.hasNext()) {
			String element = total4.next();
			String Lower = element.toLowerCase();
			System.out.println(Lower);

		}

		System.out.println(System.lineSeparator());
		Iterator<String> total5 = totalStatesDams.iterator();

		System.out.println("Dam Is Palindrome  =============================================");
		while (total5.hasNext()) {
			String element = total5.next();
			StringBuffer rev = new StringBuffer(element);
			if (rev.reverse().toString().equals(rev)) {
				System.out.println("Is Palindrome   :" + element);
			}

		}

		System.out.println(System.lineSeparator());
		Iterator<String> total6 = totalStatesDams.iterator();

		System.out.println("Remove All the ELEMENTS contains P =============================================");
		while (total6.hasNext()) {
			String element = total6.next();
			if (element.contains("p")) {
				System.out.println(element);
			}

		}

		
		
		
		
		
		
	}

}
