package Test_2;

import java.util.Scanner;

public class Assignment_Print_2D_Array 
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
	
	public static void print2DArray(int arr2d[][])
	{
		int row = arr2d.length;
		int col = arr2d[0].length;
		for(int i=0; i<row; i++)
		{
			int n = row;
			while(n-i>0)
			{
				for(int j=0; j<row; j++)
				{
					System.out.print(arr2d[i][j]+" ");
				}
				System.out.println();
				n--;
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr2d[][] = takeInput();
		print2DArray(arr2d);

	}
}
