package DataStructure.Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstNonRepeatingChar {

  public static void main(String s[])
  {
    System.out.println(firstNotRepeatingCharacter("testtie"));
  }


  static char firstNotRepeatingCharacter(String s) {

    HashMap<Character,Integer> hm = new HashMap();
    char[] carr = s.toCharArray();
    int index = 0;
    int minIndex = -1;
    char firstNonRepeatingChar = '_';
    for(char x:carr)
    {

      if(hm.containsKey(x))
      {
        hm.put(x,-1);
      }
      else
      {
        hm.put(x,index);
      }
      index++;
    }


    Iterator it = hm.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry pair = (Map.Entry)it.next();
      if((Integer)pair.getValue()!=-1 && (minIndex > (Integer)pair.getValue() || minIndex == -1))
      {
        minIndex = (Integer)pair.getValue();
        firstNonRepeatingChar = (Character)pair.getKey();
      }
    }
    return firstNonRepeatingChar;

  }


}
