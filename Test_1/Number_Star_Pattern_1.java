package Test_1;
import java.util.Scanner;

public class Number_Star_Pattern_1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i;
		for(i=1; i<=n; i++)
		{
			int j;
			for(j=1; j<=n-i; j++)
			{
				System.out.print(n+1-j);
			}
			for(j=1; j<=1; j++)
			{
				System.out.print("*");
			}
			for(j=1; j<=i-1; j++)
			{
				System.out.print(i-j);
			}
			System.out.println();
		}
		sc.close();
	}

}
