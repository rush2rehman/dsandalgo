package DataStructure.LinkedList;

import org.junit.Test;

public class StackTest {

  @Test
  public void stack_test()
  {
    StackUsingLL<String> stack = new StackUsingLL();

    stack.push("A");
    stack.push("B");
    stack.push("C");
    stack.push("D");

    System.out.println("peek-->"+stack.peek());
    stack.pop();
    System.out.println("peek-->"+stack.peek());
    System.out.println(stack.search("A"));


  }



}
