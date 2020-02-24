package DataStructure.Trees.BinaryTree;

import DataStructure.LinkedList.LinkedListCustom;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversal {

  public static void main(String...s)
  {
    Node head = prepareInputTree();
    System.out.println("InOrder");
    printInOrder(head);
    System.out.println("\nPreOrder");
    printPreOrder(head);
    System.out.println("\nPostOrder");
    printPostOrder(head);
    System.out.println("\nLevelOrder");
    levelOrder(head);
  }

  private static void levelOrder(Node head) {

    ArrayList<ArrayList<Integer>> dataList = new ArrayList();
    Queue<Node> levelNodeList = new LinkedList<>();

    if(head == null)
    {
      dataList = null;
    }
    else
    {

      ArrayList<Integer> currentLevelList = new ArrayList<>();
      levelNodeList.offer(head);
      levelNodeList.offer(null);
      while(!levelNodeList.isEmpty())
      {
        Node tmp = levelNodeList.poll();
        if(tmp!=null)
        {
          currentLevelList.add(tmp.data);
          if(tmp.left!=null)
          {
            levelNodeList.offer(tmp.left);
          }
          if(tmp.right!=null)
          {
            levelNodeList.offer(tmp.right);
          }
        }
        else
        {
          ArrayList<Integer> copy = new ArrayList<>(currentLevelList);
          dataList.add(copy);
          currentLevelList.clear();
          if(!levelNodeList.isEmpty())
          {
            levelNodeList.offer(null);
          }
        }
      }

    }
    for(ArrayList element:dataList)
    {
      for(Object data:element)
      {
        System.out.print(((Integer)data).intValue()+" ");
      }
    }
    Node tmp;
    while(!levelNodeList.isEmpty())
    {
      tmp = levelNodeList.poll();
      if(tmp!=null)
      System.out.println(tmp.data);
    }

  }

  private static void printPostOrder(Node head) {
    if(head != null)
    {
      printPostOrder(head.left);
      printPostOrder(head.right);
      System.out.print(head.data+ " ");
    }
  }

  private static void printPreOrder(Node head) {
    if(head != null)
    {
      System.out.print(head.data+ " ");
      printPreOrder(head.left);
      printPreOrder(head.right);
    }
  }

  private static void printInOrder(Node head) {

    if(head!=null)
    {
      printInOrder(head.left);
      System.out.print(head.data+" ");
      printInOrder(head.right);
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

