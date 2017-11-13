package Framework.Main;

import Framework.Modules.Classes.Fly.Fly;
import Framework.Modules.Utils.Crud;
import Framework.Utils.F;

public class Main {

	public static void exe(){
		String options[] = {"Create", "Read", "Update", "Delete"};
		int option;
		Fly a = null;
		do{
			option = F.menubuttons(options, "What do you want to do?", "Options");
			switch(option){
			case 0:
				a=Crud.create();
				break;
			case 1:
				Crud.read(a);
				break;
			case 2:
				a=Crud.update(a);
				break;
			case 3:
				a=Crud.delete(a);
				break;
			default:
				System.exit(0);
			}
		}while(true);
	}

}
