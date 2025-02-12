package root;

import java.util.Scanner;

public class Program {
	 public static void main(String[] args) {
		 
		 int firstNum;
		 int secondNum;
		 
		 Scanner userInput = new Scanner(System.in);
		 System.out.print("Enter first Number : ");
		 firstNum = userInput.nextInt();
		 
		 System.out.print("Enter second Number : ");
		 secondNum = userInput.nextInt();
		 
		 int sum = firstNum + secondNum;
		 int diff = firstNum - secondNum;
		 int mul = firstNum * secondNum;
		 int divid = firstNum / secondNum;
		 
		 System.out.println("The Summation of two number (" + firstNum + " + " + secondNum + ") = " + sum);
		 System.out.println("The Differance of two number (" + firstNum + " - " + secondNum + ") = " + diff);
		 System.out.println("The Multiplication of two number (" + firstNum + " -* " + secondNum + ") = " + mul);
		 System.out.println("The dividaation of two number (" + firstNum + " / " + secondNum + ") = " + divid);
		 
		 
	 }

}
