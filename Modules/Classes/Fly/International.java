package Framework.Modules.Classes.Fly;

import java.util.ArrayList;

import Framework.Classes.Fecha;

public class International extends Fly {
	private String originCountry;
	private String arriveCountry;
	private int hourDifference;
	private Fecha arriveTimeDestinationCountry; //The time it is in the Country it lands
	public International(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, ArrayList<String> responsable, String company, float price, String originCountry,
			String arriveCountry, int hourDifference, Fecha arriveTimeDestinationCountry) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.originCountry = originCountry;
		this.arriveCountry = arriveCountry;
		this.hourDifference = hourDifference;
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
	public int getHourDifference() {
		return hourDifference;
	}
	public void setHourDifference(int hourDifference) {
		this.hourDifference = hourDifference;
	}
	public Fecha getArriveTimeDestinationCountry() {
		return arriveTimeDestinationCountry;
	}
	public void setArriveTimeDestinationCountry(Fecha arriveTimeDestinationCountry) {
		this.arriveTimeDestinationCountry = arriveTimeDestinationCountry;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
