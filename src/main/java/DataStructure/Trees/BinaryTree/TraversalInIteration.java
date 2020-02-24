package DataStructure.Trees.BinaryTree;

import java.util.Stack;

public class TraversalInIteration {

  public static void main(String...s)
  {
    Node head = prepareInputTree();

    System.out.println("InOrder");
    printInOrder(head);
    System.out.println("\nPostOrder");
    printPostOrder(head);
//    System.out.println("\nLevelOrder");
//    levelOrder(head);
    System.out.println("\nPreOrder");
    printPreOrder(head);


  }

  private static void printPostOrder(Node head) {
    Stack<Node> stack = new Stack<>();
    if(head == null)
    {
      System.out.println("");
      return;
    }
    stack.push(head);
    Node prev = null;
    while(!stack.empty())
    {
      Node currNode = stack.peek();
      if(prev == null|| prev.left == currNode || prev.right == currNode)
      {
        if(currNode.left != null)
        {
          stack.push(currNode.left);
        }
        else if(currNode.right != null)
        {
          stack.push(currNode.right);
        }
      }
      else if(currNode.left == prev)
      {
        if(currNode.right != null)
        {
          stack.push(currNode.right);
        }
      }
      else
      {
        System.out.print(currNode.data+" ");
        stack.pop();
      }
      prev = currNode;


    }


  }

  private static void printInOrder(Node head) {
    Stack<Node> stack = new Stack();
    boolean done = false;
    Node tmp = head;
    while (!done) {
      if (tmp != null) {
        stack.push(tmp);
        tmp = tmp.left;
      } else {

        if (stack.empty()) {
          done = true;
        } else {
          tmp = stack.pop();
          System.out.print(tmp.data+" ");
          tmp= tmp.right;

        }
      }

    }
  }

  private static void printPreOrder(Node head) {
    Stack<Node> stack = new Stack();
      stack.push(head);
    Node node;
    while(!stack.empty())
    {
      node = stack.pop();
      System.out.print(node.data+ " ");
      if(node.right!=null)
      {
        stack.push(node.right);
      }
      if( node.left!=null)
      {
        stack.push(node.left);
      }
    }

  }


  private static Node prepareInputTree() {

    Node node = new Node(4, new Node(6, null, null), new Node(7, null, null));

    node = new Node(2,node, new Node(5, new Node(8, null, null),
        new Node(9, null,null)));
    node = new Node(1, node, new Node(3, new Node(10, null, null),
        new Node(11, null,null)));
    return node;

  }


  static class Node
  {

    public int data;
    public Node left;
    public Node right;

    public Node(int data, Node left, Node right)
    {
      this.data = data;
      this.left = left;
      this.right = right;
    }

  }


}
