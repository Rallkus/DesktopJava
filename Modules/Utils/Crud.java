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
		Fly a = null;
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
			a = new National(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable, company,
					price, country, language);
			return a;
		case 1:
			originCountry = FunctionsFlight.askOriginCountry();
			arriveCountry = FunctionsFlight.askArriveCountry();
			arriveTimeDestinationCountry = FunctionsFlight.askArriveTimeDestinationCountry();
			a = new International(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity, responsable,
					company, price, originCountry, arriveCountry, arriveTimeDestinationCountry);
			return a;
		case 2:
			returnDay = FunctionsFlight.askReturnDay();
			dayDifference = FunctionsFlight.askDayDifference();
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
		String modifyNational[] = { "The arrive place", "The departure place", "The arrive time", "The departure time",
				"The capacity", "The responsable of the flight", "The company", "The price", "The country" };
		String modifyInternational[] = { "The arrive place", "The departure place", "The arrive time",
				"The departure time", "The capacity", "The responsable of the flight", "The company", "The price",
				"The origin country", "The arrive country", "The arrive time of the destination country" };
		String modifyRoundtrip[] = { "The arrive place", "The departure place", "The arrive time", "The departure time",
				"The capacity", "The responsable of the flight", "The company", "The price", "The day of the return" };
		int option;
		if (a == null)
			return null;
		if (a instanceof National) {
			option = F.menubuttons(modifyNational, "What do you want to update?", "Update");
			switch (option) {
			case 0:
				a.setArrivePlace(FunctionsFlight.askArrivePlace());
				break;
			case 1:
				a.setDeparturePlace(FunctionsFlight.askDeparturaPlace());
				break;
			case 2:
				a.setArriveTime(FunctionsFlight.askArriveTime());
				break;
			case 3:
				a.setDepartureTime(FunctionsFlight.askDepartureTime());
				break;
			case 4:
				a.setCapacity(FunctionsFlight.askCapacity());
				break;
			case 5:
				a.setResponsable(FunctionsFlight.askResponsable());
				break;
			case 6:
				a.setCompany(FunctionsFlight.askCompany());
				break;
			case 7:
				a.setPrice(FunctionsFlight.askPrice());
				break;
			case 8:
				((National) a).setCountry(FunctionsFlight.askCountry());
				((National) a).setLanguage(FunctionsFlight.askLanguage());
			default:
				return a;

			}
		} else if (a instanceof International) {
			option = F.menubuttons(modifyInternational, "What do you want to update?", "Update");
			switch (option) {
			case 0:
				a.setArrivePlace(FunctionsFlight.askArrivePlace());
				break;
			case 1:
				a.setDeparturePlace(FunctionsFlight.askDeparturaPlace());
				break;
			case 2:
				a.setArriveTime(FunctionsFlight.askArriveTime());
				break;
			case 3:
				a.setDepartureTime(FunctionsFlight.askDepartureTime());
				break;
			case 4:
				a.setCapacity(FunctionsFlight.askCapacity());
				break;
			case 5:
				a.setResponsable(FunctionsFlight.askResponsable());
				break;
			case 6:
				a.setCompany(FunctionsFlight.askCompany());
				break;
			case 7:
				a.setPrice(FunctionsFlight.askPrice());
				break;
			case 8:
				((International) a).setOriginCountry(FunctionsFlight.askOriginCountry());
				break;
			case 9:
				((International) a).setArriveCountry(FunctionsFlight.askArriveCountry());
				break;
			case 10:
				((International) a).setArriveTimeDestinationCountry(FunctionsFlight.askArriveTimeDestinationCountry());
				break;
			default:
				return a;
			}
		} else if(a instanceof RoundTrip){
			option = F.menubuttons(modifyRoundtrip, "What do you want to update?", "Update");
			switch (option) {
			case 0:
				a.setArrivePlace(FunctionsFlight.askArrivePlace());
				break;
			case 1:
				a.setDeparturePlace(FunctionsFlight.askDeparturaPlace());
				break;
			case 2:
				a.setArriveTime(FunctionsFlight.askArriveTime());
				break;
			case 3:
				a.setDepartureTime(FunctionsFlight.askDepartureTime());
				break;
			case 4:
				a.setCapacity(FunctionsFlight.askCapacity());
				break;
			case 5:
				a.setResponsable(FunctionsFlight.askResponsable());
				break;
			case 6:
				a.setCompany(FunctionsFlight.askCompany());
				break;
			case 7:
				a.setPrice(FunctionsFlight.askPrice());
				break;
			case 8:
				((RoundTrip) a).setReturnDay(FunctionsFlight.askReturnDay());
			}
		}
		return a;
	}

	public static Fly delete(Fly a) {
		return null;
	}
}
