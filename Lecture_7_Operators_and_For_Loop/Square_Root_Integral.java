package Lecture_7_Operators_and_For_Loop;
import java.util.Scanner;

public class Square_Root_Integral 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=0;
		while(i<=n)
		{
			if((i*i)<=n && ((i+1)*(i+1)>n))
			{
				System.out.println(i);
				break;
			}
			i++;
		}
		sc.close();

	}

}
