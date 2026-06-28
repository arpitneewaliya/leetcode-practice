class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        String[] words = s.split("\\s+");
        Collections.reverse(Arrays.asList(words));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++) {
            sb.append(words[i]);
            if (i < words.length-1)
                sb.append(" ");
        }
        return sb.toString();
    }
}
