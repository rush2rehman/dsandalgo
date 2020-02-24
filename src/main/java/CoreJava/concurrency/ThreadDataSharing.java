package CoreJava.concurrency;

import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import sun.java2d.xr.MutableInteger;

public class ThreadDataSharing {

  ThreadLocal<MutableInteger>  sb = new ThreadLocal<MutableInteger>();


  public static void main(String[] s) throws InterruptedException {
    ThreadDataSharing tg = new ThreadDataSharing();
    tg.sb.set(new MutableInteger(0));

    Thread t1 = new Thread(new AddName(tg.sb.get()));
    t1.start();

    Thread t2 = new Thread(new AddName(tg.sb.get()));
    t2.start();

    Stream.iterate(0,n->n+1).limit(10).forEach(x->
    {
      try {
        TimeUnit.SECONDS.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(tg.sb.get().getValue());
    });


  }


}
