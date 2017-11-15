package Framework.Modules.Classes.Fly.Order;

import java.util.Comparator;

import Framework.Modules.Classes.Fly.Fly;
import Framework.Utils.F;

public class OrderDepartureTime implements Comparator <Fly>{

	@Override
	public int compare(Fly a, Fly b) {
		F.print(a.getDepartureTime().getFecha() + " "+b.getDepartureTime().getFecha());
		return a.getDepartureTime().compareTo(b.getDepartureTime());
	}
	
}
