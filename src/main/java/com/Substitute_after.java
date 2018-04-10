package com;

import java.util.Arrays;
import java.util.List;

/**
*
*khaitq on 10 avr. 2018
*/

public class Substitute_after {
	
	String foundPerson(String[] people) {
		List<String> searhcPeople = Arrays.asList(new String[] {"Don", "John", "Kent"});
		for (int i = 0; i < people.length; i++) {
			if (searhcPeople.contains(people[i])){
				return people[i];
			}
		}
		return "";
	}
	
	
}


