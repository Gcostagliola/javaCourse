package basics;

public class weather {
	public static void main(String[] args){
		//THis program will give suggestions of what to wear based on the weather (temperature and sun condition)
	
		int temperature;
		String sunCondition = "Sunny";
		
		temperature = 85;
		if (temperature > 80){
			System.out.println("wear some shorts and tshirt");
		}
		else if ((temperature > 60) && sunCondition == "Sunny" ){
			System.out.println("wear long sleeves");
			System.out.println("Bring hat");
		}
		else if ((temperature > 50) || (sunCondition == "overcast")){
			System.out.println("col day go warm");
		}
		else {
			System.out.println("pretty cold wear sweater");
			
		}
		
		System.out.println("The Program is ending");
	}
}
