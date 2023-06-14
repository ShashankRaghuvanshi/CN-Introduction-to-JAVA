package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Assignment_Total_Sum_On_the_Boundaries_and_Diagonals 
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
	
	public static void totalSum(int arr2d[][])
	{
		int row = arr2d.length;
		int col = arr2d[0].length;
		
		int sumrow0 = 0;
		for(int j=0; j<col; j++)
		{
			sumrow0 = sumrow0 + arr2d[0][j]; 
		}
		
		int sumrowf = 0;
		for(int j=0; j<col; j++)
		{
			sumrowf = sumrowf + arr2d[row-1][j];
		}
		
		int sumcol0 =0;
		for(int i=1; i<row-1; i++)
		{
			sumcol0 = sumcol0 + arr2d[i][0];
		}
		
		int sumcolf =0;
		for(int i=1; i<row-1; i++)
		{
			sumcolf = sumcolf + arr2d[i][col-1];
		}
		
		int sumdia1 = 0;
		int sumdia2 = 0;
		for(int i=1; i<row-1; i++)
		{
			for(int j=1; j<col-1; j++)
			{
				if(i == j)
				{
					sumdia1 = sumdia1 + arr2d[i][j];
				}
				else if(j == row-i-1)				
				{
					sumdia2 = sumdia2 + arr2d[i][j];
				}
			}
		}
		int sum = sumrow0 + sumrowf +sumcol0 + sumcolf + sumdia1 + sumdia2;
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) 
	{
		int arr2d[][] = takeInput();
		print(arr2d);
		totalSum(arr2d);

	}

}
