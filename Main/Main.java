package Framework.Main;

import Framework.Modules.Utils.Crud;
import Framework.Utils.F;

public class Main {

	public static void exe() {
		String options[] = { "Create", "Read", "Update", "Delete", "Order", "Log out"};
		int option;
		do {
			option = F.menubuttons(options, "What do you want to do?", "Options");
			switch (option) {
			case 0:
				Crud.create();
				break;
			case 1:
				Crud.read();
				break;
			case 2:
				Crud.update();
				break;
			case 3:
				Crud.delete();
				break;
			case 4:
				Crud.order();
				break;
			case 5:
				MainNormal.exe();
				break;
			default:
				System.exit(0);
			}
		} while (true);
	}

}
