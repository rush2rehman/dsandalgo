package CoreJava.concurrency;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ThreadLocalSample {

  ThreadLocal<String> name = ThreadLocal.withInitial(() -> "Rahman");


  Thread t1 = new Thread(()->{
    Stream<Integer> stream = Stream.iterate(1,n->n+1).limit(10);
    stream.forEach(x->
    {
      try {
        TimeUnit.SECONDS.sleep(1);
      }
      catch(InterruptedException e)
      {
        //
      }
      System.out.println("My name is "+name.get());
    });
  });

  Thread t2 = new Thread(()->{
    Stream<Integer> stream = Stream.iterate(1,n->n+1).limit(10);
    stream.forEach(x->
    {
      if(x>5)
      {
        name.set("K Rahman");
      }
      try {
        TimeUnit.SECONDS.sleep(1);
      }
      catch(InterruptedException e)
      {
        //
      }
      System.out.println("My name is "+name.get());
    });
  });

  public static void main(String...s)
  {
    ThreadLocalSample tls = new ThreadLocalSample();
    tls.t1.start();
    tls.t2.start();
    HashMap<String,Integer> hm = new HashMap<>();
    int min = 0;
    /*hm.forEach((x,y)->{
      if(y!=-1 & min < y)
      {
        min = y;
      }
    });*/



  }

}
