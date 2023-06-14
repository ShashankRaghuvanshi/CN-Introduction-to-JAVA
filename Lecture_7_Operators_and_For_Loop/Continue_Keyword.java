package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Continue_Keyword 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=n)
		{
			if(i==5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		
		sc.close();

	}

}
