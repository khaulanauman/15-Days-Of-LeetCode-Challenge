class Solution {
    public int romanToInt(String s) {
        //humen roman numbers diye we
        //har roman letter ki aik numerical value hai
        //usko hum hashmap ke through represent kren gn
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int currentValue = romanValues.get(c);

            //checking for: There are six instances where subtraction is used:
            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            // Update previous value for the next iteration
            prevValue = currentValue;
        }

        return total;
    }
}
