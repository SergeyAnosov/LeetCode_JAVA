public class Polindrome_Number_9 {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String string = new StringBuilder(s).reverse().toString();

        return s.equals(string);
    }

    public static boolean isPalindromeSecond(int x) {
        int copy = x;
        int reverse = 0;

        if (x < 0) {
            return false;
        }

        if (x % 10 == 0 && x != 0) {
            return false;
        }

        while (copy != 0) {
            reverse = reverse * 10 + copy % 10;
            copy = copy / 10;

        }
        return x == reverse;
    }


}
