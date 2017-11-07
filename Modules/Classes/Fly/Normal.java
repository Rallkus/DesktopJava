package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class Normal extends Fly {
	private String dniDriver;
	private int numberOfHostesses;
	
	public Normal(Fecha departureTime, Fecha arriveTime, String departurePlace, String arrivePlace, float price,
			int numberOfPassengers, String dniDriver, int numberOfHostesses) {
		super(departureTime, arriveTime, departurePlace, arrivePlace, price, numberOfPassengers);
		this.dniDriver = dniDriver;
		this.numberOfHostesses = numberOfHostesses;
	}
	public String getDniDriver() {
		return dniDriver;
	}
	public void setDniDriver(String dniDriver) {
		this.dniDriver = dniDriver;
	}
	public int getNumberOfHostesses() {
		return numberOfHostesses;
	}
	public void setNumberOfHostesses(int numberOfHostesses) {
		this.numberOfHostesses = numberOfHostesses;
	}
	
}
