package basics;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(4));
	}
	
	public static int fact(int f){
		if ( f == 0 ){
			return 1;
		} else if ( f == 1 ) {
			return 1;
		} else {
			return (f * fact(f-1)  );
		}

}
}
	
