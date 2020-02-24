package CoreJava.concurrency;

import java.util.concurrent.TimeUnit;

public class Car implements Runnable {

  Thread scooter;

  public Integer getTotalKMs() {
    return totalKMs;
  }

  public void setTotalKMs(Integer totalKMs) {
    this.totalKMs = totalKMs;
  }

  Integer totalKMs;

  public void setScooter(Thread s)
  {
    scooter = s;
  }

  @Override
  public void run() {

    while(true)
    {
      System.out.println("Car is running, KM count" + totalKMs);
      totalKMs++;
      try {
        TimeUnit.SECONDS.sleep(1);
      }
      catch (InterruptedException e)
      {
        System.out.println("interrupted during run time");
      }
      if(totalKMs % 10 == 0)
      {
        System.out.println("Car has covered 10 KM, lets use scooter..");

        scooter.interrupt();
        try {
          TimeUnit.SECONDS.sleep(20);
        }
        catch (InterruptedException e)
        {
          //
        }
      }
    }
  }
}
