package DesignPatterns.Observer;

import java.util.concurrent.TimeUnit;

public class Consumer implements ProduceObserver, Runnable {

  private Produce produce = null;

  @Override
  public void onProduce(Produce produce) {
    this.produce = produce;
  }


  @Override
  public void run() {

    while(true)
    {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        //
      }
      if (produce != null) {
        System.out.println(produce.getColor() + "--" + produce.getInstanceCount());
        break;
      } else {
        System.out.println("produce is still null");
      }

    }

  }
}
