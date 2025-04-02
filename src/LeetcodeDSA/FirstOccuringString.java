package LeetcodeDSA;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=programming-skills


class FirstOccuringString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0; // Edge case

        int[] lps = computeLPSArray(needle);
        int i = 0, j = 0;

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if (j == needle.length()) {
                    return i - j; // Match found
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return -1; // No match found
    }

    private int[] computeLPSArray(String needle) {
        int[] lps = new int[needle.length()];
        int length = 0; // Length of the previous longest prefix suffix
        int i = 1;

        while (i < needle.length()) {
            if (needle.charAt(i) == needle.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
