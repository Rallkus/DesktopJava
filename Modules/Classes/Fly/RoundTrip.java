package Framework.Modules.Classes.Fly;

import Framework.Classes.Fecha;

public class RoundTrip extends Fly {
	private Fecha returnDay;

	public RoundTrip(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price, Fecha returnDay) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.returnDay = returnDay;
	}

	public int getDayDifference() {
		int day, day1, month, month1, year, year1, yearDiff, monthDiff, dayDiff;
		String[] fechaArray = null;
		String[] fechaArray1 = null;
		fechaArray = getReturnDay().getFecha().split("/");
		day = Integer.parseInt(fechaArray[0]);
		month = Integer.parseInt(fechaArray[1]);
		year = Integer.parseInt(fechaArray[2]);
		fechaArray1 = getDepartureTime().getFecha().split("/");
		day1 = Integer.parseInt(fechaArray1[0]);
		month1 = Integer.parseInt(fechaArray1[1]);
		year1 = Integer.parseInt(fechaArray1[2]);
		yearDiff = (year - year1) * 365;
		monthDiff = (month - month1) * 30;
		dayDiff = day - day1;
		return yearDiff + monthDiff + dayDiff;
	}

	public Fecha getReturnDay() {
		return returnDay;
	}

	public void setReturnDay(Fecha returnHour) {
		this.returnDay = returnHour;
	}

	@Override
	public String toString() {
		return "id = " + getId() + "\n Place where you are going = " + getArrivePlace() + "\n Place you take off = "
				+ getDeparturePlace() + "\n Time you take off = " + getDepartureTime().getFecha()
				+ "\n Time you arrive to the destination = " + getArriveTime().getFecha()
				+ "\n Capacity of the plane = " + getCapacity() + "\n Responsable of the flight = " + getResponsable()
				+ "\n Company that makes the flight = " + getCompany() + "\n Price of the flight = " + getPrice()
				+ "€ \n The day it returns = " + getReturnDay().getFecha();
	}

	@Override
	public int compareTo(Fly a) {

		return this.getId().compareTo(a.getId());
	}

}
