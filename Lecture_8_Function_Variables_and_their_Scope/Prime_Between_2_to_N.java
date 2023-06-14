package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;

public class Prime_Between_2_to_N 
{
	public static void checkPrime(int n)
	{
		int d=2;
		while(d<n)
		{
			if(n%d==0)
			{
				return;
			}
			d++;
		}
		System.out.println(n);
		return;
	}
	
	public static void printAllPrime(int n)
	{
		for(int i=1; i<=n; i++)
		{
			checkPrime(i);
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		printAllPrime(n);
		
		sc.close();

	}

}
