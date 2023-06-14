package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Assignment_Sort_0_1_2 
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
	
	public static void sort012(int input[])
	{
		int size = input.length;
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int k=0;
		
		for(int i=0; i<size; i++)
		{
			if(input[i]==0)
			{
				count0++;
			}
			else if(input[i]==1)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		
		while(count0>0)
		{
			input[k++] = 0;
			count0--;
		}
		
		while(count1>0)
		{
			input[k++] = 1;
			count1--;
		}
		
		while(count2>0)
		{
			input[k++] = 2;
			count2--;
		}
		
		print(input);
	}
	
	public static void main(String []args)
	{
		int arr[] = takeInput();
		sort012(arr);
	}
}
