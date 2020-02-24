package DataStructure.LinkedList;

public class DLLNode<K> {

  private K data;

  private DLLNode prev;
  private DLLNode next;

  public DLLNode(K data, DLLNode prev, DLLNode next)
  {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }

  public K getData() {
    return data;
  }

  public void setData(K data) {
    this.data = data;
  }

  public DLLNode<K> getPrev() {
    return prev;
  }

  public void setPrev(DLLNode<K> prev) {
    this.prev = prev;
  }

  public DLLNode<K> getNext() {
    return next;
  }

  public void setNext(DLLNode<K> next) {
    this.next = next;
  }






}
