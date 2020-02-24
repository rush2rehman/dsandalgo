package DataStructure.recursionwtf;

import DataStructure.LinkedList.LinkedListCustom;
import DataStructure.LinkedList.Node;

public class LLFindNode {

  public static void main(String...s)
  {
    LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();
    linkedListCustom.addLast(1);
    linkedListCustom.addLast(1);
    linkedListCustom.addLast(2);
    linkedListCustom.addLast(1);
    linkedListCustom.addLast(1);


    System.out.println(search(linkedListCustom.peak(),10));
  }

  private static boolean search(Node peak, int value) {
    Node node = peak;
    if(node == null)
    {
      return false;
    }
    else if(node.value.equals(value))
    {
      return true;
    }
    else
      return search(node.next,value);

  }


}
