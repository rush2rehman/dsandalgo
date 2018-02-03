package DataStructure.LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class ReverseLinkedList {

  public static void main(String...s)
  {
    LinkedListCustom<Integer> ll = new LinkedListCustom<>();
    ll.addLast(10);
    ll.addLast(20);
    ll.addLast(30);
    ll.addLast(40);
    ll.addLast(50);
    ll.addLast(60);
    System.out.println(ll);
    Node head = reverseUtil(ll.peak(),null);
    while(head!= null)
    {
      System.out.println(head.value);
      head = head.next;
    }

    Queue queue = new PriorityQueue<Integer>();

  }

  private static Node reverse(Node<Integer> head) {
    Node<Integer> prev = null;
    Node<Integer> curr = head;
    Node<Integer> next = null;
    while(curr!=null)
    {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    return prev;

  }

  static Node reverseUtil(Node curr, Node prev) {
Node head = null;
    /* If last node mark it head*/
    if (curr.next == null) {
      head = curr;

      /* Update next to prev node */
      curr.next = prev;
      return null;
    }

    /* Save curr->next node for recursive call */
    Node next1 = curr.next;

    /* and update next ..*/
    curr.next = prev;

    reverseUtil(next1, curr);
    return head;
  }

}
