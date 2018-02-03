package CoreJava;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

  public static void main(String...s)
  {
    Stream<Integer> stream = Stream.of(1,2,3,4);
    //System.out.println(stream.count());
    //stream.forEach(System.out::println);
    //stream.filter(x->x>2).filter(x->x>3).forEach(System.out::println);
    List<Integer> list = stream.collect(Collectors.toList());
    System.out.println(list.toString());
    list.stream().peek(System.out::println);

    Stream.iterate("a", x->x+"-").limit(10).forEach(System.out::println);
  }

}
