package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Terms_of_AP 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int i=1;
		int count=0;
		while(count<x)
		{
			if((3*i+2)%4!=0)
			{
				System.out.print((3*i+2)+" ");
				count++;				
			}
			i++;
			
		}
		sc.close();

	}

}
