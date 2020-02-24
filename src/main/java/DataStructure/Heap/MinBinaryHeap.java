package DataStructure.Heap;

import java.util.Arrays;
import java.util.Vector;

public class MinBinaryHeap {

  private Vector<Integer> elements;

  public MinBinaryHeap(int size)
  {
    elements = new Vector<Integer>(size);

  }

  public void add(int value)
  {
    elements.add(value);
    heapifyUp(elements.size()-1);
  }

  public int removeMin()
  {
    int root = 0;
    if(elements.size() ==0)
    {
      return -1;
    }
    else
    {
      root = elements.firstElement();
      int lastElement = elements.lastElement();
      elements.setElementAt(lastElement,0);
      elements.remove(elements.size()-1);
      heapifyDown(0);
    }
    return root;
  }

  private void heapifyDown(int index) {
    int right = getRight(index);
    int left = getLeft(index);
    int smallest = index;

    if(left < elements.size() && elements.get(left) < elements.get(smallest))
    {
      smallest = left;
    }
    if(right < elements.size() && elements.get(right) < elements.get(smallest))
    {
      smallest = right;
    }

    if(smallest != index)
    {
      swap(smallest,index);
      heapifyDown(smallest);
    }

  }

  private int getLeft(int index) {
    return (2*index)+1;
  }

  private int getRight(int index) {
    return (2*index)+2;
  }

  private void heapifyUp(int index) {

      int value = elements.get(index);
      int parentIndex = getParent(index);
      int parentValue = elements.get(parentIndex);
      System.out.println(parentValue);
      if(index>0 && parentValue > value)
      {
        swap(index, parentIndex);
        heapifyUp(parentIndex);
      }


  }

  private void swap(int index, int parent) {
    Integer temp = elements.get(parent);
    elements.setElementAt(elements.get(index),parent);
    elements.setElementAt(temp,index);
  }

  private int getParent(int index) {
    if(index ==0)
      return 0;
    return (index-1)/2;
  }

  public void print()
  {
    Integer[] intArr = new Integer[elements.size()];
    elements.toArray(intArr);
    System.out.println(Arrays.toString(intArr));
  }


  public static void main(String...s)
  {
    MinBinaryHeap minBinaryHeap = new MinBinaryHeap(10);
    minBinaryHeap.add(30);
    minBinaryHeap.add(20);
    minBinaryHeap.add(3);
    minBinaryHeap.add(2);
    minBinaryHeap.add(1);
    minBinaryHeap.add(22);
    minBinaryHeap.add(33);
    minBinaryHeap.add(44);

    minBinaryHeap.print();
    minBinaryHeap.removeMin();
    minBinaryHeap.print();
  }


  public void addAll(int[] in) {
    for(int i = 0; i < in.length; i++)
    {
      this.elements.add(in[i]);
    }
    int length = in.length;
    for(int j = (length-1)/2;j>=0;j--)
    {
      heapifyDown(j);
    }


  }
}
