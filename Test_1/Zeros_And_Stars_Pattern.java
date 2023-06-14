package Test_1;
import java.util.Scanner;

public class Zeros_And_Stars_Pattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i;
		for(i=1; i<=N; i++)
		{
			int j;
			for(j=1; j<=i-1; j++)
			{
				System.out.print("0");
			}
			for(j=1; j<=1; j++)
			{
				System.out.print("*");
			}
			for(j=1; j<=N-i; j++)
			{
				System.out.print("0");
			}
			System.out.print("*");
			
			for(j=1; j<=N-i; j++)
			{
				System.out.print("0");
			}
			for(j=1; j<=1; j++)
			{
				System.out.print("*");
			}
			for(j=1; j<=i; j++)
			{
				System.out.print("0");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
