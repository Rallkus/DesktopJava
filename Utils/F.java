package Framework.Utils;

import javax.swing.JOptionPane;

public class F {
	public static void print(String message) {
		JOptionPane.showMessageDialog(null, message, "", JOptionPane.INFORMATION_MESSAGE);
	}

	public static int menubuttons(String[] options, String message, String title) {

		return JOptionPane.showOptionDialog(null, message, title, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

	}

	public static String askString(String message) {
		String string = "";

		do {
			try {
				string = JOptionPane.showInputDialog(null, message, "", JOptionPane.QUESTION_MESSAGE);
				if (string.equals("")) {
					print("error");
				} else
					break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
			}
		} while (true);

		return string;

	}
	public static int askinteger(String message) {
		String string = "";
		int num = 0;

		do {
			try {
				string = JOptionPane.showInputDialog(null, message, "", JOptionPane.QUESTION_MESSAGE);
				num = Integer.parseInt(string);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't introduced a number", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (true);

		return num;
	}
	public static float askfloat(String message) {
		String string = "";
		float num = 0;

		do {
			try {
				string = JOptionPane.showInputDialog(null, message, "", JOptionPane.QUESTION_MESSAGE);
				num = Float.parseFloat(string);
				break;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "You haven't introduced a number", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		} while (true);

		return num;
	}


}
