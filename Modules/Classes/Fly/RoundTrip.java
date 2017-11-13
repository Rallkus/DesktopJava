package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class RoundTrip extends Fly {
	private int dayDifference;
	private Fecha returnDay;

	public RoundTrip(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price, int dayDifference, Fecha returnDay) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.dayDifference = dayDifference;
		this.returnDay = returnDay;
	}

	public int getDayDifference() {
		return dayDifference;
	}

	public void setDayDifference(int hourDifference) {
		this.dayDifference = hourDifference;
	}

	public Fecha getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(Fecha returnHour) {
		this.returnDay = returnHour;
	}

	@Override
	public String toString() {
		return "RoundTrip [dayDifference=" + dayDifference + ", returnDay=" + returnDay + ", getDayDifference()="
				+ getDayDifference() + ", getReturnHour()=" + getReturnDay() + ", getId()=" + getId()
				+ ", getArrivePlace()=" + getArrivePlace() + ", getDeparturePlace()=" + getDeparturePlace()
				+ ", getDepartureTime()=" + getDepartureTime() + ", getArriveTime()=" + getArriveTime()
				+ ", getCapacity()=" + getCapacity() + ", getResponsable()=" + getResponsable() + ", getCompany()="
				+ getCompany() + ", getPrice()=" + getPrice() + "]";
	}

}
