package com.xwork.rules.followers.boot;

import com.xwork.rules.TrafficRules;
import com.xwork.rules.followers.Traffic;

public class TrafficRulesRunner {

	public static void main(String[] args) {

		Object obj = new Traffic();
		
		Traffic traffic = new Traffic();
		
		TrafficRules trRules = new Traffic();
		
		System.out.println(traffic.fine());
		System.out.println(traffic.fines());
		System.out.println(traffic.mandatoryDoc());
		System.out.println(traffic.speeedLimit());
		System.out.println(traffic.wearHelmet());
	}

}
