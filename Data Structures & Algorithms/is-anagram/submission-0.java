class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                int val = map.get(c);
                map.replace(c, ++val);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : t.toCharArray()) {
            int val = map.getOrDefault(c, 0);

            --val;
            if (val < 0) {
                return false;
            } else if (val == 0) {
                map.remove(c);
            } else {
                map.replace(c, val);
            }
        }

        return map.size() == 0;
    }
}
