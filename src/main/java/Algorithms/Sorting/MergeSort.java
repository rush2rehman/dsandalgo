package Algorithms.Sorting;

import java.util.Arrays;

public class MergeSort {

  public static void main(String...s)
  {
    int[] in = {7,3,5,1,0,99,98,2};
    int[] temp = new int[in.length];
    mergeSort(in,temp,0,in.length-1);
    System.out.println(Arrays.toString(in));
  }

  private static void mergeSort(int[] in, int[] temp, int left, int right) {
    int mid;
    if(right>left)
    {
      mid = (left+right)/2;
      mergeSort(in,temp,left,mid);
      mergeSort(in,temp,mid+1,right);
      merge(in, temp, left,mid+1,right);
    }
  }

  private static void merge(int[] in, int[] temp, int left, int mid, int right) {
    //System.out.println("left-->"+left+"mid-->"+mid+"right-->"+right);

    int i, left_end, size, temp_pos;
    left_end = mid-1;
    temp_pos = left;
    size = right-left+1;

    while((left <= left_end)&&(mid <= right ))
    {
      if(in[left] <= in[mid])
      {
        temp[temp_pos] = in[left];
        temp_pos = temp_pos+1;
        left = left +1;
      }
      else
      {
        temp[temp_pos] = in[mid];
        temp_pos = temp_pos+1;
        mid = mid +1;
      }
    }
    while(left <= left_end)
    {
      temp[temp_pos] = in[left];
      temp_pos = temp_pos+1;
      left = left +1;
    }
    while(mid <= right)
    {
      temp[temp_pos] = in[mid];
      temp_pos = temp_pos+1;
      mid = mid +1;
    }

    for(i=0;i<=size-1;i++)
    {
      //System.out.println(temp.length+" "+right+" "+size);
      in[right] = temp[right];
      right = right-1;
    }

  }

}
