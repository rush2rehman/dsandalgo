package CoreJava.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import sun.java2d.xr.MutableInteger;

public class AddName implements Runnable {

  MutableInteger sbuffer;


  public AddName(MutableInteger sb)
  {
    sbuffer = sb;
  }

  @Override
  public void run() {
    System.out.println(sbuffer.getValue());
    Stream.iterate(0,n->n+1).limit(10).forEach(x->
    {
      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      sbuffer.setValue(sbuffer.getValue()+1);
    });


  }
}
