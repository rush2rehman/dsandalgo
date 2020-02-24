package DesignPatterns.Observer;

public class Main {

  public static void main(String...s)
  {
    Consumer consumer = new Consumer();
    Producer producer = new Producer();
    producer.register(consumer);
    Thread consumerThread = new Thread(consumer);
    Thread producerThread = new Thread(producer);
    consumerThread.start();
    producerThread.start();
  }

}
