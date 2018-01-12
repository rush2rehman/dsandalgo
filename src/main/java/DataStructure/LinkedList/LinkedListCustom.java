package DataStructure.LinkedList;

public class LinkedListCustom<K> {

  private Node head;
  private Node tail;

  public LinkedListCustom()
  {
    this.head = null;
    this.tail = null;
  }


  public String toString()
  {
    Node node = this.head;
    String output = "";

    while(node != null)
    {
      output = output + "->"+node.value.toString();
      node = node.next;
    }
    return output;
  }

  public K peak()
  {
    Node<K> node = this.head;
    K peakValue = node.value;

    return peakValue;
  }

  public void addLast(K last) {
    Node nodeTobeAdded = new Node(last,null);
    Node head = this.head;
    Node tail = this.tail;
    if(head == null)
    {
      this.head = nodeTobeAdded;
      this.tail = nodeTobeAdded;
    }
    else
    {
      tail.next = nodeTobeAdded;
      this.tail = nodeTobeAdded;
    }
  }

  public void addFirst(K value) {
    Node head = this.head;
    Node nodeToBeAdded = new Node(value, head);

    if(head==null) {
      this.head = nodeToBeAdded;
      this.tail = nodeToBeAdded;
    }
    else
    {
      this.head = nodeToBeAdded;
    }
  }

  public void add(int index, K value) throws Exception {
    int listSize = this.getSize();
    Node previousNode = null;
    Node node = this.head;
    Node nodeToBeAdded = new Node(value, null);
    System.out.println("size -->"+listSize);
    if(index ==0 || index > listSize+1)
    {
      throw new Exception("Invalid Index");
    }
    if(index == listSize+1)
    {
      this.addLast(value);
    }
    if(index ==1)
    {
      this.addFirst(value);
    }

    else
    {
      for(int i =0; i < index; i++)
      {
        previousNode = node;
        node = node.next;
      }
      previousNode.next = nodeToBeAdded;
      nodeToBeAdded.next = node;

    }
  }

  public int getSize() {
    int count = 0;
    Node node = this.head;
    if(this.head == null)
    {
      return 0;
    }
    else
    {
      while(node != null)
      {
        count++;
        node = node.next;
      }
    }
    return count;
  }

  public void removeFirst() {
    Node head = this.head;
    if (head != null)
      this.head = head.next;
    else if(this.head != null && this.head == this.tail)
    {
      this.head = null;
      this.tail = null;
    }
    else {
      System.out.println("Empty List");
    }
  }

  public void removeLast() {
    Node node = this.head;
    Node previousNode = null;
    if(node==null)
    {
      System.out.println("empty list");
      return;
    }
    if(this.getSize() == 1)
    {
      this.head = null;
      this.tail = null;
      return;
    }
    else
    {
      while(node!=this.tail)
      {
        previousNode = node;
        node = node.next;

      }
      this.tail = previousNode;
      previousNode.next = null;

    }
  }

  public void remove(int index) throws Exception {
    int listSize = this.getSize();
    Node previousNode = null;
    Node node = this.head;
    System.out.println("size -->"+listSize+ " index-->"+index);
    if(index ==0 || index > listSize)
    {
      throw new Exception("Invalid Index");
    }
    if(index == listSize)
    {
      this.removeLast();
      return;
    }
    else if(index ==1)
    {
      this.removeFirst();
      return;
    }

    else
    {
      for(int i =0; i < index-1; i++)
      {
        previousNode = node;
        node = node.next;
      }
      previousNode.next = node.next;

    }

  }
}
