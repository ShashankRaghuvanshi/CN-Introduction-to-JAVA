package Lecture_2_Getting_Started_With_JAVA;
import java.util.Scanner;

public class Taking_Input_Scanner 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char ch = str.charAt(0);
		
		
		int p = sc.nextInt();
		int r = sc.nextInt();
		int t = sc.nextInt();
		int si = (p * r * t)/100;
		System.out.println(si);
		System.out.println(ch);
		
		
		sc.close();
	}

}
