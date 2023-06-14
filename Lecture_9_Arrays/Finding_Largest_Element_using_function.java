package Lecture_9_Arrays;
import java.util.Scanner;

public class Finding_Largest_Element_using_function 
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
	
	public static void print(int []input)
	{
		int size = input.length;
		for(int i=0; i<size; i++)
		{
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void largest(int input[])
	{
		int size = input.length;
		int largest = Integer.MIN_VALUE;
		
		for(int i=0; i<size; i++)
		{
			if(input[i]>largest)
			{
				largest = input[i];
			}
		}
		System.out.println(largest);
	}
	
	public static void main(String[] args) 
	{
		int []arr = takeInput();
		print(arr);
		largest(arr);
		
	}

}
