package Lecture_6_Patterns_2;
import java.util.Scanner;

public class Odd_Square 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int o = n*2-1;
		int i;
		for(i=1; i<=n; i++)
		{
			int j;
			for(j=1; j<=n-i+1; j++)
			{
				System.out.print((2*(j+i-1)-1)+" ");
			}
			for(j=1; j<=i-1; j++)
			{
				System.out.print((2*j-1)+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
