package LeetcodeDSA;

import java.util.*;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// It is the link of the problem; it is an easy yet important problem

class FindMissingNumber {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        List<Integer> dis = new ArrayList<>();
        int n = arr.length;

        int i = 0;
        while (i < n) {
            int correctInd = arr[i] - 1;
            if (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[correctInd]) {
                // Swap arr[i] with arr[correctInd]
                int temp = arr[i];
                arr[i] = arr[correctInd];
                arr[correctInd] = temp;
            } else {
                i++;
            }
        }

        for (int ind = 0; ind < n; ind++) {
            if (arr[ind] != ind + 1) {
                dis.add(ind + 1);
            }
        }

        return dis;
    }

    public static void main(String[] args) {
        FindMissingNumber obj = new FindMissingNumber();

        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = obj.findDisappearedNumbers(arr);

        System.out.println("Missing numbers: " + result);
    }
}
