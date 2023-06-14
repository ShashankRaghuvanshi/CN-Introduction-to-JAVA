package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Find_power_of_a_number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int z = 1;
		
		while(n>0)
		{
			z = z * x ;
			n--;
		}
		System.out.println(z);
		
		sc.close();

	}

}
