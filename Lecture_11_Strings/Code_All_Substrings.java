package Lecture_11_Strings;
import java.util.Scanner;

public class Code_All_Substrings 
{	
	public static void printSubString(String str)
	{
		int size = str.length();
		//1st method
		for(int i=0; i<size; i++)
		{
			for(int j=i+1; j<size+1; j++)
			{
				System.out.print(str.substring(i,j)+" ");
			}
			System.out.println();
		}
		//2nd method
		for(int len=1; len<= str.length(); len++)
		{
			for(int start = 0; start <=str.length() - len; start++)
			{
				int end = start + len -1;
				System.out.println(str.substring(start,end+1));
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubString(str);
	}

}
