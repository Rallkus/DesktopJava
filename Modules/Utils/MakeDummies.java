package Framework.Modules.Utils;

import Framework.Classes.Fecha;
import Framework.Modules.Classes.Fly.Fly;
import Framework.Modules.Classes.Fly.International;
import Framework.Modules.Classes.Fly.National;
import Framework.Modules.Classes.Fly.RoundTrip;
import Framework.Modules.Classes.Fly.Singleton;

public class MakeDummies {
	public static String id() {
		String id = "";
		String[] passwords = { "zxc", "gasr", "lkjbh", "as", "uu", "ccsas", "213awda", "qwerthd", "cxxzs", "jiuyk",
				"sef", "paddda", "xnnc", "nvnvb", "allkn", "dsaaaa", "aas", "turu", "fina", "peuyf", "asdcc", "laaaer",
				"jim", "asdla", "bbca", "lel", "joytdi", "rlkjn", "jaasdr", "nunmba", "pord", "blko", "aankj",
				"youan" };
		for (int i = 0; i < 4; i++) {
			int position = (int) (Math.random() * 222) % 10;
			id = id + passwords[position];
			i++;
		}
		return id;

	}

	public static String arrivePlace() {
		String[] places = { "Barcelona", "Madrid", "Sevilla", "Bilbao", "Valencia" };
		return places[(int) (Math.random() * 1000 % 5)];
	}

	public static String departurePlace(String arrivePlace) {
		String[] places = { "Barcelona", "Madrid", "Sevilla", "Bilbao", "Valencia" };
		String place = "";
		do {
			place = places[(int) (Math.random() * 1000 % 5)];
		} while (place == arrivePlace);

		return place;
	}

	public static Fecha departureTime() {
		int day = (((int) (Math.random() * 1000)) % 28) + 1;
		int month = (((int) (Math.random() * 1000)) % 12) + 1;
		int year = 2018;
		Fecha x = new Fecha(day + "/" + month + "/" + year);
		return x;
	}

	public static Fecha arriveTime() {
		int day = (((int) (Math.random() * 1000)) % 28) + 1;
		int month = (((int) (Math.random() * 1000)) % 12) + 1;
		int year = 2019;
		Fecha x = new Fecha(day + "/" + month + "/" + year);
		return x;
	}

	public static int capacity() {
		return (int) (((Math.random() * 1000) % 350) + 50);
	}

	public static int price() {
		return (int) (Math.random() * 1000);
	}

	public static String responsable() {
		String responsables[] = { "John", "Xavier", "Alexandra", "Harry", "Rachel" };
		return responsables[(int) (Math.random() * 1000 % 5)];
	}

	public static String company() {
		String company[] = { "Kayak", "Expedia", "Skyscanner", "Destinia", "Ryanair" };
		return company[(int) (Math.random() * 1000 % 5)];
	}

	public static String arriveCountry() {
		String[] places = { "Polonia", "Germany", "Portugal", "Spain", "UK" };
		return places[(int) (Math.random() * 1000 % 5)];
	}

	public static String originCountry(String arriveCountry) {
		String[] places = { "Polonia", "Germany", "Portugal", "Spain", "UK" };
		String place = "";
		do {
			place = places[(int) (Math.random() * 1000 % 5)];
		} while (place == arriveCountry);

		return place;
	}
	public static String language() {
		String[] languages = { "English", "Spanish", "French" };
		return languages[(int) (Math.random() * 1000 % 3)];
	}
	public static Fecha returnDay() {
		int day = (((int) (Math.random() * 1000)) % 28) + 1;
		int month = (((int) (Math.random() * 1000)) % 12) + 1;
		int year = 2025;
		Fecha x = new Fecha(day + "/" + month + "/" + year);
		return x;
	}

	public static Fly makeInternational() {
		String arrivePlace = arrivePlace();
		String arriveCountry=arriveCountry();
		International a = new International(id(), arrivePlace, departurePlace(arrivePlace), departureTime(),
				arriveTime(), capacity(), responsable(), company(), price(), originCountry(arriveCountry), arriveCountry);
		return a;
	}
	public static Fly makeNational() {
		String arrivePlace = arrivePlace();
		National a = new National(id(), arrivePlace, departurePlace(arrivePlace), departureTime(),
				arriveTime(), capacity(), responsable(), company(), price(), arriveCountry(),language() );
		return a;
	}
	public static Fly makeRoundtrip() {
		String arrivePlace = arrivePlace();
		RoundTrip a = new RoundTrip(id(), arrivePlace, departurePlace(arrivePlace), departureTime(),
				arriveTime(), capacity(), responsable(), company(), price(), returnDay());
		return a;
	}
	public static void makeDummiesInternational() {
		for(int i=0;i<5;i++) {
			Singleton.international.add((International)makeInternational());
		}
	}
	public static void makeDummiesNational() {
		for(int i=0;i<5;i++) {
			Singleton.national.add((National)makeNational());
		}
	}
	public static void makeDummiesRoundtrip() {
		for(int i=0;i<5;i++) {
			Singleton.roundtrip.add((RoundTrip)makeRoundtrip());
		}
	}
	public static void Dummies() {
		makeDummiesInternational();
		makeDummiesNational();
		makeDummiesRoundtrip();
	}
	

}
