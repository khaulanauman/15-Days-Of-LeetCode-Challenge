class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                //agar integer 9 se chota hai to 1 add krne se it wont change into a two digit number
                digits[i]++;
                //return because no more change in array is needed sirf akhri number hi increment hona
                return digits;
            }
            //if digit is greater than 9 then 10 band jaye ga and that 1 is carried to the right
            digits[i] = 0;
        }
        
        //special case if we have all 9's matlab loop has ended wihtout giving us the solution
        //create a ew array because size has increased
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
