package DesignPatterns.Observer;

import DesignPatterns.Observer.Produce.Color;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable{

  public ArrayList<Consumer> observerList = new ArrayList<>();

  public void register(Consumer consumer)
  {
    observerList.add(consumer);
  }


  @Override
  public void run() {
    try {
      TimeUnit.SECONDS.sleep(10);
    } catch (InterruptedException e) {
      //
    }
    Produce produce = new Produce.ProduceBuilder(Color.RED,0).build();
    observerList.forEach(x->x.onProduce(produce));


  }
}
