public class Day14Extra {

    public static boolean isAnagram(String s1, String s2) {

        // Step 1: length check
        if(s1.length() != s2.length()){
            return false;
        }


        // Step 2: create frequency array
        int[] freq = new int[256];

        int count=0;

        // Step 3: loop over s1 and increment
        for(int i =0; i < s1.length(); i++){
            char c = s1.charAt(i);
            freq[c]++;
        }

        // Step 4: loop over s2 and decrement
        for(int i=0; i < s2.length();i++){
            char c = s2.charAt(i);
            freq[c]--;
        }

        // Step 5: check all values are zero

        for(int i =0; i<freq.length ; i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silengt"));
    }
}
