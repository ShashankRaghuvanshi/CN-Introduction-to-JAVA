package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Code_Merge_Two_Sorted_Arrays 
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
	
	public static void mergeTwoSortedArrays(int input1[], int input2[])
	{
		int size1 = input1.length;
		int size2 = input2.length;
		int size3 = size1 + size2;
		int arr3[] = new int[size3];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<size1 && j<size2)
		{
			if(input2[j]<=input1[i])
			{
				arr3[k] = input2[j];
				j++;
				k++;
			}
			else
			{
				arr3[k] = input1[i];
				i++;
				k++;
			}
		}
		
		while(j < size2)
		{
			arr3[k] = input2[j];
			k++;
			j++;
		}
		
		while(i < size1)
		{
			arr3[k] = input1[i];
			k++;
			i++;
		}
		
		print(arr3);
	}
	

	public static void main(String[] args) 
	{
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		mergeTwoSortedArrays(arr1, arr2);
	}
}
