package Lecture_11_Strings;
import java.util.Scanner;

public class Assignment_Remove_Character 
{
	public static void removeCharacter(String str, char ch)
	{
		int size = str.length();
		String out = "";
		for(int i=0; i<size; i++)
		{
			if(str.charAt(i) != ch)
			{
				out = out + str.charAt(i);
			}
		}
		System.out.println(out);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		removeCharacter(str, ch);
	}

}
