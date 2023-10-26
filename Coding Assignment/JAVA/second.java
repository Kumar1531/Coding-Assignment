package JAVA;

import java.io.*;   
import java.lang.Math;  
public class second  
{   
  int character(char r)   
  {   
    if (r == 'I')   
      return 1;   
    if (r == 'V')   
      return 5;   
    if (r == 'X')   
      return 10;   
    if (r == 'L')   
      return 50;   
    if (r == 'C')   
      return 100;   
    if (r == 'D')   
      return 500;   
    if (r == 'M')   
      return 1000;   
    return -1;   
  }   

  int RomanToInt(String s)   
  {   

    int total = 0;   

    for (int i=0; i<s.length(); i++)   
    {   
      int s1 = character(s.charAt(i));   

      if (i+1 <s.length())   
      {   
        int s2 = character(s.charAt(i+1));   
        if (s1 >= s2)   
        {   
          total = total + s1;   
        }   
        else  
        {   
          total = total - s1;   
        }   
      }   
      else  
      {   
        total = total + s1;   
      }   
    }   
    return total;   
  }   
  public static void main(String args[])   
  {   
    second ob = new second();  
    String S= "IX";   
    System.out.println("The Integer value is: "+ob.RomanToInt(S));   
  }   
}  