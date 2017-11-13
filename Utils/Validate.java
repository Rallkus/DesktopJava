package Framework.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Framework.Classes.Fecha;

public class Validate {

	private static final String plantilla_name = "^[a-zA-Z\\s]*$";


	public static boolean validateName(String nombre) {
		Pattern pattern = Pattern.compile(plantilla_name);
		Matcher matcher = pattern.matcher(nombre);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}
	public static boolean validateArriveTimeDestinationCountry(Fecha arriveTimeDestinationCountry, Fecha arriveTime){
		int day;
		int month;
		int year;
		boolean validate = false;
		String[] fechaArray = null;
		//TODO end this
		try {
			fechaArray = arriveTimeDestinationCountry.getFecha().split("/");

			day = Integer.parseInt(fechaArray[0]);
			month = Integer.parseInt(fechaArray[1]);
			year = Integer.parseInt(fechaArray[2]);
		} catch (Exception e) {
			return false;
		}

		if ((month >= 1) && (month <= 12)) {
			switch (month) {
			case 1: // Enero
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 2: // Febrero

				if ((((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) && (day > 0)
						&& (day <= 29))
					validate = true; // Ao Bisiesto
				else if ((day > 0) && (day <= 28))
					validate = true;
				break;
			case 3: // Marzo
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 4: // Abril
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 5: // Mayo
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 6: // Junio
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 7: // Julio
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 8: // Agosto
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 9: // Septiembre
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 10: // Octubre
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 11: // Noviembre
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 12: // Diciembre
				if ((day > 0) && (day <= 31))
					validate = true;
				break;

			default:
				return false;
			}
		}
		if (validate && (arriveTimeDestinationCountry.compareDateSystem() == 1)) {
			return true;
		}
		return false;
	}


	public static boolean validateDate(Fecha a) {
		int day;
		int month;
		int year;
		boolean validate = false;
		String[] fechaArray = null;
		try {
			fechaArray = a.getFecha().split("/");

			day = Integer.parseInt(fechaArray[0]);
			month = Integer.parseInt(fechaArray[1]);
			year = Integer.parseInt(fechaArray[2]);
		} catch (Exception e) {
			return false;
		}

		if ((month >= 1) && (month <= 12)) {
			switch (month) {
			case 1: // Enero
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 2: // Febrero

				if ((((year % 100 == 0) && (year % 400 == 0)) || ((year % 100 != 0) && (year % 4 == 0))) && (day > 0)
						&& (day <= 29))
					validate = true; // Ao Bisiesto
				else if ((day > 0) && (day <= 28))
					validate = true;
				break;
			case 3: // Marzo
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 4: // Abril
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 5: // Mayo
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 6: // Junio
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 7: // Julio
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 8: // Agosto
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 9: // Septiembre
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 10: // Octubre
				if ((day > 0) && (day <= 31))
					validate = true;
				break;
			case 11: // Noviembre
				if ((day > 0) && (day <= 30))
					validate = true;
				break;
			case 12: // Diciembre
				if ((day > 0) && (day <= 31))
					validate = true;
				break;

			default:
				return false;
			}
		}
		if (validate && (a.compareDateSystem() == 1)) {
			return true;
		}
		return false;
	}

}
