package Algorithms.Search;

public class BinarySearch {

  public static void main(String...s)
  {
    int[] in = {1,2,3,4,5,6,7,8,10,11,15,22};
    System.out.println(binarySearch(in,2));
    System.out.println(binarySearchRecursive(in,0,in.length,15));

  }
  //avg and worst case o(logn) - if ordered
  private static int binarySearch(int[] in, int value) {
    int low = 0;
    int high = in.length;
    int mid = 0;
    while(low <= high)
    {
      mid = (high+low)/2;
      if(in[mid] == value)
      {
        return mid;
      }
      else if(in[mid] > value)
      {
        high = mid-1;
      }
      else if(in[mid] < value)
      {
        low = mid+1;
      }

    }
    return -1;
  }

  //
  private static int binarySearchRecursive(int[] in,int low, int high, int value)
  {
    int mid = 0;
    if(low <= high)
    {
      mid = (high+low)/2;
      if(in[mid] == value)
      {
        return mid;
      }
      else if(in[mid] > value)
      {

        return binarySearchRecursive(in,low,mid+1,value);
      }
      else if(in[mid] < value)
      {
        return binarySearchRecursive(in,mid-1,high,value);
      }

    }
    return -1;
  }

}
