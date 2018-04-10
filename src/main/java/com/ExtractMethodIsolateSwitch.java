package com;

import java.util.List;

/**
 * khaitq on 10 avr. 2018
 */

public class ExtractMethodIsolateSwitch {

	private class Product {
		int quantity;
		int price;
	}
	
	public enum Country {
		US, UK, FR
	}

	private class User {
		
		private Country country;

		public List<Product> getProducts() {
			return null; //
		}
		
		public Country getCountry() {
			return country;
		}
		
	}
	
	private User user;

	public double calculateTotal() {
		
		double total = getTotalPrice();
		
		total = applyCountryDiscount(user.getCountry(), total);

		return total;
	}

	private double getTotalPrice() {
		
		double total = 0;
		
		for (Product product : user.getProducts()) {
			total += product.quantity * product.price;
		}
		return total;
	}

	public double applyCountryDiscount(Country country, double total) {
		
		if (country == null) 
			return total;
		
		switch (country) {
			case US:
				total *= 0.85;
				break;
			case UK:
				total *= 0.75;
				break;
			case FR:
				total *= 0.9;
				break;
			default: 
		}
		
		return total;
	}
	
}
