package Lecture_6_Patterns_2;
import java.util.Scanner;

public class Mirror_Image_Pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i;
		for( i=1 ; i<=n ; i++ )
		{
			int j;
			for( j=1 ; j<=n-i ; j++)
			{
				System.out.print(" "+" ");
			}
			for( j=1 ; j<=i ; j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
