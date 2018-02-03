package DataStructure.HashTable;

import java.util.Hashtable;

public class RemoveDuplicatesFromCharArray {

  public static void main(String s[])
  {
    char[] src = "fsdgkhjfg".toCharArray();

    System.out.println(removeDuplicates(src));
  }

  private static char[] removeDuplicates(char[] src) {
    Hashtable<String,Boolean> hashTable = new Hashtable();

    StringBuffer stringBuffer= new StringBuffer();

    for(char c:src)
    {
      if(hashTable.containsKey(""+c))
      {
        hashTable.put(""+c,false);
      }
      else
      {
        hashTable.put(""+c,true);
      }

    }
    hashTable.forEach((x,y)->{
      if(y)
      {
        stringBuffer.append(x);
      }
    });
    return stringBuffer.toString().toCharArray();
  }


}
