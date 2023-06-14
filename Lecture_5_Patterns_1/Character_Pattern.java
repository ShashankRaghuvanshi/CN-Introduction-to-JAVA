package Lecture_5_Patterns_1;
import java.util.Scanner;

public class Character_Pattern 
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
				System.out.print((char)('A'+j-1)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print((char)('A'+j+i-2)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		sc.close();

	}

}
