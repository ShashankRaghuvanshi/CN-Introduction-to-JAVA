package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;
public class Calculating_NcR_using_Function 
{
	public static int factorial(int n)
	{
		int ans = 1;
		for(int i=1; i<=n; i++)
		{
			ans = ans * i;
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int num = factorial(n);
		
		int den1 = factorial(r);
		
		int den2 = factorial(n-r);
		
		int ans = num/(den1 * den2);
		System.out.println(ans);
		
		sc.close();
	}

}
