package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Factors 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 2;
		int count=0;
		
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				count++;
			}
			i++;
		}
		if(count<1)
		{
			System.out.println("-1");
		}
		sc.close();
	}

}
