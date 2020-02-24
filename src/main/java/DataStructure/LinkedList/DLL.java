package DataStructure.LinkedList;

import java.util.NoSuchElementException;

public class DLL<K> {

  private DLLNode<K> head;

  private DLLNode<K> tail;
  private int length = 0;

  public DLL()
  {
    this.head = null;
    this.tail = null;
  }

  public DLLNode<K> getHead() {
    return head;
  }

  public DLLNode<K> getTail() {
    return tail;
  }

  public int getLength() {
    return length;
  }

  @Override
  public String toString() {

    String output = "";
    if (this.head == null)
      output = "Empty List";
    else {
      for (DLLNode node = this.head; node != null; node = node.getNext()) {
        output += "->"+node.getData() ;
      }
    }
    return output;
  }

  public void addFirst(K value)
  {
    DLLNode head = this.head;
    DLLNode<K> nodeToBeAdded = new DLLNode(value,null, head);
    this.head = nodeToBeAdded;
    if(head==null)
    {
      this.tail = nodeToBeAdded;
    }
    else
    {
      head.setPrev(nodeToBeAdded);
    }

    this.length++;

  }

  public void addLast(K value)
  {
    DLLNode last = this.tail;
    DLLNode<K> nodeToBeAdded = new DLLNode<>(value, last,null);
    this.tail = nodeToBeAdded;
    if(last == null)
    {
      this.head = nodeToBeAdded;
    }
    else
    {
      last.setNext(nodeToBeAdded);
    }
    length++;
  }

  public void removeFirst()
  {
    final DLLNode head = this.head;
    if(head == null)
    {
      throw new NoSuchElementException();
    }
    if(head.getNext() == null)
    {
      this.head = null;
      this.tail = null;
    }
    else
    {
      this.head = head.getNext();
      head.setPrev(null);
    }
    length--;
  }

  public void removeLast()
  {
    final DLLNode last = this.tail;
    if(last == null)
    {
      throw new NoSuchElementException();
    }
    this.tail = last.getPrev();
    if(this.tail == null) {
      this.head = null;
    }
    else
    {
      this.tail.setNext(null);
    }
    length--;
  }

  public void add(int index, K value)
  {
    DLLNode<K> nodeToBeInserted = new DLLNode<>(value,null,null);
    if(index > length+1)
    {
      throw new IndexOutOfBoundsException();
    }
    if(this.head == null)
    {
      this.head = nodeToBeInserted;
      this.tail = nodeToBeInserted;
    }
    else
    {

    }
  }



}
