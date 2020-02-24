package Algorithms.Search;

public class LinearSearch {

  public static void main(String...s)
  {
    int[] in = {1,2,4,5,6,7,8,10};
    System.out.println(OrderedSearch(in,3));
    int[] in1 = {11,2,3,44,5,6,7,88,99,10};
    System.out.println(UnOrderedSearch(in1,9));

  }

  //worst case o(n) avg case o(n/2)
  private static int OrderedSearch(int[] in, int value) {
    for (int i=0; i < in.length; i++)
    {
      System.out.println(i);
      if(in[i] == value)
      {
        return i;
      }
      else if(in[i] > value)
      {
        return -1;
      }
    }
    return -1;
  }

  //work case o(n) avg o(n/2)
  private static int UnOrderedSearch(int[] in, int value) {

    for(int i =0; i < in.length; i++)
    {
      if(in[i] == value)
      {
        return i;
      }
    }
    return -1;
  }



}
