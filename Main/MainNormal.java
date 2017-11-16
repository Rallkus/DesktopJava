package Framework.Main;

import Framework.Modules.Utils.Crud;
import Framework.Utils.F;

public class MainNormal {
	public static void exe() {
		String options[] = { "Read", "Order","Login" };
		int option;
		do {
			option = F.menubuttons(options, "What do you want to do?", "Options");
			switch (option) {
			case 0:
				Crud.read();
				break;
			case 1:
				Crud.order();
				break;
			case 2:
				Crud.login();
				break;
			default:
				System.exit(0);
			}
		} while (true);
	}
}
