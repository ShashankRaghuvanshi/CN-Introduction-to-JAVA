package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Decimal_to_Binary 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r;
		int sum=0;
		int pow=1;
		while(n>0)
		{
			r=n%2;
			sum=sum+r*pow;
			pow=pow*10;
			n=n/2;
		}
		System.out.println(sum);
		sc.close();
	}

}
