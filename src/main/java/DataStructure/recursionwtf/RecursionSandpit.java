package DataStructure.recursionwtf;

public class RecursionSandpit {

  private static int fwd_counter = 0;
  private static int rev_counter = 0;

  public static void main(String...s)
  {
    callme(10);
  }

  private static void callme(int i)
  {
    if(i==0)
    {
      return;
    }
    else
    {
      //Pre-recursive call
      System.out.println("i-->"+i+" counter-->"+fwd_counter++);
      callme(i-1);
      //post recursive call
      System.out.println("i-->"+i+" counter-->"+rev_counter++);
    }
  }

}
