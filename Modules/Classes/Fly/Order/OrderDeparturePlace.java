package Framework.Modules.Classes.Fly.Order;

import java.util.Comparator;

import Framework.Modules.Classes.Fly.Fly;

public class OrderDeparturePlace implements Comparator <Fly>{

	@Override
	public int compare(Fly a, Fly b) {
		return a.getDeparturePlace().compareTo(b.getDeparturePlace());
	}

}
