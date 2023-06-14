package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Multiplication_Table 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i=1;
		while(i<=10)
		{
			System.out.println(i*n);
			i++;
		}
		sc.close();
	}

}
