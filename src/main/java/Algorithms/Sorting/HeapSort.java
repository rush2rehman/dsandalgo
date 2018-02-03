package Algorithms.Sorting;

import DataStructure.Heap.MinBinaryHeap;
import java.util.Arrays;

public class HeapSort {

  public static void main(String...s)
  {
    int[] in = {3,7,4,4,5,6,8,1,2,99,76,56,43,90,32};
    heapSort(in,in.length);
    System.out.println(Arrays.toString(in));

  }

  private static void heapSort(int[] in, int length) {

    MinBinaryHeap heap = new MinBinaryHeap(length);
    heap.addAll(in);
    heap.print();
    for(int i = 0; i < length; i++)
    {
      System.out.println(heap.removeMin());
    }

  }

}
