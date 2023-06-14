package Lecture_6_Patterns_2;
import java.util.Scanner;

public class Code_Inverted_Number_Pattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i;
		for(i=1; i<=n; i++)
		{
			int j;
			for(j=1; j<=n-i+1; j++)
			{
				System.out.print((n-i+1)+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
