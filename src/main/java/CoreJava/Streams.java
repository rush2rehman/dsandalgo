package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

  public static void main(String...s)
  {
    /*Stream<Integer> stream = Stream.of(1,2,3,4);
    //System.out.println(stream.count());
    //stream.forEach(System.out::println);
    //stream.filter(x->x>2).filter(x->x>3).forEach(System.out::println);
    List<Integer> list = stream.collect(Collectors.toList());
    System.out.println(list.toString());
    list.stream().peek(System.out::println);

    Stream.iterate("a", x->x+"-").limit(10).forEach(System.out::println);

    list.stream().flatMap(x-> {
      ArrayList<Integer> y = new ArrayList<Integer>();
      y.add(x);
      y.add(x+1);
      y.add(x+2);
      return y.stream();
    }).forEach(System.out::println);

    String[] s1 = new String[]{"e,e","r,r","y,y","u,y"};
    Arrays.stream(s1).flatMap(x-> Arrays.stream(x.split(","))).forEach(System.out::print);
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    set.stream().map(x->"replaced").forEach(System.out::print);*/

  streamReduce();

  }


  public static void streamReduce()
  {
    List<Integer> intList = Arrays.asList(1,2,3,4);
    Optional<Integer> result = intList.stream().flatMap(x->Stream.of(x+1,x+2)).
        filter(x->x!=4).reduce((x,y)->x+y);
    System.out.println(result);

    List<Integer> anotherList = Arrays.asList(11,2,3,4,5,6,6,8,9,1);
    anotherList.stream().distinct().peek(x->System.out.print("x --> "+x)).forEach(System.out::print);
    anotherList.stream().sorted().forEach(System.out::print);

    anotherList.parallelStream().forEach(x->{
      System.out.println("thread id-->"+Thread.currentThread().getId()+"  value-->"+x);
     //System.out.println("value-->"+x);

      System.out.println("minimum=="+anotherList.stream().min(Integer::compareTo));
    });



  }







}
