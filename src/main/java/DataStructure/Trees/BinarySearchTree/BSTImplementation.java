package DataStructure.Trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTImplementation {

  private Node head;

  public BSTImplementation(Node head)
  {
    this.head = head;
  }

  public static void main(String...s)
  {
    Node root = new Node(20,null,null);
    BSTImplementation bst = new BSTImplementation(root);
    bst.add(10,root);
    bst.add(8,root);
    bst.add(7,root);
    bst.add(21,root);
    bst.add(16,root);
    bst.add(5,root);
    bst.add(9,root);
    bst.add(11,root);

    //bst.printInOrderIteration(root);
    //System.out.println(bst.search(11,root).data);
    //bst.printPreOrder(root);
    //System.out.println("--");
    //bst.printPreOrderInIteration(root);

    //bst.printPostOrder(root);
    //System.out.println("--\n");
    //bst.printPostOrderInIteration(root);

    bst.printLevelOrder(root);


  }

  private void printPostOrder(Node root) {
    if(root!=null)
    {
      printPostOrder(root.left);
      printPostOrder(root.right);
      System.out.print(root.data+" ");
    }
  }

  private void printPostOrderInIteration(Node root)
  {
    Stack<Node> stack = new Stack();
    Node curr = root;
    stack.push(curr);
    Node prev = null;
    while(!stack.empty())
    {
      curr = stack.peek();
      //if we have reached the node bcause the prev node was null(root) or as a result of traversing
      //previous node
      if(prev==null || prev.left == curr || prev.right == curr)
      {
        //lets process the left node , if left is null process the right
        if(curr.left!=null)
        {
          stack.push(curr.left);
        }
        else if(curr.right!=null)
        {
          stack.push(curr.right);
        }
      }
      else if(curr.left== prev)
      {
        if(curr.right!=null)
        {
          stack.push(curr.right);
        }
      }
      else
      {
        stack.pop();
        System.out.print(curr.data+" ");
      }
      prev = curr;
    }



  }



  private void printInOrderIteration(Node root) {
    Stack<Node> stack = new Stack();
    Node tmp = root;
    boolean done = false;
    while(!done)
    {
      if(tmp!=null)
      {
        stack.push(tmp);
        tmp = tmp.left;
      }
      else{
        if(stack.empty())
        {
          done = true;
        }
        else
        {
          tmp = stack.pop();
          System.out.println(tmp.data);
          tmp = tmp.right;
        }
      }
    }
  }

  private void printPreOrderInIteration(Node root) {
    Stack<Node> stack = new Stack();
    Node tmp;
    if(root!=null)
    stack.push(root);
    while(!stack.empty())
    {
      tmp = stack.pop();
      System.out.println(tmp.data);
      if(tmp.right != null)
      {
        stack.push(tmp.right);

      }
      if(tmp.left!= null)
      {
        stack.push(tmp.left);
      }

    }
  }

  private void printLevelOrder(Node root)
  {
    Queue<Node> queue = new LinkedList();
    Node node = root;
    queue.add(node);
    while(!queue.isEmpty())
    {
        node = queue.poll();
        if (node != null) {
          System.out.print(node.data + " ");
          if (node.left != null) {
            queue.add(node.left);
          }
          if (node.right != null) {
            queue.add(node.right);
          }
        }

    }

  }

  private Node add(int value, Node head) {
    if(head ==null)
    {
      Node node = new Node(value, null, null);
      head = node;
    }
    else if(value < head.data) {

      head.left = add(value,head.left);

    }
    else if(value > head.data ) {
      head.right = add(value, head.right);
    }

    return head;
  }

  private Node search(int value, Node head)
  {
    if(head==null)
    {
      return null;
    }
    else if(value < head.data)
    {
      return search(value, head.left);
    }
    else if(value > head.data)
    {
      return search(value, head.right);
    }
    return head;
  }

  private void printInOrder(Node head) {

    if(head!=null)
    {
      printInOrder(head.left);
      System.out.print(head.data+" ");
      printInOrder(head.right);
    }

  }

  private void printPreOrder(Node root) {
    if (root != null) {
      System.out.print(root.data+" ");
      printPreOrder(root.left);
      printPreOrder(root.right);
    }
  }



  static class Node
  {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right)
    {
      this.data = data;
      this.left = left;
      this.right = right;
    }

  }

  private static Node prepareInputTree() {

    Node node = new Node(1, new Node(0, null, null), null);

    node = new Node(2,node,new Node(4, new Node(3,null,null), null));
    node = new Node(6, node, new Node(8, null,null));
    return node;

  }


}
