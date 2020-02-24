package DataStructure.Queue;

public class QueueTest {

  public static void main(String...s)
  {
    QueueFromCircularArray queueFromCircularArray = new QueueFromCircularArray(10);
    System.out.println(queueFromCircularArray.toString());
    queueFromCircularArray.enqueue(1);
    System.out.println(queueFromCircularArray.toString());
    queueFromCircularArray.dequeue();
    System.out.println(queueFromCircularArray.toString());
    queueFromCircularArray.enqueue(2);
    System.out.println(queueFromCircularArray.toString());
    queueFromCircularArray.dequeue();
    System.out.println(queueFromCircularArray.toString());
    queueFromCircularArray.enqueue(3);
    queueFromCircularArray.enqueue(4);
    queueFromCircularArray.enqueue(5);
    queueFromCircularArray.enqueue(6);
    queueFromCircularArray.enqueue(7);
    queueFromCircularArray.enqueue(8);
    queueFromCircularArray.enqueue(9);
    queueFromCircularArray.enqueue(10);
    queueFromCircularArray.enqueue(11);
    queueFromCircularArray.enqueue(12);

    System.out.println(queueFromCircularArray.toString());
    System.out.println(queueFromCircularArray.dequeue());
    System.out.println(queueFromCircularArray.dequeue());
    System.out.println(queueFromCircularArray.dequeue());
    queueFromCircularArray.enqueue(13);
    System.out.println(queueFromCircularArray.dequeue());
    System.out.println(queueFromCircularArray.toString());
  }

}
