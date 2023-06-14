package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Code_Insertion_Sort 
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
	
	public static void insertionSort(int []input)
	{
		//unsorted part
		for(int i=1; i<input.length; i++)
		{
			int j = i -1;
			int temp = input[i];
			
			//sorted part
			while(j>=0 && input[j]>temp)
			{
				input[j+1] = input[j];
				j--;
			}
			input[j+1] = temp;
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		insertionSort(arr);
		print(arr);
	}
}
