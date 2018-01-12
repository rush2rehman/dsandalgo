package DataStructure.LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

  public static void main (String...s) throws Exception
  {
    LinkedList<String> ll = new LinkedList<>();

    System.out.println("size-->"+ll.size());

    ll.add("first");
    System.out.println(ll.toString());
    ll.add(1, "second");
    System.out.println(ll.toString());

    ll.addAll(Arrays.asList("A","B"));
    System.out.println(ll.toString());
    ll.addFirst("F");
    System.out.println(ll.toString());
    ll.addLast("E");
    System.out.println(ll.toString());
    System.out.println(ll.contains("E"));
    System.out.println(ll.element());
    System.out.println(ll.get(2));
    Iterator iterator = ll.descendingIterator();
    iterator.forEachRemaining(x-> System.out.print(x+" "));
    ll.peek();

    


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

    lc.removeLast();
    System.out.println(lc.toString());



    lc.remove(1);
    System.out.println(lc.toString());
    lc.remove(2);
    System.out.println(lc.toString());
    lc.remove(3);
    System.out.println(lc.toString());
    lc.remove(4);
    System.out.println(lc.toString());


  }

}
