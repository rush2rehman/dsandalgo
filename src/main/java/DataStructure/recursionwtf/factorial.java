package DataStructure.recursionwtf;

public class factorial {

  static int[] iarr = {1,2,3,9,5,6,7,8,8,10};

  public static void main(String...s)
  {
    //System.out.println(printFactorial(5));
    //print(5);

   // System.out.println(isSorted(iarr,0,1));
    System.out.println(fib(10));
  }

  private static int printFactorial(int i) {
    if(i==0)
    {
      return 1;
    }
    else
      return i * printFactorial(i-1);

  }

  private static int print(int n)
  {
    if(n==0)
    {
      return 0;

    }
    else
    {
      System.out.println(n);
      return print(n-1);
    }
  }

  //Given an array find out whether it is sorted using recursion
  private static boolean isSorted(int[] iArray, int i, int j)
  {
    if(iArray.length == 1 || iArray.length == i+1)
    {
      return true;
    }

    if(iArray[i] > iArray[j])
    {
      return false;
    }
    else
    {
      return isSorted(iArray, i+1, j+1);
    }
  }

  private static int fib(int i)
  {
    if(i ==0 || i == 1)
    {
      return 1;
    }
    else
    {
      return fib(i-1)+fib(i-2);
    }
  }


}
