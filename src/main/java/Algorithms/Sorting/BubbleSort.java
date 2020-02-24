package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String...s)
  {
    int[] in = {3,7,4,4,5,6,8,1,2,99,76,56,43,90,32};
    bubbleSort(in);
    System.out.println(Arrays.toString(in));
  }

  private static void bubbleSort(int[] in) {
    int length = in.length;
    int tmp;
    boolean swapped = true;
    for(int i = length-1; i >0 && swapped ; i--)
    {
      swapped = false;
      for(int j = 0; j <i; j++ )
      {
        if(in[j] > in[j+1])
        {
          tmp = in[j+1];
          in[j+1] = in[j];
          in[j] = tmp;
          swapped = true;
        }
      }
    }

  }

}
