package ir.freeland.collection.model;

public class Address implements Comparable<Address>{
	private int street;
    private String city;
    private String country;
    
	public Address(int street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}

	public int getStreet() {
		return street;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public int compareTo(Address o) {
		
		return this.street - o.street;
	}
	
	
	
    
	

}
