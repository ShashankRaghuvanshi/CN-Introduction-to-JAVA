package Test_2;

import java.util.Scanner;

public class Assignment_Minimum_Length_Word 
{
	public static void minimumLengthWord(String str)
	{
		int size = str.length();
		String strMin = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" ;
		int j=0;
		for(int i=0; i<size; i++)
		{
			if(str.charAt(i) == ' ')
			{
				String str1 = str.substring(j,i);
				if(str1.length() < strMin.length())
				{
					strMin = str1;
				}
				j=i+1;
			}
			if(str.substring(j,size).length() < strMin.length())
			{
				strMin = str.substring(j,size);
			}
		}
		
		System.out.println(strMin);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		minimumLengthWord(str);

	}

}
