package Lecture_11_Strings;
import java.util.Scanner;

public class Assignment_Reverse_Each_Word 
{
	public static void reverseEachWord(String str)
	{
		int size = str.length();
		String str2 = "";
		int j=0;
		for(int i=0; i<size; i++)
		{
			String reverse = "";
			if(str.charAt(i)==' ')
			{
				for(int k=j; k<i; k++)
				{
					reverse = str.charAt(k) + reverse;
				}
				str2 = str2 + reverse + " ";
				j = i+1;
				
				
			}
		}
		if(str.charAt(size-1) != ' ')
		{
			String reverse = "";
			for(int k=j; k<size; k++)
			{
				reverse = str.charAt(k) + reverse;
			}
			str2 = str2 + reverse;
		}
		
		System.out.println(str2);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseEachWord(str);

	}

}
