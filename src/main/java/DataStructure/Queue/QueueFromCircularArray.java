package DataStructure.Queue;

import java.util.EmptyStackException;

public class QueueFromCircularArray {

  private int top = -1;
  private int tail = -1;
  private int queueSize;
  private int queueCapacity;
  private int[] elementArray;

  public QueueFromCircularArray( int size)
  {
    this.elementArray = new int[size];
    this.top = 0;
    this.tail = 0;
    this.queueSize = 0;
    this.queueCapacity = size;
  }

  public void enqueue(int value)
  {
    if(queueSize == queueCapacity)
    {
      throw new StackOverflowError();
    }
    else
    {
      elementArray[tail] = value;
      tail = (tail+1) % queueCapacity;
      queueSize++;

    }
  }

  public int dequeue()
  {
    if(queueSize == 0)
    {
      throw new EmptyStackException();
    }
    else
    {
      int element = elementArray[top];
      top = (top+1) % queueCapacity;
      queueSize--;
      return element;

    }

  }

  @Override
  public String toString()
  {
    if(queueSize ==0)
    {
      return "empty queue";
    }
    else
    {
      String output="";
      int pointer = top;
      for(int i =0; i < queueSize; i++)
      {
        output = output+"->"+elementArray[pointer];
        pointer = (pointer+1)%queueCapacity;

      }
      return output;
    }

  }
}
