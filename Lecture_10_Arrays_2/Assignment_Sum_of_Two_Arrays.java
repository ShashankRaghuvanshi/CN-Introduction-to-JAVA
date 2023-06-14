package Lecture_10_Arrays_2;

import java.util.Scanner;

public class Assignment_Sum_of_Two_Arrays 
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
	
	public static void sumOfTwoArrays(int arr1[], int arr2[])
	{
		int i = arr1.length-1;
		int j = arr2.length-1;
		int carry = 0;
		int k = Math.max(arr1.length, arr2.length);
		int output[] = new int[k];
		
		while(i >=0 && j>=0)
		{
			int sum = arr1[i] + arr2[j] + carry;
			output[k--] = sum % 10;
			carry = sum / 10;
			i--;
			j--;
//			k--;
		}
		
		while(i >= 0)
		{
			int sum = arr1[i] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			
			i--;
			k--;
		}
		

		while(j >= 0)
		{
			int sum = arr2[j] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			
			j--;
			k--;
		}
		
		output[0] = carry;
		print(output);
	}
	
	public static void main(String []args)
	{
		int arr1[] = takeInput();
		int arr2[] = takeInput();
		sumOfTwoArrays(arr1,arr2);
	}
}
