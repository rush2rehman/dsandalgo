package Algorithms.Sorting;

import java.util.Arrays;

public class QuickSort {

  public static void main(String...s)
  {
    int[] in = {9,8,6,10,11,45,54,43,21,2,1,0};
    quickSort(in, 0, 11);
    System.out.println(Arrays.toString(in));
  }

  private static void quickSort(int[] in, int low, int high) {
    int pivot;
    if(high > low)
    {
      System.out.println(Arrays.toString(in));
      pivot = partition(in,low, high);
      quickSort(in,low,pivot-1);
      quickSort(in,pivot+1,high);

    }
  }

  private static int partition(int[] in, int low, int high) {
    int left = low;
    int right = high;
    int pivot = in[high];
    int i = low -1;
    for(int j =low; j <= high-1; j++)
    {
      if(in[j] < pivot)
      {
        i++;
        swap(in, j, i);

      }

    }
    swap(in,i+1,right);
    return i+1;
  }

  private static void swap(int[] in, int j, int i) {
    int temp = in[i];
    in[i] = in[j];
    in[j] = temp;
  }


}
