package Lecture_9_Arrays;
import java.util.Scanner;

public class Find_Unique 
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
	
	public static void findUnique(int input[])
	{
		int size = input.length;
		for(int i=0; i<size; i++)
		{
			int count =0;
			for(int j=0; j<size; j++)
			{
				if(input[i]==input[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(input[i]);
				return;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		print(arr);
		findUnique(arr);

	}

}
