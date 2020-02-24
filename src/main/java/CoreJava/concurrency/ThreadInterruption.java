package CoreJava.concurrency;

import java.util.stream.Stream;

public class ThreadInterruption implements Runnable{

  public static void main(String...s)
  {
    Thread t1 = new Thread(new ThreadInterruption(),"t1");
    t1.start();
    t1.interrupt();
    Stream stream = Stream.iterate(1, n-> n+1).limit(10);
    stream.forEach(x->{
      try {
        Thread.sleep(1000);
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
      System.out.println("Interruption count" + x);
      t1.interrupt();
    });

  }


  @Override
  public void run() {
    while(true)
    {
      if(Thread.interrupted()) {
        System.out.println("respond to interruption");
      }
      else
      {
        try {
          System.out.println("going to sleep");
          Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
          System.out.println("Interrupted a sleeping thread");
          Thread.currentThread().interrupt();
        }
      }
    }

  }
}
