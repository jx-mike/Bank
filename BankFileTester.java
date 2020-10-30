import java.util.*;

public class BankFileTester {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		Bank bank=new Bank(5);
		System.out.print("What's the file name?");
		
		String x=scn.nextLine();
		BankIO.readFile(x,bank);
		System.out.println(bank);
	}

}
