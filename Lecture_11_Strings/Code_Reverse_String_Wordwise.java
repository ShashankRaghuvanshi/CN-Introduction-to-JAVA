package Lecture_11_Strings;
import java.util.Scanner;

public class Code_Reverse_String_Wordwise 
{
	public static void reverseStringWordwise(String str)
	{
		int size = str.length();
		String str1 = "";
		int j=0;
		for(int i=0; i<size; i++)
		{
			if((str.charAt(i) == ' ') )
			{
				str1 = str.substring(j,i) + " " + str1;
				j = i;
			}
		}
		str1 = str.substring(j+1,size)+" "+ str1;
		System.out.println(str1);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseStringWordwise(str);

	}

}
