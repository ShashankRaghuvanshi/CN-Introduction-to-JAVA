package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Sum_or_Product 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		
		if(C==1)
		{
			int i=1;
			int sum=0;
			while(i<=N)
			{
				sum = sum + i;
				i++;
			}
			System.out.println(sum);
		}
		else if(C==2)
		{
			int i=1;
			int prod = 1;
			while(i<=N)
			{
				prod=prod*i;
				i++;
			}
			System.out.println(prod);
		}
		else
		{
			System.out.println("-1");
		}
		
		sc.close();

	}

}
