package labs2;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODo
		BankAccount acc1 = new BankAccount("1230981212", 1250);
		
		acc1.setName("Paolo");
		System.out.println(acc1.getName());
		acc1.payBill(1000);
		acc1.makeDeposit(12343);
		acc1.doRate();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements iRate {
	// Properties of the banckAccount
	private int iD = 1000;
	private String name;
	private String accountNumber; //id + random 2 digit + fist2 of SSN
	private static final String routingNumber = "00912001";
	private String SSN;
	private double balance;


	// constructors
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber(){
		int random = (int)  (Math.random() *100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
	}
	
	//Getters and Setters 
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return(name);
	}
	
	// Methods 
	public void payBill (double amount){
		balance = balance - amount;
		System.out.println("Paying bill:" + amount);
	}
	
	public void makeDeposit (double amount){
		balance = balance + amount; 
		System.out.println("Making deposit:" + amount);
	}

	public void showBalance (){
		System.out.println("balance:" + balance);
	}

	@Override
	public void doRate() {
		balance =  balance * ((rate/100) +1);
		showBalance();
	}
	
	@Override
	public String toString(){
		return "[Name:" + name + "]"+"[account#" + accountNumber +"]" + "[Routing#:" + routingNumber + "]";
	}
}
