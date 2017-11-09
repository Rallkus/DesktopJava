package Framework.Modules.Utils;

import Framework.Classes.Fecha;
import Framework.Modules.Classes.Fly.Fly;
import Framework.Modules.Classes.Fly.International;
import Framework.Modules.Classes.Fly.National;
import Framework.Modules.Classes.Fly.RoundTrip;
import Framework.Utils.F;

public class Crud {
	public static Fly create() {
		String options[] = { "National", "International", "Round trip" };
		Fly a=null;
		int option, capacity, dayDifference;
		String id, arrivePlace, departurePlace, responsable, company, originCountry, arriveCountry, country, language;
		Fecha departureTime, arriveTime, arriveTimeDestinationCountry, returnDay;
		float price;
		option = F.menubuttons(options, "What kind of flight do you want to create?", "");
		id = FunctionsFlight.askId();
		arrivePlace = FunctionsFlight.askArrivePlace();
		departurePlace = FunctionsFlight.askDeparturaPlace();
		arriveTime = FunctionsFlight.askArriveTime();
		departureTime = FunctionsFlight.askDepartureTime();
		capacity = FunctionsFlight.askCapacity();
		responsable = FunctionsFlight.askResponsable();
		company = FunctionsFlight.askCompany();
		price = FunctionsFlight.askPrice();
		switch (option) {
		case 0:
			country = FunctionsFlight.askCountry();
			language = FunctionsFlight.askLanguage();
			a = new National(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable,
					company, price, country, language);
			return a;
		case 1:
			originCountry=FunctionsFlight.askOriginCountry();
			arriveCountry=FunctionsFlight.askArriveCountry();
			arriveTimeDestinationCountry=FunctionsFlight.askArriveTimeDestinationCountry();
			a = new International(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable,
					company, price, originCountry, arriveCountry,arriveTimeDestinationCountry);
			return a;
		case 2:
			returnDay=FunctionsFlight.askReturnDay();
			dayDifference=FunctionsFlight.askDayDifference();
			a = new RoundTrip(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable,
					company, price, dayDifference, returnDay);
			return a;
		default:
			return null;
		}
	}

	public static void read(Fly a) {
		if (a == null)
			F.print("There is no flight available");
		else
			F.print(a.toString());
	}

	public static Fly update(Fly a) {
		if (a == null)
			return null;
		return a;
	}

	public static Fly delete(Fly a) {
		return null;
	}
}
