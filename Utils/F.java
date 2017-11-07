package Framework.Utils;

import javax.swing.JOptionPane;

public class F {
	public static void print(String message, String title) {
		JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
	}
	public static int menubuttons(String[] options, String message, String title) {

		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

	}
}
