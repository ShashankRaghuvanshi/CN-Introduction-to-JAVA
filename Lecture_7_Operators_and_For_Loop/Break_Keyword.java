package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Break_Keyword 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 2;
		boolean divided = false;
		while(i<n)
		{
			if(n%i==0)
			{
				divided = true;
				break;
			}
			i++;
			
		}
		if(divided)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
		sc.close();

	}

}
