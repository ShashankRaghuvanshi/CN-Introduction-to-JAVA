package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class All_Prime_Numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i = 2;
		while(i<=N)
		{
			int j=2;
			boolean prime=true;
			while(j<i)
			{
				if(i%j==0)
				{
					prime=false;
					break;
				}
				j++;
			}
			if(prime)
			{
				System.out.println(i);
			}
			i++;
		}
		
		sc.close();

	}

}
