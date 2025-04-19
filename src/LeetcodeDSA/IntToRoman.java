package LeetcodeDSA;

//https://leetcode.com/problems/integer-to-roman/description/
//it is another easy yet important problem to build logic of string
class IntToRoman {

    // Helper function to get Roman numeral for a specific value
    static String getRoman(int num) {
        switch (num) {
            case 1000: return "M";
            case 900: return "CM";
            case 500: return "D";
            case 400: return "CD";
            case 100: return "C";
            case 90: return "XC";
            case 50: return "L";
            case 40: return "XL";
            case 10: return "X";
            case 9: return "IX";
            case 5: return "V";
            case 4: return "IV";
            case 1: return "I";
            default: return "";
        }
    }

    public String intToRoman(int num) {
        StringBuilder roman = new StringBuilder();
        
        // Process the number with each Roman numeral
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        // Loop through each Roman numeral value and append corresponding characters
        for (int value : values) {
            while (num >= value) {
                roman.append(getRoman(value));
                num -= value;  // Subtract the value from the number
            }
        }
        
        return roman.toString();
    }


    public static void main(String[] args) {
        IntToRoman obj = new IntToRoman();

        int n = 550;

        String s = obj.intToRoman(n);
        System.out.println(s);
    }
}
