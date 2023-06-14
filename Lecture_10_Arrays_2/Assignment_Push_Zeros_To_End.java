package Lecture_10_Arrays_2;
import java.util.Scanner;

public class Assignment_Push_Zeros_To_End 
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
	
	public static int[] pushZerosToEnd(int input[])
	{
		int size = input.length;
		int arr[] = new int[size];
		int j=0;
		int count=0;
		for(int i=0; i<size; i++)
		{
			if(input[i] != 0)
			{
				arr[j] = input[i];
				j++;
			}
			else
			{
				count++;
			}
		}
		while(count>0)
		{
			arr[j] = 0;
			j++;
			count--;
		}
		return arr; 
	}
	
	public static void main(String []args)
	{
		int arr[] = takeInput();
		int arr1[] = pushZerosToEnd(arr);
		print(arr1);
	}
}
