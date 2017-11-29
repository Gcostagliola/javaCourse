package labs2;

public class schoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// modification to commit a change to git 
	student student1 = new student("Paolo", "15530172");
	student1.setUid();
	student1.setCity("hosta");
	student1.setPhone(817212);
	student1.setState("harizon");
	student1.enroll("math");
	student1.enroll("Science");
	student1.enroll("java");
	student1.showCourses();

	student1.checkBalance();
	
	student1.pay(3500);
	
	student1.enroll("Physics");

	student1.pay(1500);
		
	}

}


class student {
	
	private String name;
	private String SSN;
	private static int iD = 10; 
	private int phone;
	private String city; 
	private String state; 
	private String email;
	private String uId;
	private double balance;
	private String enrolledIn;
	private String courseList;
	
	// constructors
	
	public student (String name, String SSN ){
		iD++;
		this.name = name;
		this.SSN = SSN;
		setEmail(name);
		balance = 0;
		courseList = "none";
	}
	
	
	//getters and setters 
	public void setEmail(String name) {
		this.email = name + "@theschool.com";
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setUid(){
		int randomN = (int) (Math.random()*9000)+1000;
		uId =iD +""+ randomN +SSN.substring(SSN.length()-4, SSN.length());
	}
	
	 public String getUid(){
		 return uId;
	 }
	 
	 public void setCity(String cityName){
		 this.city = cityName;
		 System.out.println("City set to:" + cityName);
	 }
	 
	 public String getCity() {
		 return  city;
	 }
	 
	 public void setPhone(int phone){
		 this.phone = phone;
		 System.out.println("Phone set to:" + phone);
	 }
	 
	 public int getPhone() {
		 return  phone;
	 }
	 
	 public void setState(String state){
		 this.state = state;
		 System.out.println("State set to:" + state);
	 }
	 
	 public String getState() {
		 return  state;
	 }
	
	 
	// Methods
	 
	 public void enroll(String assig){
		 enrolledIn = assig;
		 if ( courseList.contentEquals("none")) {
		 courseList = "[" + enrolledIn + "]";
		 }
		 else {
			 courseList = courseList + "[" +enrolledIn+ "]";
		 }
		 
		 System.out.println("just enrolled in:" + enrolledIn);
		 balance = balance - 1000;
		 checkBalance();
		 
	 }
	
	 public void showCourses(){
		 System.out.println("currently coursing:" + courseList);
	 }
	 
	 public void pay(double money){
		 balance = balance + money;
		 checkBalance();
	 }
	 
	 
	 public void checkBalance(){
		 System.out.println("Current balance:"+balance);
	 }
	 
	 
	 
}