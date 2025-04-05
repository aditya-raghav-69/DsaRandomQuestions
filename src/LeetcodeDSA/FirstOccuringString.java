package LeetcodeDSA;
//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=programming-skills


// class does not have main function create it self

class FirstOccuringString {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return -1;

        int i = 0;
        int lenH = haystack.length();
        int lenN = needle.length();

        while (i < (lenH - lenN + 1)) {

            if (haystack.substring(i, i + lenN).equals(needle))
                return i;

            i++;

        }

        return -1; // for case if the loop comes here
    }


    public static void main(String[] args) {
        FirstOccuringString fs = new FirstOccuringString();

        int res = fs.strStr("leetcode","leeto");
        System.out.println(res);

        System.out.println(fs.strStr("sadbutsad","but"));
    }

}
