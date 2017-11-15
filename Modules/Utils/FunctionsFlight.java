package Framework.Modules.Utils;

import Framework.Classes.Fecha;
import Framework.Utils.F;
import Framework.Utils.Validate;

public class FunctionsFlight {
	public static String askId() {
		String id;
		id = F.askString("Enter the id of the flight");
		return id;
	}

	public static String askArrivePlace() {
		String arrivePlace;
		do {
			arrivePlace = F.askString("Enter the destination city");
		} while (!Validate.validateName(arrivePlace));

		return arrivePlace;
	}

	public static String askDeparturaPlace() {
		String departurePlace;
		do {
			departurePlace = F.askString("Enter the city of departure");
		} while (!Validate.validateName(departurePlace));

		return departurePlace;
	}

	public static Fecha askArriveTime(Fecha departureTime) {
		String arriveTime;
		Fecha time;
		boolean validate;
		do {
			arriveTime = F.askString("Enter the date of the arrive");
			time = new Fecha(arriveTime);
			validate = Validate.validateDate(time);
		} while (!validate || departureTime.compareTo(time)==1);

		return time;
	}

	public static Fecha askDepartureTime() {
		String departureTime;
		boolean validate;
		Fecha time;
		do{
			departureTime = F.askString("Enter the date of the take off");
			time=new Fecha(departureTime);
			validate=Validate.validateDate(time);
		}while(!validate);
		return time;
	}

	public static int askCapacity() {
		int capacity;
		do {
			capacity = F.askinteger("Introduce the capacity of the plane");
			if (!(capacity < 50 || capacity > 400)) {
				break;
			}
		} while (true);
		return capacity;

	}

	public static String askResponsable() {
		String responsable[] = { "John", "Xavier", "Alexandra", "Harry", "Rachel" };
		int option;
		do {
			option = F.menubuttons(responsable, "What is the responsable of the flight?", "Responsable");
		} while (option == -1);
		return responsable[option];
	}

	public static String askCompany() {
		String company[] = { "Kayak", "Expedia", "Skyscanner", "Destinia", "Ryanair" };
		int option;
		do {
			option = F.menubuttons(company, "What is the company responsable of the flight?", "Company");
		} while (option == -1);
		return company[option];
	}

	public static float askPrice() {
		float price;
		do {
			price = F.askfloat("What is the price of the flight?");
		} while (price < 0);
		return price;
	}

	public static String askCountry() {
		String country;
		do {
			country = F.askString("Enter the country");
		} while (!Validate.validateName(country));

		return country;
	}

	public static String askLanguage() {
		String language;
		do {
			language = F.askString("Enter the language of the country");
		} while (!Validate.validateName(language));

		return language;
	}

	public static String askOriginCountry() {
		String originCountry;
		do {
			originCountry = F.askString("Enter the country where the plane takes off");
		} while (!Validate.validateName(originCountry));

		return originCountry;
	}

	public static String askArriveCountry() {
		String arriveCountry;
		do {
			arriveCountry = F.askString("Enter the destination country");
		} while (!Validate.validateName(arriveCountry));

		return arriveCountry;
	}

	public static Fecha askReturnDay(Fecha arriveTime) {
		String returnDay;
		Fecha time;
		boolean validate;
		do {
			returnDay = F.askString("Enter the day you return");
			time = new Fecha(returnDay);
			validate = Validate.validateDate(time);
		} while (!validate || arriveTime.compareTo(time)==1);
		return time;
	}
	public static Fecha askDepartureTime(Fecha arriveTime) {
		String departureTime;
		Fecha time;
		boolean validate;
		do {
			departureTime = F.askString("Enter the day you return");
			time = new Fecha(departureTime);
			validate = Validate.validateDate(time);
		} while (!validate || arriveTime.compareTo(time)==-1);
		return time;
	}

}
