package Lecture_2_Getting_Started_With_JAVA;
import java.util.Scanner;


public class Operators 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int fah = sc.nextInt();
		int cel = 5 * (fah - 32 ) / 9;
		System.out.println(cel);
		
		sc.close();
		
		System.out.println('a' + 'b');
		
		//relational operators a>=b a<b a==b a!=b a>b 
		//logical operators and &&, or ||, negation !
 	}

}
