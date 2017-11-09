package Framework.Main;

import Framework.Classes.Fecha;
import Framework.Modules.Utils.FunctionsFlight;
import Framework.Utils.F;

public class Test {
	public static void main(String args[]){
		do{
			Fecha a=FunctionsFlight.askArriveTime();
			F.print("Success");
		}while(true);
		
	}
}
