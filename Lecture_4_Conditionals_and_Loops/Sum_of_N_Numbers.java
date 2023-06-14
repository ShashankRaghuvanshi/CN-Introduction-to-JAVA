package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Sum_of_N_Numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i<=n)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		sc.close();

	}

}
