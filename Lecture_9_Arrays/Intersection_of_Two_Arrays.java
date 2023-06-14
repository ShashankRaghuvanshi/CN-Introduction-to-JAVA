package Lecture_9_Arrays;

import java.util.Scanner;

public class Intersection_of_Two_Arrays 
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
	
	public static void intersectionOfTwoArrays(int input1[], int input2[])
	{
		int size1 = input1.length;
		int size2 = input2.length;
		for(int i=0; i<size1; i++)
		{
			for(int j=0; j<size2; j++)
			{
				if(input1[i]==input2[j])
				{
					System.out.print(input1[i]+" ");
					input1[i] = Integer.MIN_VALUE;
					input2[j] = Integer.MIN_VALUE;
					break;
				}
			}
		}
		System.out.println();
	}
	

	public static void main(String[] args) 
	{
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		print(arr1);
		print(arr2);
		intersectionOfTwoArrays(arr1,arr2);

	}
	
}
