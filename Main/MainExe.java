package Framework.Main;

import javax.swing.UIManager;

import Framework.Modules.Utils.MakeDummies;
import Framework.Utils.F;

public class MainExe {
	public static void exe() {
		String[] options = { "Dummies", "No dummies" };
		F.iniSingleton();
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {

		}

		int dummies = F.menubuttons(options, "Do you want to use dummies?", "Main");
		if (dummies == 0) {
			MakeDummies.Dummies();
			MainNormal.exe();
		} else if (dummies == 1) {
			MainNormal.exe();
		} else
			System.exit(0);
	}
}
