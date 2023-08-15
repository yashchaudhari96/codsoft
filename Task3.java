import java.util.Scanner;

class Atm{
	float bal;
	int pin = 9603;

	
	
	public void checkpin(){
		System.out.println("Enter your Pin : ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if(enterpin == pin){
			menu();
		}
		else{
			System.err.println("Enter a valid pin");

			checkpin();

			
		}
		
	}
	public void menu(){
		System.out.println("Enter your choice : ");
		System.out.print("1. Check Balance ");
		System.out.print("\t2. WithDraw Money ");
		System.out.print("\n3. Deposite Money ");
		System.out.print("\t4. Exit ");
		System.out.println("\n");
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		switch(opt){
		case 1 : checkBalance();
		break;
		case 2 : withDraw();
		break;
		case 3 : depositeMoney();
		break;
		case 4 : exit();
		break;
		default :
			System.out.println("Enter a valid choice!!");
		}
				
		}
	public void checkBalance(){
		System.out.println("Balance : "+bal);
		menu();
		
	}
	public void withDraw(){
		System.out.println("Enter amount to withdraw : ");
		Scanner sc = new Scanner(System.in);
		float amt = sc.nextFloat();
		if(amt>bal){
			System.err.println("sorry!! Insufficient Balance");
			
		}
		else{
			bal = bal-amt;
			System.out.println("Money Withdraw successfully!!");
		}
		menu();
		
	}
	public void depositeMoney(){
		System.out.println("Enter the amount you want to deposite:  ");
		Scanner sc = new Scanner(System.in);
		float damt = sc.nextFloat();
		 bal = bal + damt;
		 System.out.println("Money Deposited successfully!!");
		 menu();
		 
		
	}
	public void exit(){
		System.out.println("Have a good day!!");
	}
	

	
}



public class Task3 {
	public static void main(String[] k){
		System.out.println("\t\t\tWelcome to SBI Bank");
		System.out.println("");

		Atm obj = new Atm();
		obj.checkpin();
	
	}

}
