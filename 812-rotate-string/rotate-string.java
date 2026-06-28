class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.equals(goal)) return true;
        int i=0;
        while(!s.equals(goal) && i<s.length()) {
            s = s.substring(1) + s.charAt(0);
            if (s.equals(goal)) return true;
            i++;
        }
        return false;
    }
}
