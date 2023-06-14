package Lecture_9_Arrays;

import java.util.Scanner;

public class Arrange_Numbers_in_Array 
{
	public static int[] arrangeNumbersInArray()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int input[] = new int[size];
		for(int i=0; i<size; i++)
		{
			if(i<=size/2)
			{
				input[i] = i*2+1;
			}
			else
			{
				input[i] = (size-i)*2;
			}
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

	public static void main(String[] args) 
	{
		int arr[] = arrangeNumbersInArray();
		print(arr);
	}

}
