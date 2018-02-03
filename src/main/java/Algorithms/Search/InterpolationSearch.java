package Algorithms.Search;

public class InterpolationSearch {
  public static void main(String...s)
  {
    int[] in = {1,2,3,4,5,6,7,8,10,11,15,22};
    System.out.println(interpolationSearch(in,22));

  }
//avg o(log(logn) worst case o(n) -- works best when input is ordered and uniformly distributed
  private static int interpolationSearch(int[] in, int value) {
    int low = 0;
    int high = in.length-1;
    int mid = 0;
    while(in[low] <= value && in[high] >= value)
    {
      mid = low+ (value-in[low])/(in[high]-in[low])*(high-low);
      if(in[mid] == value)
      {
        return mid;
      }
      else if(in[mid] > value)
      {
        high = mid-1;
      }
      else
      {
        low = mid+1;
      }
    }
    return -1;
  }

}
