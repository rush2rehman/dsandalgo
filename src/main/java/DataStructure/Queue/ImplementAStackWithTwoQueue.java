package DataStructure.Queue;

public class ImplementAStackWithTwoQueue {

  public static void main(String...s)
  {
    Stack stack = new Stack();
    stack.push(1);
    System.out.println(stack.pop());
    stack.push(1);
    stack.push(2);
    System.out.println(stack.pop());
    stack.push(3);
    stack.push(4);
    stack.push(5);
    stack.push(6);
    System.out.println(stack.pop());
    System.out.println(stack.pop());

  }

  static class Stack
  {
    private QueueFromCircularArray queue1;
    private QueueFromCircularArray queue2;
    public Stack()
    {
      this.queue1 = new QueueFromCircularArray(10);
      this.queue2 = new QueueFromCircularArray(10);

    }

    public void push(int value)
    {
      if(queue1.getQueueSize()==0)
      {
        queue2.enqueue(value);
      }
      else
      {
        queue1.enqueue(value);
      }

    }

    public int pop()
    {
      int value;
      if(queue1.getQueueSize()==0)
      {
        while(queue2.getQueueSize() !=1)
        {
          queue1.enqueue(queue2.dequeue());

        }
        value = queue2.dequeue();
      }
      else
      {
        while(queue1.getQueueSize() !=1)
        {
          queue2.enqueue(queue1.dequeue());

        }
        value = queue1.dequeue();
      }
      return value;
    }
  }


}
