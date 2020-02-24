package DataStructure.LinkedList;

public class nthElementFromEndEffectiveApproach {

  public static void main(String...s)
  {
    LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();
    linkedListCustom.addLast(1);
    linkedListCustom.addLast(2);
    linkedListCustom.addLast(3);
    linkedListCustom.addLast(4);
    linkedListCustom.addLast(5);
    linkedListCustom.addLast(6);
    linkedListCustom.addLast(7);

    System.out.println("nth element from end-->"+getnthfromend_recursive(linkedListCustom.peak(),4));




  }

  private static Integer getnthfromend(LinkedListCustom<Integer> linkedListCustom, int n) {
    Node<Integer> start = linkedListCustom.peak();
    Node<Integer> temp = linkedListCustom.peak();
    for(int i =1; i<n; i++)
    {
      start = start.next;
    }
    while(start.next != null)
    {
      start = start.next;
      temp = temp.next;
    }

    return temp.value;

  }

  public static int  counter = 0;

  private static Integer getnthfromend_recursive(Node<Integer> head, int n) {
    Node<Integer> start = head;

    if(start != null)
    {
      getnthfromend_recursive(start.next, n);
      counter++;
      if(counter == n)
      {
        return start.value;
      }
    }


    return null;

  }




}
