package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Largest_of_three_numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("A is largest");
		}
		else if(b>=c)
		{
			System.out.println("B is largest");
		}
		else
		{
			System.out.println("C is largest");
		}
		
		sc.close();

	}

}
