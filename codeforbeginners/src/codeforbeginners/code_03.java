package codeforbeginners;
import java.util.Scanner;



public class code_03 {
	
	/* input and adding a 2 numbers */

	public static void main(String[] args) {
	int a,b,c ;  
	
	System.out.println("enter any two numbers ");
	 Scanner s = new Scanner(System.in); // for input a number 
	  a = s.nextInt(); // integer value store 
	  b  = s.nextInt();
	  
	  c  = a+b;
	  System.out.println(c); // print the sum of two number 

	}

}
