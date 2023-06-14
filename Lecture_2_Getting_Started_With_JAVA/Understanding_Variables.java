package Lecture_2_Getting_Started_With_JAVA;

public class Understanding_Variables 
{
	public static void main(String[] args)
	{
		int a = 20;  //4 bytes
		int b = 30;
		int c = a + b;
		System.out.println(c);
		
		short s = 123; 	//2 bytes
		
		long l = 12345; //8 bytes
		
		float f = 1.6f;	//4 bytes
		
		double d = 333.32; //8 bytes
		
		char ch = 'a';  //2 bytes
		
		boolean x = true; 
		
		// abc....  ABC... 123... _ allowed in variable name
		
		int p=1000;
		int r=10;
		int t=5;
		
		int si = (p*r*t)/100;
		System.out.println(si);
		
		
	}
}
