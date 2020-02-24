package DataStructure.recursionwtf;

import DataStructure.LinkedList.LinkedListCustom;
import DataStructure.LinkedList.Node;

public class LinkedListLength {

  public static void main(String...s)
  {
    LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();
    linkedListCustom.addLast(1);
    linkedListCustom.addLast(2);linkedListCustom.addLast(1);
    linkedListCustom.addLast(3);


    System.out.println(size(linkedListCustom.peak()));
  }

  private static int size(Node node) {

    if(node==null)
    {
      return 0;
    }
    else
    {
      return 1+size(node.next);
    }
  }

}
