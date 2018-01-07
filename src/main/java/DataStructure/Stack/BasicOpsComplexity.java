package DataStructure.Stack;

import java.util.Stack;

public class BasicOpsComplexity {
  static long startTime;
  static long endTime;
  public static void main(String...s)
  {
   /* access(generateStack(10),9);
    access(generateStack(100),99);
    access(generateStack(1000),999);
    access(generateStack(10000),9999);
    access(generateStack(100000),99999);
    access(generateStack(1000000),999999);*/
    search(generateStack(10),106);
    search(generateStack(100),106);
    search(generateStack(1000),106);
    search(generateStack(10000),106);
    search(generateStack(100000),106);
    search(generateStack(1000000),106);

    //Insert ==> push ==> o(1)
    //Delete ==> pop ==> o(1)



  }


  public static Stack<Integer> generateStack(int size)
  {
    Stack<Integer> newStack = new Stack<>();
    for(int i = 0; i < size; i++)
    {
      newStack.push((int)(Math.random()*1000)+10);
    }
    return newStack;
  }

  //Access nth element from top
  //o(n)
  public static void access(Stack<Integer> a, int index)
  {
    startTime = System.currentTimeMillis();
    int initialSize = a.size();

    for(int i = 0; i < index-1; i++)
    {
      a.pop();

    }
    System.out.println(index+"th/st/rd element-->"+a.peek());

    endTime = System.currentTimeMillis();
    System.out.println("For a Stack of size "+initialSize+" Access op Took " + (endTime - startTime));

    return;
  }

  //search stack
  //o(n)
  public static void search(Stack<Integer> a, int value)
  {
    startTime = System.currentTimeMillis();
    int initialSize = a.size();
    String searchResult= "";
    for(int i = 0; i < initialSize; i++)
    {
      if(value == a.pop())
      {
        searchResult += i+" ";
      }

    }
    System.out.println("searchResult-->"+searchResult);

    endTime = System.currentTimeMillis();
    System.out.println("For a Stack of size "+initialSize+" search op Took " + (endTime - startTime));

    return;
  }
}
