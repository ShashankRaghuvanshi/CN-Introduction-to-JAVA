package Lecture_9_Arrays;

import java.util.Scanner;

public class Sort_0_1 
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
	
	public static void sort_0_1(int input[])
	{
		int size = input.length;
		int count = 0;
		for(int i=0; i<size; i++)
		{
			if(input[i]==0)
			{
				count++;
			}
		}
		for(int i=0; i<size; i++)
		{
			if(i<count)
			{
				input[i] = 0;
			}
			else
			{
				input[i] = 1;
			}
		}
		
	}
	

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		sort_0_1(arr);
		print(arr);
	}


}
