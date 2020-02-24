package DataStructure.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

  public static void main (String...s) throws Exception
  {


    


    System.out.println("\n---------");

    LinkedListCustom<String> lc = new LinkedListCustom<>();
    lc.removeFirst();
    System.out.println(lc.toString());
    lc.add(1,"middle");
    lc.removeFirst();
    System.out.println(lc.toString());
    System.out.println(lc.getSize());
    lc.addFirst("A");
    System.out.println(lc.getSize());
    lc.add(1,"test");
    lc.addLast("first");
    lc.addFirst("A");
    lc.addLast("second");
    System.out.println(lc.toString());
    lc.addLast("last");
    lc.addFirst("A");
    System.out.println(lc.toString());
    System.out.println(lc.peak());
    lc.add(1,"middle");
    System.out.println(lc.toString());
    lc.removeFirst();
    System.out.println(lc.toString());

    System.out.println(lc.nth_element_from_end(5));
    System.out.println(lc.nth_element_from_end(3));


  }

}
