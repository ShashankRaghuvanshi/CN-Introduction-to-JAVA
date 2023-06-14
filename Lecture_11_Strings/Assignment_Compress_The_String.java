package Lecture_11_Strings;

import java.util.Scanner;

public class Assignment_Compress_The_String 
{
	public static void compressTheString(String str)
	{
      int count=0;
      String ans= "";
     
      if(str.length()==0)
      {
    	  System.out.println(ans);
          return;
      }
     
		for(int i=0; i<str.length(); i++)
		{
          for(int j=i+1; j<str.length()-1; j++)
          {
              if(str.charAt(i)==str.charAt(j))
	          {
	             count++;
	             i++;
	          }
              else
              {
                  break;
              }
          }
         
          if(count+1>1)
          {
              ans = ans + str.charAt(i) + (count+1);
          }
          else
          {
              ans = ans + str.charAt(i);
          }
          count =0;
      }
      System.out.println(ans);
	
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		compressTheString(str);

	}

}
