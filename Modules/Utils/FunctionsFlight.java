package Framework.Modules.Utils;

import Framework.Classes.Fecha;
import Framework.Utils.F;
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
		arriveTime=F.askString("Enter the date of the arrive");
		//TODO validation
		Fecha time= new Fecha(arriveTime);
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
	
}
