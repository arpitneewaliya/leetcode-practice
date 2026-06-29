class Solution {
    public String largestOddNumber(String num) {
        int index = -1;
        for (int i = num.length() - 1; i>=0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit%2 != 0) {
                index = i;
                break;
            }
        }

        if (index == -1) return "";
        int i = 0;
        while(i <= index && num.charAt(i) == '0') i++;

        return num.substring(i, index + 1);
    }
}