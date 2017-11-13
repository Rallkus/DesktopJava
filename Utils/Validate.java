package Framework.Utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Framework.Classes.Fecha;

public class Validate {

	private static final String plantilla_nombre = "^[a-zA-Z\\s]*$";
	private static final String plantilla_nombreconnumeros = "^[A-Za-z0-9-\\s]*$";// Nombre
																					// mixto
																					// con
																					// espacios
																					// y
																					// digitos(para
																					// escribir
																					// nombres
																					// de
																					// pc's,
																					// componentes
																					// y
																					// mas)
	private static final String plantilla_id = "^([A-Z]{1})([0-9]{4})$";// 1
																		// letra
																		// en
																		// mayuscula
																		// y 4
																		// digitos
	private static final String plantilla_CP = "^([1-9]{2}|[0-9][1-9]|[1-9][0-9])[0-9]{3}$";
	private static final String plantilla_tlf = "^[0-9]{2,3}-? ?[0-9]{6,7}$";
	private static final String plantilla_dni = "([0-9]{8})([A-Z])";
	private static final String plantilla_email = ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	private static final String plantilla_fecha = "(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/]((175[7-9])|(17[6-9][0-9])|(1[8-9][0-9][0-9])|([2-9][0-9][0-9][0-9]))";
	private static final String plantilla_edad = "^[0-9]{1,2}$";

	// validate age
	public static boolean validateAge(int age) {
		boolean a = false;
		if (age >= 18)
			a = true;
		return a;
	}

	// validar nombre
	public static boolean validateName(String nombre) {
		Pattern pattern = Pattern.compile(plantilla_nombre);
		Matcher matcher = pattern.matcher(nombre);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// validar nombre
	public static boolean validaNombreMixto(String nombreMixto) {
		Pattern pattern = Pattern.compile(plantilla_nombreconnumeros);
		Matcher matcher = pattern.matcher(nombreMixto);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// validar ID
	public static boolean validaId(String id) {
		Pattern pattern = Pattern.compile(plantilla_id);
		Matcher matcher = pattern.matcher(id);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// validamos un apellido usando la misma plantilla de expresion regular del
	// nombre
	public static boolean validateSurname(String apellido) {
		Pattern pattern = Pattern.compile(plantilla_nombre);
		Matcher matcher = pattern.matcher(apellido);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// Validamos un cdigo postal
	public static boolean validaCodigoPostal(String codigo_postal) {
		Pattern pattern = Pattern.compile(plantilla_CP);
		Matcher matcher = pattern.matcher(codigo_postal);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// Validamos un DNI
	public static boolean ValidateDNI(String dni) {
		Pattern pattern = Pattern.compile(plantilla_dni);
		Matcher matcher = pattern.matcher(dni);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// Validamos un numero de telefono espaol que empiece por 9, 6 o 7
	public static boolean Validatetlf(String tlf) {
		Pattern pattern = Pattern.compile(plantilla_tlf);
		Matcher matcher = pattern.matcher(tlf);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	// Validar un correo electronico
	public static boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(plantilla_email);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validateCorrectDate(String fecha) {
		Pattern pattern = Pattern.compile(plantilla_fecha);
		Matcher matcher = pattern.matcher(fecha);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean validateAgeRange(String edad) {
		Pattern pattern = Pattern.compile(plantilla_edad);
		Matcher matcher = pattern.matcher(edad);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	public static boolean direccion(String direc) { // Valida una direccion
		return direc.matches("[a-zA-Z1-9---]+\\.?(( |\\-)[a-zA-Z1-9---]+\\.?)*");
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
