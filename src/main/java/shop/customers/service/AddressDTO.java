package shop.customers.service;

public class AddressDTO {
	private String street;
	private String city;
	private String zip;
	private String country;

	public AddressDTO(String street, String city, String zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}

	public AddressDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "address:"+street+" , "+city+" , "+zip+" , "+country;
	}
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
