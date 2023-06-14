package Lecture_12_Two_Dimensional_Arrays;

public class Jagged_Arrays 
{

	public static void main(String[] args) 
	{
		int arr2d[][] = new int[4][];
		for(int i=0; i<arr2d.length; i++)
		{
			arr2d[i] = new int[i+2];
		}
		
		for(int i=0; i<arr2d.length; i++)
		{
			int size = arr2d[i].length;
			for(int j=0; j<size; j++)
			{
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}

	}

}
