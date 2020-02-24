package CoreJava.concurrency;

import java.util.concurrent.TimeUnit;

public class Sleep {

  public static void main(String...s)
  {
    int value = 2500;
    try {
      System.out.println("gonna sleep for "+value+"microseconds");
      TimeUnit.MICROSECONDS.sleep(value);

      System.out.println("gonna sleep for "+value+"milliseconds");
      TimeUnit.MILLISECONDS.sleep(value);

      System.out.println("gonna sleep for "+10+"seconds");
      TimeUnit.SECONDS.sleep(10000);

    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
  }

}
