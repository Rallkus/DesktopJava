package Framework.Modules.Classes.Fly;

import java.util.ArrayList;

import Framework.Classes.Fecha;

public class National extends Fly{
	private String country;
	private String language;
	
	public National(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price, String country, String language) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.country = country;
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "National [country=" + country + ", language=" + language + ", getCountry()=" + getCountry()
				+ ", getLanguage()=" + getLanguage() + ", getId()=" + getId() + ", getArrivePlace()=" + getArrivePlace()
				+ ", getDeparturePlace()=" + getDeparturePlace() + ", getDepartureTime()=" + getDepartureTime()
				+ ", getArriveTime()=" + getArriveTime() + ", getCapacity()=" + getCapacity() + ", getResponsable()="
				+ getResponsable() + ", getCompany()=" + getCompany() + ", getPrice()=" + getPrice()+"]";
	}
	
	
	
	
}
