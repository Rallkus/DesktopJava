package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class National extends Fly {
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

	public String toString() {
		return "id = " + getId() + "\n Place where you are going = " + getArrivePlace() + "\n Place you take off = "
				+ getDeparturePlace() + "\n Time you take off = " + getDepartureTime().getFecha()
				+ "\n Time you arrive to the destination = " + getArriveTime().getFecha() + "\n Capacity of the plane = "
				+ getCapacity() + "\n Responsable of the flight = " + getResponsable()
				+ "\n Company that makes the flight = " + getCompany() + "\n Price of the flight = " + getPrice()
				+ "€ \n Country = " + getCountry()+"\n Language of the country = "+getLanguage();
	}

	@Override
public int compareTo(Fly a) {
		
		return this.getId().compareTo(a.getId());
	}

}
