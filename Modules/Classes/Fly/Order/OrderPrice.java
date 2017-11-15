package Framework.Modules.Classes.Fly.Order;

import java.util.Comparator;

import Framework.Modules.Classes.Fly.Fly;

public class OrderPrice implements Comparator <Fly> {

	@Override
	public int compare(Fly a, Fly b) {
		if(a.getPrice()>b.getPrice())
			return 1;
		else if(a.getPrice()<b.getPrice())
			return -1;
		return 0;
	}
	
}
