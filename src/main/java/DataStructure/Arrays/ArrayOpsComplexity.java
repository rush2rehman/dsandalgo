package DataStructure.Arrays;


public class ArrayOpsComplexity {

static long startTime;
static long endTime;
  public static void main(String...s)
  {
   /* insert(generateArray(10),3, 200);
    insert(generateArray(100),3, 200);
    insert(generateArray(1000),3, 200);
    insert(generateArray(10000),3, 200);
    insert(generateArray(100000),3, 200);
    insert(generateArray(1000000),3, 200);

    delete(generateArray(10),3);
    delete(generateArray(100),3);
    delete(generateArray(1000),3);
    delete(generateArray(10000),3);
    delete(generateArray(100000),3);
    delete(generateArray(1000000),3);*/

    search(generateArray(10),106);
    search(generateArray(100),106);
    search(generateArray(1000),106);
    search(generateArray(10000),106);
    search(generateArray(100000),106);



  }

  public static int[] generateArray(int size)
  {
    int[] iArray = new int[size];
    for (int i = 0; i<size; i++)
    {
      iArray[i] =(int)(Math.random() * 1000)+10;
    }

    return iArray;
  }


  //Array Insertion
  //O(n)
  public static void insert(int[] a, int index, int value)
  {
    startTime = System.currentTimeMillis();
    int[] newArray = new int[a.length+1];
    int i = 0;
    while(i<a.length+1)
    {
      if(i < index-1) {
        newArray[i] = a[i];
      }
      else if(i == index-1){
        newArray[i] = value;
      }
      else if(i > index-1)
      {
        newArray[i] = a[i-1];
      }
      i++;
    }
    endTime = System.currentTimeMillis();
    System.out.println("For array of size "+a.length+" Insert Took " + (endTime - startTime));

    return;
  }

  //Array deletion
  //o(n)
  public static void delete(int[] a, int index)
  {
    startTime = System.currentTimeMillis();
    int[] newArray = new int[a.length-1];
    int i = 0;
    while(i<a.length)
    {
      if(i < index-1) {
        newArray[i] = a[i];
      }
      else if(i > index-1)
      {

        newArray[i-1] = a[i];
      }
      i++;
    }
    endTime = System.currentTimeMillis();
    System.out.println("For array of size "+a.length+" deletion Took " + (endTime - startTime));

    return;
  }

  //Array linear search
  //o(n)

  public static void search(int[] a, int value)
  {
    startTime = System.currentTimeMillis();
    int i = 0;
    String searchResult = "";
    while(i<a.length)
    {
      if(a[i] == value)
      {
        searchResult += i+" ";
      }
      i++;
    }
    endTime = System.currentTimeMillis();
    //Arrays.stream(a).forEach(System.out::println);
    System.out.println("search result -->"+searchResult);
    System.out.println("For array of size "+a.length+" search Took " + (endTime - startTime));

    return;

  }


}
