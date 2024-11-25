/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    
		System.out.println("[---ATM Machine---]");
		System.out.println("");
		System.out.print("[Enter your account name]: ");
		String name = sc.nextLine();
		System.out.println("");
		System.out.print("[Enter your account password]: ");
		String pass = sc.nextLine();
		
	    int pinUser = 1234;
	    System.out.println("");
		System.out.print("{Enter PIN}: ");
	    int pin = sc.nextInt();
	    
	    System.out.println("");
	    if(pinUser == pin){
	        System.out.println("PIN Correct!");
            System.out.println("");
		    System.out.print("[Current Balance]: 2456.97 ");
		    String firstLeter = sc.nextLine();
	    }else{
	        System.out.println("Pin Incorrect!");
	    }
	    
	
		
		
	}
}