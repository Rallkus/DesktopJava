package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public abstract class Fly {
	private Fecha departureTime;
	private Fecha arriveTime;
	private String departurePlace;
	private String arrivePlace;
	private float price;
	private int numberOfPassengers;
	
	public Fly(Fecha departureTime, Fecha arriveTime, String departurePlace, String arrivePlace, float price,
			int numberOfPassengers) {
		super();
		this.departureTime = departureTime;
		this.arriveTime = arriveTime;
		this.departurePlace = departurePlace;
		this.arrivePlace = arrivePlace;
		this.price = price;
		this.numberOfPassengers = numberOfPassengers;
	}
	public Fecha getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Fecha departureTime) {
		this.departureTime = departureTime;
	}
	public Fecha getArriveTime() {
		return arriveTime;
	}
	public void setArriveTime(Fecha arriveTime) {
		this.arriveTime = arriveTime;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getArrivePlace() {
		return arrivePlace;
	}
	public void setArrivePlace(String arrivePlace) {
		this.arrivePlace = arrivePlace;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	
}
