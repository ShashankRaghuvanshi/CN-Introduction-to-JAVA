package Lecture_9_Arrays;
import java.util.Scanner;

public class Linear_Search 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int []input = new int[size];
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
	
	public static void linearSearch(int input[] )
	{
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int size = input.length;
		for(int i=0; i<size; i++)
		{
			if(X==input[i])
			{
				System.out.println(i);
				return;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		print(arr);
		linearSearch(arr);

	}
	
}
