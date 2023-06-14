package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Prime_number_check 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=2;
		
		while(i<n)
		{
			if(n%i==0)
			{
				System.out.println("Not prime");
				return;
			}
			i++;
		}
		System.out.println(n + " " + "Prime");	
		
		sc.close();

	}

}
