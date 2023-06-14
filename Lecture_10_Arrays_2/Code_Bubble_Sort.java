package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Code_Bubble_Sort 
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
	
	public static void bubbleSort(int []input)
	{
		int size = input.length;
		for(int i=0; i<size-1; i++)
		{
			for(int j=0; j<size-1-i; j++)
			{
				if(input[j] > input[j+1])
				{
					int temp = input[j+1];
					input[j+1] = input[j];
					input[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		bubbleSort(arr);
		print(arr);
	}
}
