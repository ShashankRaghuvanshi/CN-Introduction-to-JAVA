package Lecture_11_Strings;
import java.util.Scanner;

public class Assignment_Highest_Occuring_Character 
{
	public static void hightestOccuringCharacter(String str)
	{
		int size = str.length();
		String maxString = "";
		int maxChar = 0;
		for(int i=0; i<size; i++)
		{
			int count = 0;
			for(int j=i; j<size; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			if(count > maxChar)
			{
				maxChar = count;
				maxString = str.charAt(i) + "";
			}
		}
		System.out.println(maxString);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		hightestOccuringCharacter(str);

	}

}
