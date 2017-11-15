package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public abstract class Fly implements Comparable<Fly>{
	private String id;
	private String arrivePlace;
	private String departurePlace;
	private Fecha departureTime;
	private Fecha arriveTime;
	private int capacity;
	private String responsable;
	private String company;
	private float price;
	public Fly(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price) {
		super();
		this.id = id;
		this.arrivePlace = arrivePlace;
		this.departurePlace = departurePlace;
		this.departureTime = departureTime;
		this.arriveTime = arriveTime;
		this.capacity = capacity;
		this.responsable = responsable;
		this.company = company;
		this.price = price;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getArrivePlace() {
		return arrivePlace;
	}
	public void setArrivePlace(String arrivePlace) {
		this.arrivePlace = arrivePlace;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
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
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public abstract String toString();

	
	
	
}
