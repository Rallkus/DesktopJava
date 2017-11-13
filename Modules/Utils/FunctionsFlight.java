package Framework.Modules.Utils;

import Framework.Classes.Fecha;
import Framework.Utils.F;
import Framework.Utils.Validate;
//TODO all the validations
public class FunctionsFlight {
	public static String askId(){
		String id;
		id=F.askString("Enter the id of the flight");
		return id;
	}
	public static String askArrivePlace() {
		String arrivePlace;
		arrivePlace=F.askString("Enter the destination city");
		return arrivePlace;
	}
	public static String askDeparturaPlace() {
		String departurePlace;
		departurePlace=F.askString("Enter the city of departure");
		return departurePlace;
	}
	public static Fecha askArriveTime() {
		String arriveTime;
		Fecha time;
		boolean validate;
		do{
			arriveTime=F.askString("Enter the date of the arrive");
			time= new Fecha(arriveTime);
			validate=Validate.validateDate(time);
		}while(!validate);
		
		return time;
	}
	public static Fecha askDepartureTime() {
		String departureTime;
		departureTime=F.askString("Enter the date of the take off");
		//TODO validation
		Fecha time= new Fecha(departureTime);
		return time;
	}
	public static int askCapacity() {
		int capacity;
		do {
			capacity = F.askinteger("Introduce the capacity of the plane");
			if(!(capacity<50 || capacity > 400)) {
				break;
			}
		}while(true);
		return capacity;
		
	}
	
	public static String askResponsable() {
		String responsable[] = {"John", "Xavier", "Alexandra", "Harry", "Rachel"};
		int option;
		do {
			option = F.menubuttons(responsable, "What is the responsable of the flight?", "Responsable");
		}while(option==-1);
		return responsable[option];
	}
	public static String askCompany() {
		String company[] = {"Kayak", "Expedia", "Skyscanner", "Destinia", "Ryanair"};
		int option;
		do {
			option = F.menubuttons(company, "What is the company responsable of the flight?", "Company");
		}while(option==-1);
		return company[option];
	}
	public static float askPrice() {
		float price;
		do {
			price=F.askfloat("What is the price of the flight?");
		}while(price<0);
		return price;
	}
	
	public static String askCountry() {
		String country;
		country=F.askString("Enter the country");
		return country;
	}
	public static String askLanguage() {
		String language;
		language=F.askString("Enter the language of the country");
		return language;
	}
	public static String askOriginCountry() {
		String originCountry;
		originCountry=F.askString("Enter the country where the plane takes off");
		return originCountry;
	}
	public static String askArriveCountry() {
		String arriveCountry;
		arriveCountry=F.askString("Enter the destination country");
		return arriveCountry;
	}
	public static Fecha askArriveTimeDestinationCountry() {
		String arriveTimeDestinationCountry;
		arriveTimeDestinationCountry=F.askString("Enter the date of the arrive for the destination");
		//TODO validation
		Fecha time= new Fecha(arriveTimeDestinationCountry);
		return time;
	}
	public static Fecha askReturnDay() {
		String returnDay;
		returnDay=F.askString("Enter the day you return");
		//TODO validation
		Fecha time= new Fecha(returnDay);
		return time;
	}
	public static int askDayDifference() {
		int day=-3;
		do {
			day=F.askinteger("What's the day difference?");
		}while(day<-1 || day>1);
		return day;
	}
	
}
