package Lecture_7_Operators_and_For_Loop;

public class Increment_Decrement_Operators 
{

	public static void main(String[] args) 
	{
		int a =10;
		System.out.println(a++);
		a++;
		++a;
		System.out.println(a);
		
		int b = a++;
		System.out.println(b);
		System.out.println(a);
		
		a = 4;
		a *=2;
		System.out.println(a);
		
		a ^= 2;
		System.out.println(a);

	}

}
