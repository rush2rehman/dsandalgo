package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BasicOpsComplexity {
  static long startTime;
  static long endTime;
  public static void main(String...s)
  {
    access(generateQueue(10),9);
    access(generateQueue(100),99);
    access(generateQueue(1000),999);
    access(generateQueue(10000),9999);
    access(generateQueue(100000),99999);
    access(generateQueue(1000000),999999);
    search(generateQueue(10),106);
    search(generateQueue(100),106);
    search(generateQueue(1000),106);
    search(generateQueue(10000),106);
    search(generateQueue(100000),106);
    search(generateQueue(1000000),106);

    //Insert ==> push ==> o(1)
    //Delete ==> pop ==> o(1)



  }


  public static Queue<Integer> generateQueue(int size)
  {
    Queue<Integer> newQueue = new LinkedList<>();
    for(int i = 0; i < size; i++)
    {
      newQueue.add((int)(Math.random()*1000)+10);
    }
    return newQueue;
  }

  //Access nth element from top
  //o(n)
  public static void access(Queue<Integer> a, int index)
  {
    startTime = System.currentTimeMillis();
    int initialSize = a.size();

    for(int i = 0; i < index-1; i++)
    {
      a.poll();

    }
    System.out.println(index+"th/st/rd element-->"+a.peek());

    endTime = System.currentTimeMillis();
    System.out.println("For a queue of size "+initialSize+" Access op Took " + (endTime - startTime));

    return;
  }

  //search stack
  //o(n)
  public static void search(Queue<Integer> a, int value)
  {
    startTime = System.currentTimeMillis();
    int initialSize = a.size();
    String searchResult= "";
    for(int i = 0; i < initialSize; i++)
    {
      if(value == a.poll())
      {
        searchResult += i+" ";
      }

    }
    System.out.println("searchResult-->"+searchResult);

    endTime = System.currentTimeMillis();
    System.out.println("For a queue of size "+initialSize+" search op Took " + (endTime - startTime));

    return;
  }
}
