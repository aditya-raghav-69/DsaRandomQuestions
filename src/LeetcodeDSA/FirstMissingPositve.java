package LeetcodeDSA;

//Important problem very very Important
//https://leetcode.com/problems/first-missing-positive/

class FirstMissingPositve {

    // Function to swap elements in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Rearrange elements to their correct positions (x should be at index x-1)
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                swap(arr, i, arr[i] - 1);
            }
        }

        // Step 2: Find the first index where arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // Step 3: If no missing positive, return n + 1
        return n + 1;
    }

    public static void main(String[] args) {
        FirstMissingPositve obj = new FirstMissingPositve();
        System.out.println(obj.firstMissingPositive(new int[]{7,8,9,11,12}));
        System.out.println(obj.firstMissingPositive(new int[]{3,4,-1,1}));
        System.out.println(obj.firstMissingPositive(new int[]{1,2,0}));

    }
}
