public class Solution {

    public static int zAlgorithm(String s, String p, int n, int m) {
        if (m > n) {
            return 0; // Pattern length is greater than string length, no occurrences possible
        }

        StringBuilder sb = new StringBuilder();
        sb.append(p);
        sb.append("$");
        sb.append(s);

        String str = sb.toString();

        int[] zArray = calculateZArray(str);
        int count = 0;
        for (int i = m + 1; i < zArray.length; i++) {
            if (zArray[i] == m) {
                count++;
            }
        }

        return count;
    }

    private static int[] calculateZArray(String str) {
        int n = str.length();
        int[] zArray = new int[n];
        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {
            if (i > right) {
                left = right = i;
                while (right < n && str.charAt(right - left) == str.charAt(right)) {
                    right++;
                }
                zArray[i] = right - left;
                right--;
            } else {
                int k = i - left;
                if (zArray[k] < right - i + 1) {
                    zArray[i] = zArray[k];
                } else {
                    left = i;
                    while (right < n && str.charAt(right - left) == str.charAt(right)) {
                        right++;
                    }
                    zArray[i] = right - left;
                    right--;
                }
            }
        }

        return zArray;
    }
}
