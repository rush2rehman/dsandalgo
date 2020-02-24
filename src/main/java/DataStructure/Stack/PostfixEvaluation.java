package DataStructure.Stack;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class PostfixEvaluation {

  public static void main(String...s)
  {
    String input = "1 22 3 * + 5 -";
    StringTokenizer st = new StringTokenizer(input," ");
    String[] inputArray = new String[st.countTokens()];
    int i = 0;
    while(st.hasMoreTokens())
    {
      inputArray[i] = st.nextToken();
      i++;
    }
    System.out.println(inputArray);
    System.out.println(evaluate(inputArray));
  }

  private static int evaluate(String[] input) {
    int result = 0;
    Stack<String> stack = new Stack();
    //char[] charArr = input.toCharArray();
    for(String token:input)
    {
      if(token.equals("*") || token.equals("+") || token.equals("-") )
      {
        int operand1 = Integer.parseInt(stack.pop());
        int operand2 = Integer.parseInt(stack.pop());
        switch(token) {
          case "+":
            result = operand2+operand1;
            break;
          case "-":
            result = operand2-operand1;
            break;
          case "*":
            result = operand1*operand2;
        }
        stack.push(result+"");
      }
      else
      {
        stack.push(token+"");
      }
    }
    return result;
  }

}
