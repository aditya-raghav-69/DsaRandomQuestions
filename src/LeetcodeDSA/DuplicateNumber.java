package LeetcodeDSA;

//https://leetcode.com/problems/find-the-duplicate-number/description/
// an easy problem but significant to build the logic of cycling


class DuplicateNumber {
    public int findDuplicate(int[] arr) {
        int n = arr.length;

        int i = 0;
        while (i < n) {
            int correctInd = arr[i]- 1;
            if(arr[i] != i+1){
                if ( arr[i] != arr[correctInd]) {
                int temp = arr[i];
                arr[i] = arr[correctInd];
                arr[correctInd] = temp;
                }else{
                    return arr[i];
                }
            }
             else {
                i++;
            }

           
        }
 return -1;
       
}

    public static void main(String[] args) {
        DuplicateNumber obj = new DuplicateNumber();

        int arr[]= {1,3,4,2,2};
        int num = obj.findDuplicate(arr);
        System.out.println(num);
    }
}
