package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;

public class Prime_or_not_using_Function 
{
	public static boolean isPrime(int n)
	{
		int i = 2;
		while(i<n)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		boolean ans = isPrime(n);
		System.out.println(ans);
		
		sc.close();

	}

}
