package Test_2;

import java.util.Scanner;

public class Assignment_Leaders_in_array 
{
	public static int[] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void leadersArray(int input[])
	{
		int i;
		int j;
		for(i=0; i<input.length-1; i++)
		{
			for(j=i+1; j<input.length; j++)
			{
				if(input[i]<input[j])
				{
					break;
				}
			}
			if(j==input.length)
			{
				System.out.print(input[i]+" ");
			}
		}
		System.out.print(input[input.length-1]);
	}

	public static void main(String[] args) 
	{
		int arr[] = takeInput();
		leadersArray(arr);

	}

}
