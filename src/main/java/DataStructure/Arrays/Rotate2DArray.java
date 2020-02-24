package DataStructure.Arrays;

import java.util.Arrays;

public class Rotate2DArray {

  public static void main(String s[])
  {
    int[][] a = new int[][]{{1,0,3},{3,4,5},{3,2,1}};
    System.out.println(Arrays.deepToString(a).replace("], ", "]\n"));
    System.out.println(Arrays.deepToString(rotateImage(a)).replace("], ", "]\n"));
  }

  static int[][] rotateImage(int[][] a) {
    for(int i=0; i<a.length;i++)
    {
      int temp = 0;
      for(int j=0; j<a[i].length; j++)
      {
        temp = a[i][j];
        a[i][j] = a[i+2][j];
        a[i][j%2] = temp;
        //System.out.println(a[i][j]);
      }
    }
    return a;

  }



}
