package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Binary_To_Decimal 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r;
		int sum=0;
		int d=0;
		int pow=1;
		while(n>0)
		{			
			r=n%10;
			d++;
			sum=sum+r*pow;
			pow=pow*2;
			n=n/10;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
