class Solution {
    public char findTheDifference(String s, String t) {
        char result =0;
        for (char c : s.toCharArray()) {
            //this is the XOR operation
            //java XOR is one of the Bitwise operators available in java
            result ^= c;
        }
        //result now has all chars of s- we will now xor them with chars in t
        for (char c : t.toCharArray()) {
            result ^= c; // XOR all characters in t
        }
        return result; //the remaining character
    }
}
