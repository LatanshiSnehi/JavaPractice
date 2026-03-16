public class Day14 {

    public static String removeDuplicates(String str) {

        char[] c = str.toCharArray();
        String result = "";

        for (int i = 0; i < c.length; i++) {

            boolean seen = false;

            // check if c[i] appeared before
            for (int j = 0; j < i; j++) {

                // fill this condition
                if (c[i] == c[j]) {
                    seen = true;
                    break;
                }
            }

            // if not seen, add to result
            if (!seen) {
                result = result + c[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("banana")); // ban
        System.out.println(removeDuplicates("aaaaa")); // abc
    }
}
