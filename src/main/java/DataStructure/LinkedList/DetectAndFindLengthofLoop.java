package DataStructure.LinkedList;

public class DetectAndFindLengthofLoop {

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
    //System.out.println(slow_fast_pointer_approach_size(linkedListCustom));

    detectCycle(linkedListCustom);


  }

  private static void detectCycle(LinkedListCustom<Integer> linkedListCustom) {
    Node slowPointer = linkedListCustom.peak();
    Node fastPointer = linkedListCustom.peak();
    boolean cycleDetected = false;
    while(slowPointer.next != null)
    {
      slowPointer = slowPointer.next;
      if(fastPointer.next.next!=null)
      {
         fastPointer= fastPointer.next.next;
      }
      if(slowPointer == fastPointer)
      {
        System.out.println("cycle detected"+fastPointer.value);
        cycleDetected = true;
        break;
      }
    }
    if(cycleDetected)
    {
      slowPointer = linkedListCustom.peak();
      while(slowPointer!=fastPointer)
      {
        slowPointer = slowPointer.next;
        fastPointer = fastPointer.next;
      }
      System.out.println(slowPointer.value);
    }
  }

}
