package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class While_Loop 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
		

	}

}
