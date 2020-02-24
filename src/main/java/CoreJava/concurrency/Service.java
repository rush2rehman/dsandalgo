package CoreJava.concurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class Service implements Runnable {

  private final CountDownLatch latch;
  private String name = null;

  public Service(String name, CountDownLatch latch)
  {
    this.name = name;
    this.latch = latch;
  }


  @Override
  public void run() {
    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      //
    }

    System.out.println(name+" is UP");
    latch.countDown();

  }
}
