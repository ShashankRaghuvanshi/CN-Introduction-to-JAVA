package Lecture_11_Strings;
import java.util.Scanner;

public class Reverse_String 
{
	public static void reverseString(String str)
	{
		int size = str.length();
		String str1 = "";
		for(int i=0; i<size; i++)
		{
			str1 = str.charAt(i) + str1;
		}
		
//		for(int i=size-1; i>=0; i++)
//		{
//			str1 = str1 + str;
//		}
		
		System.out.println(str1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseString(str);

	}

}
