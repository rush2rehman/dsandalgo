package DataStructure.Queue;

import DataStructure.LinkedList.StackUsingLL;

public class ReversingAQueue {

  public static void main(String...s)
  {
    QueueFromCircularArray queue = new QueueFromCircularArray(10);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.enqueue(7);
    queue.enqueue(8);
    queue.enqueue(9);
    queue.enqueue(10);
    System.out.println(queue.toString());
    reverse(queue);
    System.out.println(queue.toString());

  }

  private static QueueFromCircularArray reverse(QueueFromCircularArray queue) {
    StackUsingLL<Integer> stack = new StackUsingLL<>();
    while(queue.getQueueSize() !=0)
    {
      stack.push(queue.dequeue());
    }
    while(!stack.isEmpty())
    {
      queue.enqueue((Integer)(stack.pop().value));
    }
    return queue;
  }

}
