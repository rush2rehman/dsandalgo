package CoreJava.concurrency;

import java.io.UncheckedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ThreadJoin implements Runnable{

  public static void main(String...s)
  {
    List<Exception> exception = new ArrayList<>();
    Thread t1 = new Thread(new ThreadJoin(),"t1");
    Thread t2 = new Thread(()->{
      try {
        TimeUnit.SECONDS.sleep(100);

      }
      catch (InterruptedException e)
      {
        System.out.println("t2 interrupted");
        throw new RuntimeException("test");


      }
    });
    t2.setUncaughtExceptionHandler((e,x)->{
          System.out.println("Reached an unchecked exception-->"+x.getMessage());
          exception.add(new ExecutionException(x));
    });
    t1.start();
    t2.start();
    try {
      t1.join();
    }
    catch (Exception e)
    {
      System.out.println("ignore");
    }

    System.out.println("t1 is alive?-->"+t1.isAlive());
    System.out.println("t2 is alive?-->"+t2.isAlive());
    t2.interrupt();
    System.out.println(exception.size());
    try {
      TimeUnit.SECONDS.sleep(5);
    }
    catch(InterruptedException e)
    {

    }
    System.out.println(exception.size());


  }


  @Override
  public void run() {
    int count = 0;
    while(true)
    {
      count++;
      try
      {
        if(count > 3)
        {
          break;
        }
        System.out.println("count->" + count);
        Thread.sleep(50);

      }
      catch (InterruptedException e)
      {
       //
      }
    }
  }

}


