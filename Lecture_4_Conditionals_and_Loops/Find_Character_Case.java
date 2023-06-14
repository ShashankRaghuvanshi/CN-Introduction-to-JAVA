package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Find_Character_Case 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int i = ch;
		
		if(i>=65 && i<=90)
		{
			System.out.println("1");
		}
		else if(i>=97 && i<=122)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("-1");
		}
		
		sc.close();
		
	}

}
