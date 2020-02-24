package CoreJava.concurrency;

import java.util.concurrent.TimeUnit;
import org.omg.CORBA.TIMEOUT;

public class ThreadGame {

   volatile Integer kmTravelled = new Integer(0);


  public static void main(String...s)
  {
    ThreadGame tg = new ThreadGame();
    Scooter scooter = new Scooter();
    scooter.setTotalKMs(tg.kmTravelled);
    Car car = new Car();
    car.setTotalKMs(tg.kmTravelled);
    Thread scooterThread = new Thread(scooter);
    Thread carThread = new Thread(car);
    scooter.setCar(carThread);
    car.setScooter(scooterThread);
    scooterThread.start();
    carThread.start();
    System.out.println(tg.kmTravelled);
    try {
      TimeUnit.SECONDS.sleep(20);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("KM from main-->"+ tg.kmTravelled);
  }


}
