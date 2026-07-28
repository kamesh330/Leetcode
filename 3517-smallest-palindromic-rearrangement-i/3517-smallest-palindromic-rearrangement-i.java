class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new TreeMap<>();
        for (char i : s.toCharArray())     map.put(i, map.getOrDefault(i, 0) + 1);
        char[] arr = new char[s.length()];
        int idx = 0, n = s.length() - 1, count = 0, oddcount = 0;
        char oddvalue = 'a';
        Map<Character, Integer> list = new TreeMap<>();
       for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            count = 0;
            while (count < (pair.getValue() / 2)) {
                arr[idx] = pair.getKey();
                arr[n - idx] = pair.getKey();
                idx++;
                count++;
            }
            if (pair.getValue() % 2 == 1) {
                arr[n/2]=pair.getKey();
            }
        }       
        return String.valueOf(arr);

    }
}