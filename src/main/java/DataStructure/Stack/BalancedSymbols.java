package DataStructure.Stack;

import java.util.Stack;

public class BalancedSymbols {



  public static void main(String...s)
  {
    String input = "()(([{}])";
    System.out.println(isBalanced(input));
  }

  private static boolean isBalanced(String input) {

    Stack<Character> stack = new Stack();

    char[] charArray = input.toCharArray();
    if(charArray.length%2 !=0)
    {
      return false;
    }
    else
    {
      for(int i =0; i < charArray.length;i++)
      {
        if(charArray[i] == ')')
        {
          if(!stack.empty() && stack.peek() == '(')
          {
            stack.pop();
          }
          else
          {
            return false;
          }

        }
        else if(charArray[i] == ']')
        {
          if(!stack.empty() && stack.peek() == '[')
          {
            stack.pop();
          }
          else
          {
            return false;
          }

        }
        else if(charArray[i] == '}')
        {
          if(!stack.empty() && stack.peek() == '{')
          {
            stack.pop();
          }
          else
          {
            return false;
          }

        }
        else
        {
          stack.push(charArray[i]);
        }
      }
    }
    if(stack.empty())
    {
      return true;
    }
    else {

      return false;
    }
  }

}
