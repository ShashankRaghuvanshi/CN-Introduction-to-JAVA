package Lecture_11_Strings;
import java.util.Scanner;

public class Assignment_Remove_Consecutive_Duplicates 
{
	public static void removeConsecutiveDuplicate(String str)
	{
		int size = str.length();
		String str1 = "";
		for(int i=0; i<size-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				str1 = str1 + str.substring(i,i+1);
				i++;
			}
			else
			{
				str1 = str1 + str.substring(i,i+1);
				if((i+1) == size-1)
				{
					str1 = str1 + str.substring(i+1,size);
				}
			}
		}
		System.out.println(str1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		removeConsecutiveDuplicate(str);
	}

}
