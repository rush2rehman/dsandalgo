package Strings;

public class SubStringFirstMatch {

  public static void main(String...s)
  {
    System.out.println(subStringIndex("Stopping","fagrey"));
  }

  public static int subStringIndex(String str, String substr) {
    int substrlen = substr.length();
    int strlen = str.length();
    int j = 0;
    int temp = 0;

    if (substrlen >= 1) {
      for (int i = 0; i < strlen; i++) {              // iterate through main string
        if (str.charAt(i) == substr.charAt(j)) {    // check substring
          j++;                                    // iterate
          temp = j==1?i:temp;
          if (j == substrlen) {                   // when to stop
            return i - substrlen+1; //found substring. As i is currently at the end of our substr so sub substrlen
          }
        }
        else {
          if (j>0)
          {
            i = temp;
          }
          j = 0;
        }
      }
    }
    return -1;
  }

}


