package Lecture_9_Arrays;
import java.util.Scanner;

public class Taking_Input_And_Printing_Array 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		sc.close();
	}

}
