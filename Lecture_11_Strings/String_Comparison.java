package Lecture_11_Strings;

public class String_Comparison 
{

	public static void main(String[] args) 
	{
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		if(str1 == str2)                        //String pools
		{
			System.out.println("Both are equal ");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		if(str1 == str3)                        //String pools
		{
			System.out.println("Both are equal ");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		if(str1.equals(str3))                        //String pools
		{
			System.out.println("Both are equal ");
		}
		else
		{
			System.out.println("Not equal");
		}
	}

}
