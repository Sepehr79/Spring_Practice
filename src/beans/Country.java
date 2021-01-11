package beans;

import java.util.List;

public class Country {
	private String name;
	private String continent;
	private int countryCode;
	private List<String> cities;
	
	public Country() {
		
	}

	public Country(String name, String continent, int countryCode, List<String> cities) {
		super();
		this.name = name;
		this.continent = continent;
		this.countryCode = countryCode;
		this.cities = cities;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	
	
}
