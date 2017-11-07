package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class Vip extends Fly {
	private boolean freeBreakfast;
	private String dniDriver;
	private int numberOfHostesses;
	private float discountOnDrinks;
	
	public Vip(Fecha departureTime, Fecha arriveTime, String departurePlace, String arrivePlace, float price,
			int numberOfPassengers, boolean freeBreakfast, String dniDriver, int numberOfHostesses,
			float discountOnDrinks) {
		super(departureTime, arriveTime, departurePlace, arrivePlace, price, numberOfPassengers);
		this.freeBreakfast = freeBreakfast;
		this.dniDriver = dniDriver;
		this.numberOfHostesses = numberOfHostesses;
		this.discountOnDrinks = discountOnDrinks;
	}

	public boolean isFreeBreakfast() {
		return freeBreakfast;
	}

	public void setFreeBreakfast(boolean freeBreakfast) {
		this.freeBreakfast = freeBreakfast;
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

	public float getDiscountOnDrinks() {
		return discountOnDrinks;
	}

	public void setDiscountOnDrinks(float discountOnDrinks) {
		this.discountOnDrinks = discountOnDrinks;
	}


	
}
