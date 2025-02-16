package welcome;

import java.util.Scanner;

public class CommandLineScannner {
	
	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Please enter your firs maessage : ");
		String msg1 = scr.nextLine();
		
		System.out.println("Pleasee write your last message : ");
		String msg2 = scr.nextLine();
		
		System.out.println(msg1 + ", this is midle part from defoult, and " + msg2);
	}

}