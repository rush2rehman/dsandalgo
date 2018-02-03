package memorymgmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HeapIssue {

  public static void main(String...s)
  {
    HashMap<String, String> hm = new HashMap<>();
    Integer s1 = testMethodGeneric(new Integer(10));
    System.out.println(s1);

    List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    System.out.println(al.stream().filter(x->(x==1 || x==2)).count());
  }

  public static <K> K testMethodGeneric(K value)
  {
    K k = value;
    return k;
  }


}
