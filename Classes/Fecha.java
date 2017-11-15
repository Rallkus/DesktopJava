package Framework.Classes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import Framework.Utils.F;

public class Fecha {
	private String fecha;

	public Fecha(String fecha) {
		this.fecha = fecha;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@SuppressWarnings("deprecation")
	public Calendar string2Calen() {

		Calendar fecha = Calendar.getInstance();
		Date date2 = null;

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			date2 = sdf.parse(this.fecha);
			date2.setMonth(getActualMonth() - 1);
			fecha.setTime(date2);

		} catch (Exception e) {
			e.printStackTrace();
			return fecha;

		}

		return fecha;
	}

	public int compareDate(Fecha date2) { // si fecha1 anterior retorna 0
		// si fecha1 igual retorna 1
		int var = 0; // si fecha1 posterior retorna 2
		Calendar date1 = this.string2Calen();
		Calendar dateCalen2;

		dateCalen2 = date2.string2Calen();

		if (date1.before(dateCalen2))
			var = -1;
		else if (date1.equals(dateCalen2))
			var = 0;
		else if (date1.after(dateCalen2))
			var = 1;
		return var;

	}

	public Calendar deStringtoCalendar() {
		Calendar fecha = Calendar.getInstance();
		java.util.Date fecha2 = null;
		try {

			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			fecha2 = sdf.parse(this.fecha);
			fecha.setTime(fecha2);
		} catch (Exception e) {
			return fecha;
		}
		return fecha;
	}

	public int compareTo(Fecha fecha_2) {

		// si fecha1 igual retorna 1
		Calendar fecha = this.deStringtoCalendar();
		Calendar fecha_1 = fecha_2.deStringtoCalendar();

		if (fecha.before(fecha_1))
			return 1;
		else if (fecha.after(fecha_1))
			return -1;
		else
			return 0; // IGUAL
	}

	public int compareTo2(Fecha date2) {
		// Long dateLong1 = this.string2Calen().getTimeInMillis();
		// Long dateLong2 = date2.string2Calen().getTimeInMillis();
		// return dateLong1.compareTo(dateLong2);
		String fechaArray[] = getFecha().split("/");
		int year = Integer.parseInt(fechaArray[2]);
		int month = Integer.parseInt(fechaArray[1]);
		int day = Integer.parseInt(fechaArray[0]);
		String fechaArray2[] = date2.getFecha().split("/");
		int year2 = Integer.parseInt(fechaArray2[2]);
		int month2 = Integer.parseInt(fechaArray2[1]);
		int day2 = Integer.parseInt(fechaArray2[0]);
		if (year > year2)
			return 1;
		else if (year < year2)
			return -1;
		if (month > month2)
			return 1;
		else if (month < month2)
			return -1;
		if (day > day2)
			return 1;
		else if (day < day2)
			return -1;
		else
			return 0;
	}

	public int compareDateSystem() {

		return ((Long) this.string2Calen().getTimeInMillis()).compareTo(System.currentTimeMillis());

	}

	public int getActualMonth() {
		int month;
		String a = "";
		for (int i = 4; i <= 6; i++) {
			a = a + (Calendar.getInstance().getTime() + "").charAt(i);
		}
		switch (a) {
		case "Jan":
			month = 1;
			break;
		case "Feb":
			month = 2;
			break;
		case "Mar":
			month = 3;
			break;
		case "Apr":
			month = 4;
			break;
		case "May":
			month = 5;
			break;
		case "Jun":
			month = 6;
			break;
		case "Jul":
			month = 7;
			break;
		case "Aug":
			month = 8;
			break;
		case "Sep":
			month = 9;
			break;
		case "Oct":
			month = 10;
			break;
		case "Nov":
			month = 11;
			break;
		default:
			month = 12;
			break;

		}
		return month;
	}

}
