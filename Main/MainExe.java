package Framework.Main;

import javax.swing.UIManager;

import Framework.Modules.Utils.MakeDummies;
import Framework.Utils.F;

public class MainExe {
	public static void exe() {
		String[] options = { "Dummies", "No dummies" };
		F.iniSingleton();
		String usu = "";
		String pass = "";
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {

		}
		do {
			usu = F.askString("Introduce your username");
			pass = F.askString("Introduce your password");
		} while (!usu.equals("yomogan") && !pass.equals("yomogan"));
		int dummies = F.menubuttons(options, "Do you want to use dummies?", "Main");
		if (dummies == 0) {
			MakeDummies.Dummies();
			Main.exe();
		} else if (dummies == 1) {
			Main.exe();
		} else
			System.exit(0);
	}
}
