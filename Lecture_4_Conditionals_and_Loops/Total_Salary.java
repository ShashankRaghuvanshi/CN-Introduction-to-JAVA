package Lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Total_Salary 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		char ch = sc.next().charAt(0);
		int totalSalary;
		int hra = 20 * basic / 100;
		int da = 50 * basic / 100;
		int allow;
		
		if(ch == 'A') 
		{
			allow = 1700;
		}
		else if(ch == 'B')
		{
			allow = 1500;
		}
		else
		{
			allow =1300;
		}
		
		int pf = 11 * basic / 100;
		
		totalSalary = basic + hra + da + allow - pf;
		System.out.println(totalSalary);
		
		sc.close();
	}

}
