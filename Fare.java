
public class Fare {
	boolean double calculateTotal(String[] from, String[] to) {
		String[] from1=new String[] {"Leslie"};
		String[] to1=new String[] {"Don Mills"};
	if(	
from[0].contains("Leslie") && to[0].contains("Don Mills")){
	return 2.5;
}
	else if(from[0].contains("Sheppard")&& to[0].contains("Finch Station")){
	return 3.0;
	
}
	else if (from[0].contains("Don MIlls")&& to[0].contains("Finch Station")) {
		return 3.0;
	}
	else if (from[0].contains(" Finch Station")&& to[0].contains("Sheppard")&& from[0].contains("Leslie")&& to[0].contains("Don Mills")) {
		return 5.50;
	}
	else if ( from[0].contains("Finch Station")&& to[0].contains("Sheppard")&& from[0].contains("Leslie")&& to[0].contains("Don Mills")) {
		return 6.00;
		
	}
	}
	
}
