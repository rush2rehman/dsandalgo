package CoreJava.concurrency;

import java.util.stream.Stream;

public class SimpleThreadUsingRunnable {

  public static void main(String...s)
  {
    Thread t2 = new Thread(()->{
      System.out.println("I am a new thread created through lambda");
      Stream<Integer> stream = Stream.iterate(10,n->n+1).limit(10);
      stream.forEach(x->System.out.println(Thread.currentThread().getName()+x));
     }    ,"t2");


    t2.start();


    System.out.println("Back to main thread");
  }


}
