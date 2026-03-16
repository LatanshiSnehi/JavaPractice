public class TwoPointer {
public static boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) return false;

    int[] freq = new int[26];

    // increase for s
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        freq[ch - 'a']++;
    }

    // decrease for t
    for (int i = 0; i < t.length(); i++) {
        char ch = t.charAt(i);
        freq[ch - 'a']--;
    }

    // check all zero
    for (int count : freq) {
        if (count != 0) return false;
    }

    return true;
}


     public static void main(String[] args){
        System.out.println(isAnagram("anagram","margana"));
     }
    
}
