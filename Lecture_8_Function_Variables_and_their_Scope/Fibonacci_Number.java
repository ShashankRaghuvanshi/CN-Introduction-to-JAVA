package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;

public class Fibonacci_Number 
{
	public static boolean isFabonacci(int n)
	{
		int a = 0;
		int b = 1;
		int c;
		while(a<n)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if(a==n)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean ans = isFabonacci(N);
		System.out.println(ans);
		
		sc.close();
	}

}
