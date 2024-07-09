package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SmartKeyPad
{
    public static void main(String[] args)
    {
        String input = "23";
        System.out.println(smartKeypad(input));
    }

    static ArrayList<String> smartKeypad(String input)
    {
        String map[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        ArrayList<String> ans = new ArrayList<>();
        smartKeyPadHelper(input,map,0,ans,"");
        return ans;
    }

    static void smartKeyPadHelper(String input,String map[],
                                  int index,ArrayList<String> ans,String cur)
    {
        if (index == input.length())
        {
            ans.add(cur);
            return;
        }
        int keypadNumber = input.charAt(index)-'0';
        String keypadString = map[keypadNumber];

        for (int i = 0;i<keypadString.length();i++)
        {
            //without back tracking
//            smartKeyPadHelper(input,map,index+1,
//                    ans,cur+keypadString.charAt(i));

            // backtracking
            cur = cur+keypadString.charAt(i);
            smartKeyPadHelper(input,map,index+1,
                    ans,cur);
           cur= cur.substring(0,cur.length()-1); // backtracking

        }
    }
}
