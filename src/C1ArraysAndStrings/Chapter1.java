package C1ArraysAndStrings;

public class Chapter1 {

    //1.1
    public static boolean isUniqueChars2(String str) {
        if (str == null || str.length() == 0) return true;
        boolean[] char_set = new boolean[256];
        for (int i=0; i<str.length(); i++) {
            int val = str.charAt(i); //可以理解成index
            if (char_set[val]) return false;
            char_set[val] = true;
            //先if判断改字母是否已经出现过,再置为true(出现)
        }
        return true;
    }

    //1.2
    public static String reverse(String str) {
        if (str == null || str.length() == 0) return str;
        int n = str.length();
        char[] chars = new char[n];
        for (int i=0; i<n/2; i++) {
            chars[i] = str.charAt(n-2-i); //C-style
            chars[n-2-i] = str.charAt(i);
        }
        chars[n-1] = str.charAt(n-1); // end of the line
        return new String(chars);
    }

    //1.3
    //String2CharArray: char[] chars = str.toCharArray()
    //new String(chars) or String.valueOf(chars) or String.copyValueOf(chars)
    public static String removeDuplicates(char[] str) {
        if (str == null) return null;
        int len = str.length;
        if (len < 2) return new String(str);
        int tail = 1;

        for (int i = 1; i < len; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (str[i] == str[j]) break;
            }
            if (j == tail) {
                str[tail] = str[i];
                ++tail;
            }
        }
//        str[tail] = '\0';
        for (int k=0; k < len; ++k) {
            if (k >= tail) str[k] = '\0';
        }
        return new String(str);
    }
}
