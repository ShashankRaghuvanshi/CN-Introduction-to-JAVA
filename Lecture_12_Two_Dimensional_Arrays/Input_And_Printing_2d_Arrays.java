package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Input_And_Printing_2d_Arrays 
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

	public static void main(String[] args) 
	{
		int arr2d[][] = takeInput();
		print(arr2d);

	}

}
