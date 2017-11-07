package Framework.Modules.Classes.Fly;

import java.util.ArrayList;

import Framework.Classes.Fecha;

public class RoundTrip extends Fly{
	private int hourDifference;
	private Fecha returnHour;
	public RoundTrip(String id, String arrivePlace, String departurePlace, Fecha departureTime, Fecha arriveTime,
			int capacity, ArrayList<String> responsable, String company, float price, int hourDifference,
			Fecha returnHour) {
		super(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company, price);
		this.hourDifference = hourDifference;
		this.returnHour = returnHour;
	}
	public int getHourDifference() {
		return hourDifference;
	}
	public void setHourDifference(int hourDifference) {
		this.hourDifference = hourDifference;
	}
	public Fecha getReturnHour() {
		return returnHour;
	}
	public void setReturnHour(Fecha returnHour) {
		this.returnHour = returnHour;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
