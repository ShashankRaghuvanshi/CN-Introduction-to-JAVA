package Lecture_3_How_is_Data_Stored;
import java.util.Scanner;

public class Data_Stored 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char c = 'a';
		System.out.println(c + 3);
		
		int i = c + 10;
		System.out.println(i);
		
		i = c;   //implicit typecasting
		char abc = (char)i; //explicit typecasting
		
		long l = 134132431413l;
		i = (int)l;
		System.out.println(i);   //data loss
		
	}

}
