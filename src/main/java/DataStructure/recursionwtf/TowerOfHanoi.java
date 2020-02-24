package DataStructure.recursionwtf;

import java.util.Stack;

public class TowerOfHanoi {



  public static void main(String...s)
  {


    moveDiscs(10, 1, 2, 3);


  }

  private static void moveDiscs(int count, int A, int B, int C) {

    if (count > 0) {
      moveDiscs(count-1, A, C, B);
      System.out.println("move from "+ A + " to "+ C);
      moveDiscs(count-1, B, A, C);

    }
  }

}
