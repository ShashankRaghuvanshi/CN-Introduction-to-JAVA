package Lecture_12_Two_Dimensional_Arrays;

import java.util.Scanner;

public class Assignment_Print_Spiral 
{
	//todo this problem?????????
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
	public static void printSpiral(int mat[][])
	{
		int rows = mat.length; //gives the total length of rows
        if(rows == 0){
            return;
        }
        int cols = mat[0].length;
        int i, rowStart=0, colStart=0;
        int numberOfElements = rows*cols, count = 0;
        while(count<numberOfElements){
            //Section 1
            for(i=colStart;count<numberOfElements && i<cols;i++){
                System.out.print(mat[rowStart][i]+ " ");
                count++; //always increase count when you print one element.
            }
            rowStart++;

            //Section 2
            for(i=rowStart;count<numberOfElements && i<rows;i++){
                System.out.print(mat[i][cols-1]+ " ");
                count++;
            }
            cols--;

            //Section 3
            for(i=cols-1;count<numberOfElements && i>=colStart;i--){
                System.out.print(mat[rows-1][i]+ " ");
                count++;
            }
            rows--;

            //Section 4
            for(i=rows-1;count<numberOfElements && i>=rowStart;i--){
                System.out.print(mat[i][colStart]+ " ");
                count++;
            }
            colStart++;
        }
	}

	public static void main(String[] args) 
	{
		int arr2d[][] = takeInput();
		printSpiral(arr2d);
	}
}
