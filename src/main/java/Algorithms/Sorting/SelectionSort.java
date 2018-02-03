package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {

  public static void main(String...s)
  {
    int[] in = {9,8,6,10,11,45,54,43,21,2,1,0};
    selectionSort(in);
    System.out.println(Arrays.toString(in));
  }

  private static void selectionSort(int[] in) {
    int minIndex;
    int tmp;
    for(int i = 0; i < in.length-1;i++)
    {
      minIndex = i;
      for(int j = i+1; j<in.length;j++)
      {
        if(in[j] < in[minIndex])
        {
          minIndex = j;
        }

      }
      //System.out.println(minIndex);
      //swap
      if(minIndex != i) {
        tmp = in[i];
        in[i] = in[minIndex];
        in[minIndex] = tmp;
      }
    }

  }

}
