class Solution {
    public boolean isPalindrome(String s) {
        s=s.toUpperCase().replaceAll("[^a-zA-Z0-9]", "");
        //declaring two pointers
        int left = 0; //start of string
        int right = s.length() - 1; //end of string
        //this ensures they dont cross each other
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true;
    }
}