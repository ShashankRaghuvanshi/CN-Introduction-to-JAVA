package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Assignment_Check_Array_Rotation 
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
	
	public static void checkArrayRotation(int input[])
	{
		int size = input.length;
		for(int i=0; i<size-1; i++)
		{
			if(input[i]>input[i+1])
			{
				System.out.println(i+1);
				return;
			}
		}
		System.out.println("0");
		return; 
	}
	
	public static void main(String []args)
	{
		int arr[] = takeInput();
		checkArrayRotation(arr);
	}
}
