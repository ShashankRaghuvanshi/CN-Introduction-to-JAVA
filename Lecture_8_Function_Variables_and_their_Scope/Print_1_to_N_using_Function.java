package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;

public class Print_1_to_N_using_Function 
{
	public static void printN(int n)
	{
		if(n<=0)
		{
			return;
		}
		for(int i=1; i<=n ; i++)
		{
			System.out.println(i);
		}		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printN(n);
		
		sc.close();
	}

}
