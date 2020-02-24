package DataStructure.Queue;

import DataStructure.LinkedList.StackUsingLL;

public class ImplementQueueFromTwoStack {

  public static void main(String...s)
  {
    StackUsingLL<Integer> stack1 = new StackUsingLL<>();
    StackUsingLL<Integer> stack2 = new StackUsingLL<>();

    Queue queue = new Queue();
    queue.enqueue(1);
    System.out.println(queue.dequeue());
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());
    System.out.println(queue.dequeue());

  }

  static class Queue
  {
    private StackUsingLL<Integer> stack1 ;
    private StackUsingLL<Integer> stack2 ;
    public Queue()
    {
      this.stack1 = new StackUsingLL<>();
      this.stack2 = new StackUsingLL<>();
    }

    public void enqueue(int value)
    {
        stack1.push(value);

    }

    public int dequeue()
    {
      if(!stack2.isEmpty())
      {
        return (Integer)stack2.pop().value;
      }
      else
      {
        while(!stack1.isEmpty()) {
          stack2.push((Integer)stack1.pop().value);

        }
        return (Integer)stack2.pop().value;
      }

    }

  }

}
