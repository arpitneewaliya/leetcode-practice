class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i=0; i<s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            mapS.put(cs, mapS.getOrDefault(cs, 0) + 1);
            mapT.put(ct, mapT.getOrDefault(ct, 0) + 1);
        }

        return mapS.equals(mapT);
    }
}
