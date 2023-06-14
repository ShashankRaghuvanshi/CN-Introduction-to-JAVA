package Lecture_2_Getting_Started_With_JAVA;
import java.util.Scanner;

public class Average_Marks 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();
		
		int avg = (m1+m2+m3)/3;
		
		System.out.println(ch+ " "+ avg);
		
		sc.close();

	}

}
