package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Assignment_Rotate_Array 
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
	
	public static void rotateArray(int input[], int d)
	{
		int size = input.length;
		int temp[] = new int[d];
		for(int i=0; i<d; i++)
		{
			temp[i] = input[i];
		}
		for(int i=0; i<size-d; i++)
		{
			input[i] = input[i+d];
		}
		for(int i=size-d, j=0; i<size; i++)
		{
			input[i] = temp[j];
			j++;
		}
	}
	
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		int d = sc.nextInt();
		rotateArray(arr,d);
		print(arr);
	}
}
