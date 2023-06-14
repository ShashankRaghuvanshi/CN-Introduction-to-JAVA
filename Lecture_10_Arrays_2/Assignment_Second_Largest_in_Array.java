package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Assignment_Second_Largest_in_Array 
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
	
	public static void secondLargest(int []input)
	{
		int size = input.length;
		
		for(int i=0; i<size-1; i++)
		{
			int minNum = input[i];
			int minIndex = i;
			for(int j=i+1; j<size; j++)
			{
				if(minNum>input[j])
				{
					minIndex = j;
					minNum = input[j];
				}
			}
			input[minIndex] = input[i];
			input[i] = minNum;
		}
		System.out.println(input[size-2]);
	}
	
	
	public static void main(String []args)
	{
		int arr[] = takeInput();
		secondLargest(arr);
	}
}
