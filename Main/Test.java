package Framework.Main;

import Framework.Classes.Fecha;
import Framework.Modules.Utils.FunctionsFlight;
import Framework.Utils.F;

public class Test {
	public static void main(String args[]){
		Fecha b=new Fecha("3/1/2020");
		do{
			Fecha a=FunctionsFlight.askDepartureTime();
			F.print("Success");
		}while(true);
		
	}
}
