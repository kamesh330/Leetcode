import java.util.*;

class Solution {
    public String smallestPalindrome(String s) {

        Map<Character, Integer> map = new TreeMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        char[] arr = new char[s.length()];
        int left = 0;
        int right = s.length() - 1;

        Character middle = null;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            int freq = entry.getValue();

            while (freq >= 2) {
                arr[left] = entry.getKey();
                arr[right] = entry.getKey();
                left++;
                right--;
                freq -= 2;
            }

            if (freq == 1) {
                middle = entry.getKey();
            }
        }

        if (middle != null) {
            arr[left] = middle;
        }

        return new String(arr);
    }
}