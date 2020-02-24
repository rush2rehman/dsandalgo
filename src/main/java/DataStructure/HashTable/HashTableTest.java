package DataStructure.HashTable;

public class HashTableTest {

  public static void main(String...s)
  {
    HashTableImpl<String, String> ht = new HashTableImpl();
    ht.put("1","one");
    ht.put("2","one");
    ht.put("59","two");
    ht.put("71","two");
    ht.put("72","three");
    ht.put("73","three");
    ht.put("74","three");
    ht.put("75","three");
    ht.put("76","three");
    System.out.println(ht.toString());
    System.out.println(ht.get("76"));
    System.out.println(ht.get("1"));
    System.out.println(ht.get("2"));
    System.out.println(ht.get("59"));
    System.out.println(ht.get("71"));
    System.out.println(ht.get("72"));
    System.out.println(ht.get("73"));
    System.out.println(ht.get("76"));
  }

}
