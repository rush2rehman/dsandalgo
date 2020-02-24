package Algorithms.Sorting;

import java.util.Arrays;


public class InsertionSort {

  public static void main(String...s)
  {
    int[] in = {7,3,5,1,0,99,98,2};
    insertionSort(in);
    System.out.println(Arrays.toString(in));
  }

  private static void insertSort(int[] in) {

    int length = in.length;
    int insertLocation = 0;
    int tmp;
    int swapTmp;
    int swaptmp2;
    for(int i = 1; i<length;i++)
    {
      tmp = in[i];
      insertLocation = -1;
      for(int j = i-1; j >= 0; j--)
      {
        if(tmp< in[j])
        {
          insertLocation = j;
        }

      }
      if(insertLocation!=-1)
      {
        swapTmp = in[insertLocation];

        for(int k=insertLocation; k<i; k++)
        {
           swaptmp2 = in[k+1];
          in[k+1] = swapTmp;
          swapTmp = swaptmp2;

        }
        in[insertLocation] = tmp;
      }
    }


  }

  private static void insertionSort(int[] in)
  {
    int i, j, v;
    for(i = 1; i <= in.length-1; i++)
    {
      v = in[i];
      j=i;
      while(j >=1 &&in[j-1] > v )
      {
        in[j] = in[j-1];
        j--;
      }
      in[j] = v;
    }
  }

}
