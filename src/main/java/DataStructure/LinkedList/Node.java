package DataStructure.LinkedList;

public class Node<K> {

  public K value;
  public Node next;

  public Node(K value, Node node)
  {
    this.next = node;
    this.value = value;
  }

}
