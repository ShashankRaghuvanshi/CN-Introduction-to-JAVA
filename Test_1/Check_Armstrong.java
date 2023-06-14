package Test_1;
import java.util.Scanner;

public class Check_Armstrong 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int d=0;
		int n=N;
		while(n>0)
		{
			d++;
			n=n/10;
		}
		
		n=N;
		int sum=0;
		int r;
		while(n>0)
		{
			r=n%10;
			sum = sum+(int)Math.pow(r, d);
			n=n/10;
		}
		if(N == sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
		sc.close();
	}

}
