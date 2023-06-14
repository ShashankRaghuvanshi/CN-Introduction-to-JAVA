package Lecture_5_Patterns_1;
import java.util.Scanner;

public class Triangular_Pattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print((i+j-1)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		i=1;
		int count=0;
		while(i<=n)
		{
			int j=1;
			while(j<=i)
			{
				count++;
				System.out.print(count+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		sc.close();

	}

}
