package DataStructure.LinkedList;

import java.util.HashSet;

public class FindCycleinLL {

  public static void main(String...s)
  {
    LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();
    Node circleStartNode = new Node(10,null);
    Node circleEndNode = new Node(9,circleStartNode);
    linkedListCustom.addLast(1);
    linkedListCustom.addLast(2);
    linkedListCustom.addLast(3);
    linkedListCustom.addLast(4);
    linkedListCustom.addLastNode(circleStartNode);
    linkedListCustom.addLast(6);
    linkedListCustom.addLast(7);
    linkedListCustom.addLast(8);
    linkedListCustom.addLastNode(circleEndNode);

    //print(linkedListCustom,20);
    //System.out.println(doesItEndWithCycle(linkedListCustom));
    //System.out.println(slow_fast_pointer_approach(linkedListCustom).value);
    System.out.println(slow_fast_pointer_approach_size(linkedListCustom));


  }

  private static boolean doesItEndWithCycle(LinkedListCustom<Integer> linkedListCustom) {
    HashSet<Node> nodeSet = new HashSet<>();
    Node node = linkedListCustom.peak();
    while(node != null)
    {
      if(nodeSet.contains(node))
      {
        return true;
      }
      else
      {
        nodeSet.add(node);
      }
      node = node.next;
    }
    return false;
  }


  private static void print(LinkedListCustom linkedListCustom, int size)
  {
    Node<Integer> node = linkedListCustom.peak();
    for(int i = 0; i < size; i++)
    {
      System.out.println("value-->"+ node.value + "next-->"+node.next);
      node = node.next;
    }
  }

  private static Node slow_fast_pointer_approach(LinkedListCustom linkedListCustom)
  {
    Node<Integer> fast = linkedListCustom.peak();
    Node<Integer> slow = linkedListCustom.peak();
    boolean cycleFound = false;
    while(fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow)
      {
        cycleFound = true;
        break;
      }


    }
    System.out.println(cycleFound);
    if(cycleFound)
    {
      slow = linkedListCustom.peak();
      while(slow != fast)
      {
        slow = slow.next;
        fast = fast.next;

      }
      return fast;
    }
    else
    return  null;
  }
  private static int slow_fast_pointer_approach_size(LinkedListCustom linkedListCustom)
  {
    Node<Integer> fast = linkedListCustom.peak();
    Node<Integer> slow = linkedListCustom.peak();
    int size=0;
    boolean cycleFound = false;
    while(fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
      if(fast == slow)
      {
        cycleFound = true;
        break;
      }


    }
    System.out.println(cycleFound);
    if(cycleFound)
    {
      fast = fast.next;
      while(slow != fast)
      {
        fast = fast.next;
        size++;
        System.out.println(size);

      }
      return size;
    }
    else
      return  0;
  }
}
