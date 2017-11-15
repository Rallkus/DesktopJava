package Framework.Modules.Utils;

import Framework.Modules.Classes.Fly.International;
import Framework.Modules.Classes.Fly.National;
import Framework.Modules.Classes.Fly.RoundTrip;
import Framework.Modules.Classes.Fly.Singleton;
import Framework.Utils.F;

public class FindFlight {
	public static int findInternational(String id) {
		for (int i = 0; i < Singleton.international.size(); i++) {
			if (Singleton.international.get(i).getId().equals(id))
				return i;
		}
		return -1;
	}

	public static int findNational(String id) {
		for (int i = 0; i < Singleton.national.size(); i++) {
			if (Singleton.national.get(i).getId().equals(id))
				return i;
		}
		return -1;
	}

	public static int findRoundTrip(String id) {
		for (int i = 0; i < Singleton.roundtrip.size(); i++) {
			if (Singleton.roundtrip.get(i).getId().equals(id))
				return i;
		}
		return -1;
	}

	public static String[] generate_vector_international() {
		International a = null;
		String s = "";
		String[] flight = new String[Singleton.international.size()];
		for (int i = 0; i < Singleton.international.size(); i++) {
			a = Singleton.international.get(i);
			s = a.getId() + " " + a.getDeparturePlace() + "-" + a.getArrivePlace();
			flight[i] = s;
		}

		return flight;
	}

	public static String[] generate_vector_national() {
		National a = null;
		String s = "";
		String[] flight = new String[Singleton.national.size()];
		for (int i = 0; i < Singleton.national.size(); i++) {
			a = Singleton.national.get(i);
			s = a.getId() + " " + a.getDeparturePlace() + "-" + a.getArrivePlace();
			flight[i] = s;
		}

		return flight;
	}

	public static String[] generate_vector_roundtrip() {
		RoundTrip a = null;
		String s = "";
		String[] flight = new String[Singleton.roundtrip.size()];
		for (int i = 0; i < Singleton.roundtrip.size(); i++) {
			a = Singleton.roundtrip.get(i);
			s = a.getId() + " " + a.getDeparturePlace() + "-" + a.getArrivePlace();
			flight[i] = s;
		}

		return flight;
	}

	public static String idInternational() {
		String idArray[] = null;
		String[] international = generate_vector_international();
		String search = F.combobox("Select flight", international);
		if (search != "") {
			idArray = search.split(" ");
		}
		try {
			return idArray[0];
		}catch(Exception e) {
			return "";
		}

	}

	public static String idNational() {
		String idArray[] = null;
		String[] international = generate_vector_national();
		String search = F.combobox("Select flight", international);
		if (search != "") {
			idArray = search.split(" ");
		}
		try {
			return idArray[0];
		}catch(Exception e) {
			return "";
		}
		

	}

	public static String idRoundtrip() {
		String idArray[] = null;
		String[] international = generate_vector_roundtrip();
		String search = F.combobox("Select flight", international);
		if (search != "") {
			idArray = search.split(" ");
		}
		try {
			return idArray[0];
		}catch(Exception e) {
			return "";
		}

	}

}
