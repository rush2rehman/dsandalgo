package others;

import java.util.Arrays;

public class domain {

  public static void main(String[] s)
  {
    String[] strings = {"test.com", "bot.net"};
    System.out.println(Arrays.toString(domainType(strings)));
  }

  static String[] domainType(String[] domains) {
    String[] output = new String[domains.length];
    int count = 0;
    for(String s:domains)
    {
      String rootDomain = s.substring(s.lastIndexOf(".")+1);
      switch(rootDomain) {
        case ("net"):
          output[count] = "network";
          break;
        case ("org"):
          output[count] = "organization";
          break;
        case("com"):
          output[count] = "commercial";
          break;
        case("info"):
          output[count] = "information";
          break;
      }
      count++;
    }

    return output;
  }

}
