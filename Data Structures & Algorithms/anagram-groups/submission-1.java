class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());

        // List<String> list = new ArrayList<>();
        // for (String str : strs) {
        //     char[] arr = new char[] {str.toCharArray()};
        //     int theSum = 0;
        //     for (char ch : arr) {
        //         theSum += (int) ch;
        //     }
        //     map.put(str, theSum);
        // }

        // for(Map.Entry entry : map.entries()){

        //     list.add();
        // }
    }
}
