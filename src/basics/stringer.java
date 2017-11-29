package basics;

public class stringer {

	public static void main(String[] args) {

		int[] anArray;
	    anArray = new int[10];

        anArray[0] = 1100;
        anArray[1] = 26400;
        anArray[2] = 300;
        anArray[3] = 40230;
        anArray[4] = 5700;
        anArray[5] = 7600;
        anArray[6] = 2700;
        anArray[7] = 9800;
        anArray[8] = 1900;
        anArray[9] = 11191000;
        
        System.out.println("the lowest is:"+ minim(anArray));
        System.out.println("the highest is:"+ maxim(anArray));
        System.out.println("the averge is:"+ avg(anArray));
        
       // System.out.println(anArray[3]);
	}

	public static int minim(int[] s) {
		int minim = s[0];
		for ( int i = 0; i < s.length; i++ ){
					
			if ( s[i] < minim ){
				minim = s[i];
			}
		}
		return minim;

	}
	
	
	public static int maxim(int[] s){
		int maxim = s[0];
		for ( int i = 0; i < s.length; i++ ){
					
			if ( s[i] > maxim ){
				maxim = s[i];
			}
		}
		return maxim;
	}
	
	
	public static double avg(int[] s){
		int sum = 0;
		double avg = 0;
		for ( int i = 0; i < s.length; i++ ){
			sum = sum + s[i];
			avg = sum/s.length;
		}
		return avg;
	  }

}