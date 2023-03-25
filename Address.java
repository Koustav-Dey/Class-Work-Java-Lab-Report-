package basicprograms;

public class Address {
	long pincode;
	String city, country,state;
	public Address(long pincode, String city, String country, String state) {
		
		this.pincode = pincode;
		this.city = city;
		this.country = country;
		this.state = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	


}
