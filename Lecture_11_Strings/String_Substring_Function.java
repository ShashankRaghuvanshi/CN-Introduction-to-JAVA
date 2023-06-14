package Lecture_11_Strings;

public class String_Substring_Function 
{

	public static void main(String[] args) 
	{
		String str1 = "Coding";
		
//		System.out.println(str1.substring(0));
//		System.out.println(str1.substring(2));
//		System.out.println(str1.substring(4));
//		System.out.println(str1.substring(5));
		
		String substr = str1.substring(6);   //empty string
		System.out.println(substr.length()); 
		
		substr = str1.substring(1,5);   //end index exlusive
		System.out.println(substr);
		
		substr = str1.substring(1,6);
		System.out.println(substr);     
		
		//beyond length it through exception out of bound
	}

}
