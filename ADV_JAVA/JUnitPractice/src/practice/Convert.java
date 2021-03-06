package practice;

public class Convert {
	
	public double convertLength(double length, String unit) {
		if(unit.equalsIgnoreCase("inches")){
            return (length * 2.5); 
        }else{
            return (length / 2.5);
        }
		
	}
	
	public double convertVolume (double amount, String unit){

        if(unit.equalsIgnoreCase("mL")){
            return (amount * 29.57); 
        }else{
            return (amount / 29.57);
        }
}
	
	public double convertTemperature(double temp, String unit){

	    if(unit.equalsIgnoreCase("F")){
	        return ((temp * 9/5) + 32); 
	    }else{
	        return ((temp - 32) * 5/9);
	    }
	}
	
	public String addString(String a, String b) {
		
		return a + b;
		
	}

}
