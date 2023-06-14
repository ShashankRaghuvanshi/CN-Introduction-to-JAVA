package Lecture_5_Patterns_1;
import java.util.Scanner;

public class Introduction_to_Patterns 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print("*"+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		sc.close();
		

	}

}
