package Lecture_11_Strings;
import java.util.Scanner;

public class Count_Words 
{
	public static void countWords(String str)
	{
		int size = str.length();
		if(size == 0)
		{
			System.out.println("0");
			return;
		}
		int count=0;
		for(int i=0 ; i<size ; i++)
		{
			if(str.charAt(i) == ' ' && str.substring(i+1).length()>0)
			{
				count++;
			}
		}
		System.out.println(count+1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		countWords(str);

	}

}
