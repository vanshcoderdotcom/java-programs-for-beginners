package codeforbeginners;

/* types of variables
 * instance 
 * local
 * static     */


public class code_02 
{
	int a= 10;  // instance 
	
	static double b= 20.55; // static variable
	

	public static void main(String[] args) 
	{
		
		boolean  c = true ; // local variable
		code_02 s = new code_02(); //(for printing the instance variable we firstly should make an object for this )
		
	    System.out.println(s.a);
	    
		System.out.println(c);
		
		System.out.println(b);
		
	}

}
