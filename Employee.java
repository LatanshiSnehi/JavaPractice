public class Employee {
    public static String employee(String s){
        int n = s.length();
        char[] newc = new char[n];
        char[] c = s.toCharArray();
        int j =0;
        for(int i = s.length()-1; i > 0; i--){
            newc[j] = c[i];
            j++;
        }

        String ss = new String(newc);
        return ss;
    }

    public static void main(String[] args) {
        System.out.println(employee("abcdxz"));
    }
}

