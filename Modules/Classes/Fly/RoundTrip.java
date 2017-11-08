package Framework.Modules.Classes.Fly;

import java.util.ArrayList;

import Framework.Classes.Fecha;

public class RoundTrip extends Fly{
	private int dayDifference;
	private Fecha returnDay;
	public RoundTrip(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, String responsable, String company, float price, int dayDifference,
			Fecha returnDay) {
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
	public Fecha getReturnHour() {
		return returnDay;
	}
	public void setReturnHour(Fecha returnHour) {
		this.returnDay = returnHour;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
