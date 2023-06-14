package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Sum_of_even_and_odd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r;
		int sumOdd = 0;
		int sumEven = 0;
		
		while(n>0)
		{
			r = n%10;
			if(r%2==0)
			{
				sumEven = sumEven + r;
			}
			else
			{
				sumOdd = sumOdd + r;
			}
			n = n/10;
		}
		System.out.println(sumEven+" "+sumOdd);
		
		sc.close();

	}

}
