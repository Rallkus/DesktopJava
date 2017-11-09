package Framework.Modules.Classes.Fly;

import java.util.ArrayList;

import Framework.Classes.Fecha;

public class International extends Fly {
	private String originCountry;
	private String arriveCountry;
	private Fecha arriveTimeDestinationCountry; //The day it is in the Country it lands
	public International(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price, String originCountry,
			String arriveCountry, Fecha arriveTimeDestinationCountry) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.originCountry = originCountry;
		this.arriveCountry = arriveCountry;
		this.arriveTimeDestinationCountry = arriveTimeDestinationCountry;
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
	public Fecha getArriveTimeDestinationCountry() {
		return arriveTimeDestinationCountry;
	}
	public void setArriveTimeDestinationCountry(Fecha arriveTimeDestinationCountry) {
		this.arriveTimeDestinationCountry = arriveTimeDestinationCountry;
	}
	@Override
	public String toString() {
		return "International [originCountry=" + originCountry + ", arriveCountry=" + arriveCountry
				+ ", arriveTimeDestinationCountry=" + arriveTimeDestinationCountry + ", getOriginCountry()="
				+ getOriginCountry() + ", getArriveCountry()=" + getArriveCountry()
				+ ", getArriveTimeDestinationCountry()=" + getArriveTimeDestinationCountry() + ", getId()=" + getId()
				+ ", getArrivePlace()=" + getArrivePlace() + ", getDeparturePlace()=" + getDeparturePlace()
				+ ", getDepartureTime()=" + getDepartureTime() + ", getArriveTime()=" + getArriveTime()
				+ ", getCapacity()=" + getCapacity() + ", getResponsable()=" + getResponsable() + ", getCompany()="
				+ getCompany() + ", getPrice()=" + getPrice();
	}
	
	
	
	
}
