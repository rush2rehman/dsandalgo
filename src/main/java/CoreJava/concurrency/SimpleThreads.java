package CoreJava.concurrency;

import java.util.stream.Stream;

public class SimpleThreads extends Thread{

  public static void main(String...s)
  {
    Thread t1 = new SimpleThreads("t1");
    Thread t2 = new SimpleThreads("t2");
    t1.start();
    t2.start();
    System.out.println("waiting...");
  }

  public SimpleThreads(String name)
  {
    super(name);
  }
  @Override
  public void run()
  {
    String name = currentThread().getName();
    System.out.println("I am a new thread"+name);
    try {
      Stream<String> s = Stream.iterate(name,n->n+1).limit(10);
      s.forEach(System.out::println);
      if(name.equals("t2"))
      {
        Thread.sleep(100000);
      }

    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}
