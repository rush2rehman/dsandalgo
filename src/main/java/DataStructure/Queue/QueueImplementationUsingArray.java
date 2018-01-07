package DataStructure.Queue;

public class QueueImplementationUsingArray {

  public static void main(String...s)
  {
    queueImpl q = new queueImpl(10);

  }



}

class queueImpl{

  private int[] queueArr;
  int front;
  int rear ;
  int length;

  public queueImpl(int size)
  {
    queueArr = new int[size];
    front = -1;
    rear = -1;
    length =  0;
  }

  public int peek() throws Exception
  {
    if(length>0)
    {
      return queueArr[length-1];
    }
    else
    {
      throw new Exception("Queue Empty");
    }
  }

  public int poll() throws Exception
  {
    if(length>0)
    {

      length -= 1;
      return queueArr[length];
    }
    else
    {
      throw new Exception("Queue Empty");
    }
  }

  public void add(int value)
  {
    //queueArr
  }

}
