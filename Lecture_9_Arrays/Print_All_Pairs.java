package Lecture_9_Arrays;
import java.util.Scanner;

public class Print_All_Pairs 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int input[] = new int[size];
		for(int i=0; i<size; i++)
		{
			input[i] = sc.nextInt();
		}
		return input;
	}
	
	public static void print(int input[])
	{
		int size = input.length;
		for(int i=0; i<size; i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}
	
	public static void printAllPairs(int input[])
	{
		int size = input.length;
		for(int i=0; i<size-1; i++)
		{
			for(int j=i+1; j<size; j++)
			{
				System.out.print("("+input[i]+","+input[j]+")");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		print(arr);
		printAllPairs(arr);
		

	}

}
