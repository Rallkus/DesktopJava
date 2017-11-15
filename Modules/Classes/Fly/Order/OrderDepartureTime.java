package Framework.Modules.Classes.Fly.Order;

import java.util.Comparator;

import Framework.Modules.Classes.Fly.Fly;
import Framework.Utils.F;

public class OrderDepartureTime implements Comparator <Fly>{

	@Override
	public int compare(Fly a, Fly b) {
		return a.getDepartureTime().compareTo2(b.getDepartureTime());
	}
	
}
