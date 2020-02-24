package DataStructure.HashTable;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SymmetricPairs {
  static Hashtable<Integer,Integer> hashtable = new Hashtable<>();

  public static void main(String...s)
  {
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();
    while(count>0)
    {
      System.out.println(symmetricPairExists(scanner.next()));
      count--;
    }
    scanner.close();
  }

  private static String symmetricPairExists(String next) {
    //System.out.println(next);
    StringTokenizer stringTokenizer = new StringTokenizer(next,",");
    int A = Integer.parseInt(stringTokenizer.nextToken());
    int B = Integer.parseInt(stringTokenizer.nextToken());
    if(hashtable.containsKey(B))
    {
      if(hashtable.get(B).equals(A))
      {
        return next;
      }
      else
      {
        hashtable.put(A,B);
      }
    }
    else
    {
      hashtable.put(A,B);
    }

    return "";
  }

}
