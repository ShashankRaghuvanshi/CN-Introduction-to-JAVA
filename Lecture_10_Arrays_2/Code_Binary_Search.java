package Lecture_10_Arrays_2;
import java.util.Scanner;

public class Code_Binary_Search 
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
	
	public static void binarySearch(int input[], int x)
	{
		int size = input.length;
		int start = 0;
		int end = size-1;
		int mid;
		while(start<end)
		{
			mid = (start + end)/2;
			if(input[mid] == x)
			{
				System.out.println(mid);
				return;
			}
			else if(input[mid]>x)
			{
				end = mid-1;
			}
			else
			{
				start = mid+1;
			}
		}
		System.out.println("Number not in array");
		return;
	}

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int arr[] = takeInput();
		int x = sc.nextInt();
		binarySearch(arr,x);

	}

}
