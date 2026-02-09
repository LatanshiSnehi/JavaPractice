import java.util.HashSet;

public class LongestSubstring {

    public static String longestSubstring(String s) {

        int left = 0;
        int maxLength = 0;
        int startIndex = 0;   // to remember where best substring starts

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);

            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb")); // abc
    }
}
