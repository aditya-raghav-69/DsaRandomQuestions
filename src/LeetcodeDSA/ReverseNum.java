package LeetcodeDSA;

public class ReverseNum {


        public int reverse(int x) {

            long max = Integer.MAX_VALUE;
            long min = Integer.MIN_VALUE;

            int rev = 0;

            while (x != 0) {
                int rm = x % 10;
                x /= 10;

                // Check for overflow before updating rev
                if ((rev > max / 10) &&  (rev == max / 10 && rm > 7)) {
                    return 0; // Overflow
                }

                if ((rev < min / 10 ) && (rev == min / 10 && rm < -8)) {
                    return 0; // Underflow
                }

                rev = rev * 10 + rm;
            }
            return rev;

        }

    public static void main(String[] args) {
        ReverseNum obj1 = new ReverseNum();

        int r = obj1.reverse(12345);
        System.out.println(r);



    }
    }
