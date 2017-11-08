package Framework.Modules.Utils;

import Framework.Modules.Classes.Fly.Fly;
import Framework.Utils.F;

public class Crud {
	public static Fly create(){
		Fly a=null;
		return a;
	}
	public static void read(Fly a){
		if(a==null)
			F.print("There is no flight available");
		else
			F.print(a.toString());
	}
	public static Fly update(Fly a){
		if(a==null)
			return null;
		return a;
	}
	public static Fly delete(Fly a){
		return null;
	}
}
