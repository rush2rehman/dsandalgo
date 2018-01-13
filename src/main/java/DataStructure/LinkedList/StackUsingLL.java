package DataStructure.LinkedList;

public class StackUsingLL<K> {

  private LinkedListCustom<K> stackLL;

  public StackUsingLL()
  {
    this.stackLL = new LinkedListCustom<>();
  }

  public void push(K value)
  {
    stackLL.addFirst(value);
  }

  public void pop()
  {
    stackLL.peak();
    stackLL.removeFirst();
  }

  public K peek()
  {
    Node<K> node = stackLL.peak();
    return node.value;
  }

  public int search(K value)
  {
    return stackLL.search(value);
  }






}
