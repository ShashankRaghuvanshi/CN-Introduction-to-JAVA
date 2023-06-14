package Lecture_11_Strings;
import java.util.Scanner;

public class Code_String_Palindrome 
{
	public static void stringPalindrome(String str)
	{
		int size = str.length();
		int i=0; 
		while(i<size/2)
		{
			if(str.charAt(i) != str.charAt(size-1-i))
			{
				System.out.println("false");
				return;
			}
			i++;
		}
		System.out.println("true");
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		stringPalindrome(str);

	}

}
