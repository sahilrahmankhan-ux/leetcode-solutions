class Solution {
    public int romanToInt(String s) {

        String roman = "IVXLCDM";
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        int total = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = values[roman.indexOf(s.charAt(i))];

            if (i + 1 < s.length() &&
                curr < values[roman.indexOf(s.charAt(i + 1))]) {
                total -= curr;
            }
            else {
                total += curr;
            }
        }

        return total;
    }
}