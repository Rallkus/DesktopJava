package Framework.Main;

import Framework.Modules.Utils.Crud;
import Framework.Utils.F;

public class MainReception {
	public static void exe(){
		String options[] = {"Read", "Update","Order", "Log out"};
		int option;
		do{
			option = F.menubuttons(options, "What do you want to do?", "Options");
			switch(option){
			case 0:
				Crud.read();
				break;
			case 1:
				Crud.update();
				break;
			case 2:
				Crud.order();
				break;
			case 3:
				MainNormal.exe();
				break;
			default:
				System.exit(0);
			}
		}while(true);
	}
}
