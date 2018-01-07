package Strings;
import java.io.*;
import java.util.*;

public class Palindrome {

  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    String A=sc.next();

    //System.out.println(A);
    int strlen = A.length();
    char[] s = A.toCharArray();
    int j = strlen;

    for(int i = 0; i < strlen/2; i++)
    {
        if(s[i] == s[j-1])
        {
          j--;
        }
        else
        {
          System.out.println("NO");
          return;
        }
    }
    System.out.println("YES");

  }
}