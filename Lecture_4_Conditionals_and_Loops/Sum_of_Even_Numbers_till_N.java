package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Sum_of_Even_Numbers_till_N 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i=1;
		int sum = 0;
		
		while(i<=N)
		{
			if(i%2==0)
			{
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
		
		sc.close();
	}

}
