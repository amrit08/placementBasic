import java.util.List;
import java.util.Stack;

public class ValidateParenthesis
{
    public static void main(String[] args)
    {
        String s = "(]";
        boolean b = validateParenthesis(s);
        System.out.println(b);

    }
     static boolean validateParenthesis(String s)
     {
         Stack<Character> st = new Stack<>();
         for (int i=0;i<s.length();i++)
         {
             Character c = s.charAt(i);
             if (c == ')')
             {
                 if (st.peek() == '(')
                 {
                     st.pop();
                 }
                 else
                     return false;

             } else if ( c == ']')
             {
                 if (st.peek() == '[')
                 {
                     st.pop();
                 }
                 else
                     return false;
             }
             else if (c == '}')
             {
                 if (st.peek() == '{')
                 {
                     st.pop();
                 }
                 else
                     return false;

             }
             else {
                 st.push(c);
             }
         }
         return st.isEmpty();
     }
}
