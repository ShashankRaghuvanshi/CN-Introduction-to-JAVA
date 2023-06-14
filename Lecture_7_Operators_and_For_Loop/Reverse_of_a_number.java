package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Reverse_of_a_number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int r;
		int sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.println(sum);
		
		sc.next();

	}

}
