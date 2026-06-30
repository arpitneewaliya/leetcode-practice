class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int start=0;
        int end=s.length()-1;
        while (start<end) {
            char a = s.charAt(start);
            char b = s.charAt(end);
            if (Character.isLetterOrDigit(a)) {
                if (Character.isLetterOrDigit(b)) {
                    if (a==b) {
                        start++;
                        end--;
                    } else {
                        return false;
                    }
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }
        return true;
    }
}
