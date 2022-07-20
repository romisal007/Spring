package com.rohit.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndLanguages {

	private Properties countriesAndlanguages;

	public Properties getCountriesAndlanguages() {
		return countriesAndlanguages;
	}

	public void setCountriesAndlanguages(Properties countriesAndlanguages) {
		this.countriesAndlanguages = countriesAndlanguages;
	}

	@Override
	public String toString() {
		return "CountriesAndLanguages [countriesAndlanguages=" + countriesAndlanguages + "]";
	}
	
	
}
