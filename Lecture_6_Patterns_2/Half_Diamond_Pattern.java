package Lecture_6_Patterns_2;
import java.util.Scanner;
public class Half_Diamond_Pattern 
{
	
//	IT has to be done??

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i;
		System.out.println("*");
		for(i=1; i<=n; i++)
		{
			System.out.print("*");
			int j;
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(j=1; j<=i-1; j++)
			{
				System.out.print(i-j);
			}
			System.out.println("*");
		}
		for(i=1; i<=n-1; i++)
		{
			System.out.print("*");
			int j;
			for(j=1; j<=n-i; j++)
			{
				System.out.print(j);
			}
			for(j=1; j<=n-i-1; j++)
			{
				System.out.print(n-j-i);
			}
			System.out.println("*");
		}
		System.out.println("*");
		
		sc.close();

	}

}
