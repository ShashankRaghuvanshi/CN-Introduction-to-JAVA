package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Code_Selection_Sort 
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
	
	public static void selectionSort(int []input)
	{
		int size = input.length;
		for(int i=0; i<size-1; i++)
		{
			int min = input[i];
			int minIndex= i;
			for(int j=i+1; j<size; j++)
			{
				if(input[j]<min)
				{
					min = input[j];
					minIndex = j;
				}
			}
			input[minIndex] = input[i];
			input[i] = min;	
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		selectionSort(arr);
		print(arr);
	}
}
