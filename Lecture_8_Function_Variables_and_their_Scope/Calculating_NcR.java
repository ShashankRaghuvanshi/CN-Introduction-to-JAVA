package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;

public class Calculating_NcR 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int i;
		int num = 1;
		for(i=1; i<=n; i++)
		{
			num = num * i;
		}
		
		int den1 = 1;
		for(i=1; i<=n-r; i++)
		{
			den1 = den1 * i;
		}
		
		int den2 = 1;
		for(i=1; i<=r; i++)
		{
			den2 = den2 * i;
		}
		
		int nCr = num/(den1*den2);
		System.out.println(nCr);

	}

}
