package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Code_Largest_Row_or_Column 
{
	public static int[][] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("row");
		int row = sc.nextInt();
		System.out.println("col");
		int col = sc.nextInt();
		int arr2d[][] = new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr2d[i][j]= sc.nextInt();
			}
		}
		return arr2d;
	}
	
	public static void print(int arr2d[][])
	{
		int row = arr2d.length;
		for(int i=0; i<row; i++)
		{
			int col= arr2d[i].length;
			for(int j=0; j<col; j++)
			{
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void printLargestRowOrColumn(int arr2d[][])
	{
		int row = arr2d.length;
		int col = arr2d[0].length;
		int largestRow = Integer.MIN_VALUE;
		int indexRow = Integer.MIN_VALUE;
		for(int i=0; i<row; i++)
		{
			int sum = 0;
			for(int j=0; j<col; j++)
			{
				sum = sum + arr2d[i][j];
			}
			if(sum > largestRow)
			{
				largestRow = sum;
				indexRow = i;
			}
		}
		
		int largestCol = Integer.MIN_VALUE;
		int indexCol = Integer.MIN_VALUE;
		for(int i=0; i<col; i++)
		{
			int sum = 0;
			for(int j=0; j<row; j++)
			{
				sum = sum + arr2d[j][i];
			}
			if(sum > largestCol)
			{
				largestCol = sum;
				indexCol = i;
			}
		}
		
		if(largestRow>=largestCol)
		{
			System.out.println("Row"+" "+indexRow+" "+largestRow);
		}
		else
		{
			System.out.println("Col"+" "+indexCol+" "+largestCol);
		}
	}

	public static void main(String[] args) 
	{
		int arr2d[][] = takeInput();
		print(arr2d);
		printLargestRowOrColumn(arr2d);
		
	}

}
