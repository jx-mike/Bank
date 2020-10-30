import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class BankIO {

	public static void readFile(String filename, Bank bank){
		Scanner in;
	    try {
	        in = new Scanner(new File(filename));
			
			while(in.hasNext()){
				
				
				bank.add(readAccount(in));
			}
			
	    }
	    catch (FileNotFoundException e) {
	    	System.out.println("File NOT found!!");
	    		        
	    }
	
	}
	public static BankAccount readAccount(Scanner in){
		int a=in.nextInt();
		double b=in.nextDouble();
		
		BankAccount account = new BankAccount(b,a);
		
		return account;
		
	}
	
	
}
