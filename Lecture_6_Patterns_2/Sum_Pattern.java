package Lecture_6_Patterns_2;
import java.util.Scanner;


public class Sum_Pattern 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i;
		int sum;
		for(i=1; i<=n; i++)
		{
			sum=0;
			int j;
			for(j=1; j<=i; j++)
			{
				if(i==j)
				{
					System.out.print(j+"=");
					sum=sum+j;
				}
				else
				{
					System.out.print(j+"+");
					sum=sum+j;
				}
			}
			System.out.println(sum);
			
		}
		sc.close();

	}

}
