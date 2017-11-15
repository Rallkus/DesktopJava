package Framework.Main;

import Framework.Modules.Utils.MakeDummies;
import Framework.Utils.F;

public class MainExe {
	public static void exe(){
		String[] options = {"Dummies", "No dummies"};
		F.iniSingleton();
		int dummies = F.menubuttons(options, "Do you want to use dummies?", "Main");
		if(dummies == 0){
			MakeDummies.Dummies();
			Main.exe();
		}else if(dummies == 1){
			Main.exe();
		}else
			System.exit(0);
	}
}
