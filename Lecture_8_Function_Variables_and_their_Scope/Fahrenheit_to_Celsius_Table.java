package Lecture_8_Function_Variables_and_their_Scope;
import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table 
{
	public static void fahToCel(int a, int b, int c)
	{
		while(a<=b)
		{
			int cel;
			cel = 5 * (a-32) / 9;
			System.out.println(a+" "+cel);
			a = a + c;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		
		fahToCel(S,E,W);
		
		sc.close();
		
	}

}
