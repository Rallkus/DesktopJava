package Framework.Modules.Utils;

import java.util.Collections;

import Framework.Classes.Fecha;
import Framework.Main.Main;
import Framework.Main.MainReception;
import Framework.Modules.Classes.Fly.International;
import Framework.Modules.Classes.Fly.National;
import Framework.Modules.Classes.Fly.RoundTrip;
import Framework.Modules.Classes.Fly.Singleton;
import Framework.Modules.Classes.Fly.Order.OrderDeparturePlace;
import Framework.Modules.Classes.Fly.Order.OrderDepartureTime;
import Framework.Modules.Classes.Fly.Order.OrderPrice;
import Framework.Utils.F;

public class Crud {
	public static void create() {
		String options[] = { "National", "International", "Round trip" };
		int option, capacity, location;
		String id, arrivePlace, departurePlace, responsable, company, originCountry, arriveCountry, country, language;
		Fecha departureTime, arriveTime, returnDay;
		float price;

		option = F.menubuttons(options, "What kind of flight do you want to create?", "");
		switch (option) {
		case 0:
			id = FunctionsFlight.askId();
			location = FindFlight.findNational(id);
			if (location != -1) {
				F.print("That id is already being used");
			} else {
				departurePlace = FunctionsFlight.askDeparturaPlace();
				arrivePlace = FunctionsFlight.askArrivePlace();
				departureTime = FunctionsFlight.askDepartureTime();
				arriveTime = FunctionsFlight.askArriveTime(departureTime);
				capacity = FunctionsFlight.askCapacity();
				responsable = FunctionsFlight.askResponsable();
				company = FunctionsFlight.askCompany();
				price = FunctionsFlight.askPrice();
				country = FunctionsFlight.askCountry();
				language = FunctionsFlight.askLanguage();
				National a = new National(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity,
						responsable, company, price, country, language);
				Singleton.national.add(a);
			}

			break;
		case 1:
			id = FunctionsFlight.askId();
			location = FindFlight.findInternational(id);
			if (location != -1) {
				F.print("That id is already being used");
			} else {
				departurePlace = FunctionsFlight.askDeparturaPlace();
				arrivePlace = FunctionsFlight.askArrivePlace();
				departureTime = FunctionsFlight.askDepartureTime();
				arriveTime = FunctionsFlight.askArriveTime(departureTime);
				capacity = FunctionsFlight.askCapacity();
				responsable = FunctionsFlight.askResponsable();
				company = FunctionsFlight.askCompany();
				price = FunctionsFlight.askPrice();
				originCountry = FunctionsFlight.askOriginCountry();
				arriveCountry = FunctionsFlight.askArriveCountry();
				International b = new International(id, arrivePlace, departurePlace, departureTime, arriveTime,
						capacity, responsable, company, price, originCountry, arriveCountry);
				Singleton.international.add(b);
			}

			break;
		case 2:
			id = FunctionsFlight.askId();
			location = FindFlight.findRoundTrip(id);
			if (location != -1) {
				F.print("That id is already being used");

			} else {
				departurePlace = FunctionsFlight.askDeparturaPlace();
				arrivePlace = FunctionsFlight.askArrivePlace();
				departureTime = FunctionsFlight.askDepartureTime();
				arriveTime = FunctionsFlight.askArriveTime(departureTime);
				capacity = FunctionsFlight.askCapacity();
				responsable = FunctionsFlight.askResponsable();
				company = FunctionsFlight.askCompany();
				price = FunctionsFlight.askPrice();
				returnDay = FunctionsFlight.askReturnDay(arriveTime);
				RoundTrip c = new RoundTrip(id, arrivePlace, departurePlace, departureTime, arriveTime, capacity,
						responsable, company, price, returnDay);
				Singleton.roundtrip.add(c);
			}

			break;
		default:
		}
	}

	public static void read() {
		String options[] = { "National", "International", "Round trip" };
		String op[] = { "All", "Just one" };
		int option, menu, location = -1;
		String cad = "";
		option = F.menubuttons(options, "What kind of flight do you want to read?", "");
		switch (option) {
		case 0:
			if (Singleton.national.isEmpty()) {
				F.print("No flights registered");
			} else {
				menu = F.menubuttons(op, "Choose", "");
				switch (menu) {
				case 0:
					for (int i = 0; i < Singleton.national.size(); i++) {
						cad = cad + (Singleton.national.get(i).toString());
						F.print(cad);
						cad = "";
					}
					break;
				case 1:
					location = -1;
					String a = FindFlight.idNational();
					if (a != null) {
						location = FindFlight.findNational(a);
						if (location != -1) {
							F.print(Singleton.national.get(location).toString());
						} else {
							F.print("Flight not found");
						}
					}
					break;

				}
			}
			break;
		case 1:
			if (Singleton.international.isEmpty()) {
				F.print("No flights registered");
			} else {
				menu = F.menubuttons(op, "Choose", "");
				switch (menu) {
				case 0:
					for (int i = 0; i < Singleton.international.size(); i++) {
						cad = cad + (Singleton.international.get(i).toString());
						F.print(cad);
						cad = "";
					}
					break;
				case 1:
					location = -1;
					String a = FindFlight.idInternational();
					if (a != null) {
						location = FindFlight.findInternational(a);
						if (location != -1) {
							F.print(Singleton.international.get(location).toString());
						} else {
							F.print("Flight not found");
						}
					}
					break;

				}
			}
			break;
		case 2:
			if (Singleton.roundtrip.isEmpty()) {
				F.print("No flights registered");
			} else {
				menu = F.menubuttons(op, "Choose", "");
				switch (menu) {
				case 0:
					for (int i = 0; i < Singleton.roundtrip.size(); i++) {
						cad = cad + (Singleton.roundtrip.get(i).toString());
						F.print(cad);
						cad = "";
					}
					break;
				case 1:
					location = -1;
					String a = FindFlight.idRoundtrip();
					if (a != null) {
						location = FindFlight.findRoundTrip(a);
						if (location != -1) {
							F.print(Singleton.roundtrip.get(location).toString());
						} else {
							F.print("Flight not found");
						}
					}
					break;

				}
			}
			break;
		}

	}

	public static void update() {
		String options[] = { "National", "International", "Round trip" };
		String modifyNational[] = { "The arrive place", "The departure place", "The arrive time", "The departure time",
				"The capacity", "The responsable of the flight", "The company", "The price", "The country" };
		String modifyInternational[] = { "The arrive place", "The departure place", "The arrive time",
				"The departure time", "The capacity", "The responsable of the flight", "The company", "The price",
				"The origin country", "The arrive country" };
		String modifyRoundtrip[] = { "The arrive place", "The departure place", "The arrive time", "The departure time",
				"The capacity", "The responsable of the flight", "The company", "The price", "The day of the return" };
		int option, op, location;
		String c;
		op = F.menubuttons(options, "What kind of flight do you want to update?", "");
		if (op == 0) {
			if (Singleton.national.isEmpty())
				F.print("There are no flights available");
			else {
				c = FindFlight.idNational();
				if (c != null) {
					location = FindFlight.findNational(c);
					if (location != -1) {
						National a = Singleton.national.get(location);
						option = F.menubuttons(modifyNational, "What do you want to update?", "Update");
						switch (option) {
						case 0:
							a.setArrivePlace(FunctionsFlight.askArrivePlace());
							break;
						case 1:
							a.setDeparturePlace(FunctionsFlight.askDeparturaPlace());
							break;
						case 2:
							a.setArriveTime(FunctionsFlight.askArriveTime(a.getDepartureTime()));
							break;
						case 3:
							a.setDepartureTime(FunctionsFlight.askDepartureTime(a.getArriveTime()));
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
							break;
						}
					} else
						F.print("There are no flights available");
				}

			}
		} else if (op == 1) {
			if (Singleton.international.isEmpty())
				F.print("There are no flights available");
			else {
				c = FindFlight.idInternational();
				if (c != null) {
					location = FindFlight.findInternational(c);
					if (location != -1) {
						International a = Singleton.international.get(location);
						option = F.menubuttons(modifyInternational, "What do you want to update?", "");
						switch (option) {
						case 0:
							a.setArrivePlace(FunctionsFlight.askArrivePlace());
							break;
						case 1:
							a.setDeparturePlace(FunctionsFlight.askDeparturaPlace());
							break;
						case 2:
							a.setArriveTime(FunctionsFlight.askArriveTime(a.getDepartureTime()));
							break;
						case 3:
							a.setDepartureTime(FunctionsFlight.askDepartureTime(a.getArriveTime()));
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
						default:
							break;
						}
					}
				} else
					F.print("There are no flights available");
			}

		} else if (op == 2) {
			if (Singleton.roundtrip.isEmpty())
				F.print("There are no flights available");
			else {
				c = FindFlight.idRoundtrip();
				if (c != null) {
					location = FindFlight.findRoundTrip(c);
					if (location != -1) {
						RoundTrip a = Singleton.roundtrip.get(location);
						option = F.menubuttons(modifyRoundtrip, "What do you want to update?", "");
						switch (option) {
						case 0:
							a.setArrivePlace(FunctionsFlight.askArrivePlace());
							break;
						case 1:
							a.setDeparturePlace(FunctionsFlight.askDeparturaPlace());
							break;
						case 2:
							a.setArriveTime(FunctionsFlight.askArriveTime(a.getDepartureTime()));
							break;
						case 3:
							a.setDepartureTime(FunctionsFlight.askDepartureTime(a.getArriveTime()));
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
							((RoundTrip) a).setReturnDay(FunctionsFlight.askReturnDay(a.getArriveTime()));
						default:
							break;
						}
//						Singleton.roundtrip.set(location, a);
					}
				}
			}
		}
	}

	public static void delete() {
		String options[] = { "National", "International", "Round trip" };
		int option = F.menubuttons(options, "What do you want to delete?", "Delete");
		int location = -1;
		if (option == 0) {
			if (Singleton.national.isEmpty()) {
				F.print("There are no flights available");
			} else {
				location = -1;
				String b = FindFlight.idNational();
				if (b != null) {
					location = FindFlight.findNational(b);
					if (location != -1) {
						Singleton.national.remove(location);
					} else {
						F.print("Error");
					}
				}
			}
		} else if (option == 1) {
			if (Singleton.international.isEmpty()) {
				F.print("There are no flights available");
			} else {
				location = -1;
				String b = FindFlight.idInternational();
				if (b != null) {
					location = FindFlight.findInternational(b);
					if (location != -1) {
						Singleton.international.remove(location);
					} else {
						F.print("Error");
					}
				}
			}
		} else if (option == 2) {
			if (Singleton.roundtrip.isEmpty()) {
				F.print("There are no flights available");
			} else {
				location = -1;
				String b = FindFlight.idRoundtrip();
				if (b != null) {
					location = FindFlight.findRoundTrip(b);
					if (location != -1) {
						Singleton.roundtrip.remove(location);
					} else {
						F.print("Error");
					}
				}
			}
		}

	}
	public static void order() {
		String options[] = { "National", "International", "Round trip" };
		int option = F.menubuttons(options, "What do you want to order?", "Order");
		String op[]= {"Id","Departure Place", "Departure Time", "Price"};
		switch(option) {
		case 0:
			if(Singleton.national.isEmpty())
				F.print("There are no flights available");
			else {
				option=F.menubuttons(op, "How do you want to order?", "");
				switch(option) {
				case 0:
					Collections.sort(Singleton.national);
					break;
				case 1:
					Collections.sort(Singleton.national, new OrderDeparturePlace());
					break;
				case 2:
					Collections.sort(Singleton.national, new OrderDepartureTime());
					break;
				case 3:
					Collections.sort(Singleton.national, new OrderPrice());
					break;
				default:
					break;
				}
			}
			break;
		case 1:
			if(Singleton.international.isEmpty())
				F.print("There are no flights available");
			else {
				option=F.menubuttons(op, "How do you want to order?", "");
				switch(option) {
				case 0:
					Collections.sort(Singleton.international);
					break;
				case 1:
					Collections.sort(Singleton.international, new OrderDeparturePlace());
					break;
				case 2:
					Collections.sort(Singleton.international, new OrderDepartureTime());
					break;
				case 3:
					Collections.sort(Singleton.international, new OrderPrice());
					break;
				default:
					break;
				}
			}
			break;
		case 2:
			if(Singleton.roundtrip.isEmpty())
				F.print("There are no flights available");
			else {
				option=F.menubuttons(op, "How do you want to order?", "");
				switch(option) {
				case 0:
					Collections.sort(Singleton.roundtrip);
					break;
				case 1:
					Collections.sort(Singleton.roundtrip, new OrderDeparturePlace());
					break;
				case 2:
					Collections.sort(Singleton.roundtrip, new OrderDepartureTime());
					break;
				case 3:
					Collections.sort(Singleton.roundtrip, new OrderPrice());
					break;
				default:
					break;
				}
			}
			break;
		default:
			break;
		}
	}
	public static void login(){
		String usu = "";
		String pass = "";
		usu = F.askString("Introduce your username");
		pass = F.askString("Introduce your password");
		if(usu.equals("admin")&&pass.equals("admin"))
			Main.exe();
		else if(usu.equals("reception")&&pass.equals("reception"))
			MainReception.exe();

	}
	
}
