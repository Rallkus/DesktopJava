package Framework.Main;

import Framework.Utils.F;

public class MainExe {
	public static void exe(){
		String[] options = {"Dummies", "No dummies"};
		int dummies = F.menubuttons(options, "Do you want to use dummies?", "Main");
		if(dummies == 0){
			MainDummies.exe();
		}else if(dummies == 1){
			Main.exe();
		}else
			System.exit(0);
	}
}
