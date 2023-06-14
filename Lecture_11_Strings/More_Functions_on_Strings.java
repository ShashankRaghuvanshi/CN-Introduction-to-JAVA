package Lecture_11_Strings;

public class More_Functions_on_Strings {

	public static void main(String[] args) 
	{
		String str1 = "Coding";
		String str2 = " Ninjas";
		String str3 = "Coding";
//		System.out.println(str1 + str2);
//		str1 = str1 + str2;
//		System.out.println(str1);
		
//		str1 = str1.concat(str2);
//		System.out.println(str1);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str2));
		
		System.out.println(str1.contains("ing"));
		
	}

}
