package CoreJava.concurrency;

import java.util.concurrent.TimeUnit;

public class Scooter implements Runnable{

  public void setCar(Thread car) {
    this.car = car;
  }

  Thread car;

  public Integer getTotalKMs() {
    return totalKMs;
  }

  public void setTotalKMs(Integer totalKMs) {
    this.totalKMs = totalKMs;
  }

  Integer totalKMs;




  @Override
  public void run() {
    try {
      TimeUnit.SECONDS.sleep(60);
    } catch (InterruptedException e) {
      //e.printStackTrace();
      Thread.currentThread().interrupt();
    }
    while (true) {
      System.out.println("Scooter is running, KM covered .."+totalKMs);
      totalKMs++;
      try {
        TimeUnit.SECONDS.sleep(1);
      }
      catch (InterruptedException e)
      {
        System.out.println("interrupted during run time");
      }
      if (totalKMs %10 == 0) {
        System.out.println("Scooter has covered 10 KM, lets use car..");

        car.interrupt();
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
