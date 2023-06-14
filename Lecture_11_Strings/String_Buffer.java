package Lecture_11_Strings;

public class String_Buffer {

	public static void main(String[] args) 
	{
		StringBuffer str = new StringBuffer("abc");
		
		str.setCharAt(0, 'd');
		
		System.out.println(str);
		
		str.append("def");
		System.out.println(str);
		System.out.println(str.length());
		
		//StringBuffer is mutable, dynamic , but not memory optimise
		
	}

}
