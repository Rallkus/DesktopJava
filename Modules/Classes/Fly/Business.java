package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class Business extends Fly  {
	private String nameOfBusiness;
	private Fecha passengersArrive;
	public Business(Fecha departureTime, Fecha arriveTime, String departurePlace, String arrivePlace, float price,
			int numberOfPassengers, String nameOfBusiness, Fecha passengersArrive) {
		super(departureTime, arriveTime, departurePlace, arrivePlace, price, numberOfPassengers);
		this.nameOfBusiness = nameOfBusiness;
		this.passengersArrive = passengersArrive;
	}
	public String getNameOfBusiness() {
		return nameOfBusiness;
	}
	public void setNameOfBusiness(String nameOfBusiness) {
		this.nameOfBusiness = nameOfBusiness;
	}
	public Fecha getPassengersArrive() {
		return passengersArrive;
	}
	public void setPassengersArrive(Fecha passengersArrive) {
		this.passengersArrive = passengersArrive;
	}
	
}
