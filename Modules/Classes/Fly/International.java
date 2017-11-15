package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class International extends Fly {
	private String originCountry;
	private String arriveCountry;

	public International(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price, String originCountry, String arriveCountry) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.originCountry = originCountry;
		this.arriveCountry = arriveCountry;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getArriveCountry() {
		return arriveCountry;
	}

	public void setArriveCountry(String arriveCountry) {
		this.arriveCountry = arriveCountry;
	}

	@Override
	public String toString() {
		return "id = " + getId() + "\n Place where you are going = " + getArrivePlace() + "\n Place you take off = "
				+ getDeparturePlace() + "\n Time you take off = " + getDepartureTime().getFecha()
				+ "\n Time you arrive to the destination = " + getArriveTime().getFecha() + "\n Capacity of the plane = "
				+ getCapacity() + "\n Responsable of the flight = " + getResponsable()
				+ "\n Company that makes the flight = " + getCompany() + "\n Price of the flight = " + getPrice()
				+ "€ \n The country where you take off = " + getOriginCountry()+"\n The country you land = "+getArriveCountry();
	}

	@Override
	public int compareTo(Fly a) {
		
		return this.getId().compareTo(a.getId());
	}

}
