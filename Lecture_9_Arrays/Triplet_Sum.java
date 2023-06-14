package Lecture_9_Arrays;

import java.util.Scanner;

public class Triplet_Sum 
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
	
	public static void tripletSum(int input[], int x)
	{
		int size = input.length;
		int count = 0;
		for(int i=0; i<size-2; i++)
		{
			for(int j=i+1; j<size-1; j++)
			{
				for(int k=j+1; k<size; k++)
				{
					if((input[i]+input[j]+input[k])==x)
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		int X = sc.nextInt();
		print(arr);
		tripletSum(arr,X);
	}

}
