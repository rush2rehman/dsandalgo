package DataStructure.HashTable;

import java.util.Hashtable;

public class CheckIntArraysHaveSameNumbers {

  public static void main(String...s)
  {
    int[] A = {1,2,3,46,7,8,10,6};
    int[] B = {46,1,2,3,8,7,10,6};
    System.out.println(check(A,B));
  }

  private static boolean check(int[] a, int[] b) {
    Hashtable<Integer,Integer> hashtable = new Hashtable<>();
    for(int i:a)
    {
      if(hashtable.containsKey(i))
      {
        hashtable.put(i,hashtable.get(i)+1);
      }
      else
      {
        hashtable.put(i,1);
      }
    }
    for(int j:b)
    {
      if(hashtable.containsKey(j))
      {
        int count = hashtable.get(j);
        if(count==1)
        {
          hashtable.remove(j);
        }
        else
        {
          hashtable.put(j,count-1);
        }
      }
      else
      {
        return false;
      }
    }
    return true;
  }

}
