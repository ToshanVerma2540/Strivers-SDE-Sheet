public class Solution {
    public static String reverseString(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder reversed = new StringBuilder();
        int i = str.length() - 1;

        while (i >= 0) {
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

        
            for (int k = i + 1; k <= j; k++) {
                reversed.append(str.charAt(k));
            }

            if (i >= 0) {
                reversed.append(' ');
            }
        }

        return reversed.toString();
    }
}
