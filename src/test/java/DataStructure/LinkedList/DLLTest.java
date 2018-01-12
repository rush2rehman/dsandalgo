package DataStructure.LinkedList;

import org.junit.Test;

public class DLLTest {

  @Test
  public void createDLL()
  {
    DLL<String> dll = new DLL();
    print(dll);
    dll.addLast("E");
    print(dll);
    dll.addFirst("A");
    print(dll);
    dll.addLast("F");
    print(dll);
    dll.addFirst("B");
    print(dll);
    dll.addLast("G");
    print(dll);
    dll.addFirst("C");
    print(dll);
    dll.addLast("D");
    print(dll);
    dll.removeFirst();
    print(dll);
    dll.removeFirst();
    print(dll);
    dll.removeFirst();
    print(dll);
    dll.removeFirst();
    print(dll);
    dll.removeFirst();
    print(dll);
    dll.removeFirst();
    print(dll);
    dll.removeFirst();
    print(dll);

  }

  private void print(DLL dll)
  {
    System.out.println(dll.toString());
    System.out.println(dll.getLength());
  }



}
