package CoreJava.concurrency;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

  public static void main(String...s) throws InterruptedException {
    CountDownLatch latch = new CountDownLatch(3);
    Thread t1 = new Thread(new Service("transport",latch));
    Thread t2 = new Thread(new Service("Stock",latch));
    Thread t3 = new Thread(new Service("FPS",latch));
    t1.start();
    t2.start();
    t3.start();

    latch.await();
    System.out.println("all services are up");
  }


}
