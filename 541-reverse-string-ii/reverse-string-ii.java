import java.util.*;
class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder newString=new StringBuilder();
        for (int i=0;i<s.length();i+=2*k){
            //making sure we dont exceed the string ki length
            int end = Math.min(i + k, s.length());
            StringBuilder temp = new StringBuilder(s.substring(i, end));
            newString.append(temp.reverse());
            //adding the remainig letters as it is
            if (end < s.length()) {
                //matlab abhi we have letters jinko reverse nahin krna
                int endNext = Math.min(i + 2 * k, s.length());
                //This calculates the index for the end of the current 2k block.
                newString.append(s.substring(end, endNext));
}
           
        }
        return newString.toString();
    }
}