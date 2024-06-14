import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Polindrome_Number_9Test {

    @Test
    void isPalindrome1() {

        int x = 121;

        boolean palindrome = Polindrome_Number_9.isPalindrome(x);

        Assertions.assertTrue(palindrome);

    }

    @Test
    void isPalindrome2() {
        int x = -121;

        boolean palindrome = Polindrome_Number_9.isPalindrome(x);

        Assertions.assertFalse(palindrome);
    }


    @Test
    void isPalindrome3() {
        int x = 10;

        boolean palindrome = Polindrome_Number_9.isPalindrome(x);

        Assertions.assertFalse(palindrome);
    }

    @Test
    void isPalindrome4() {

        int x = 121;

        boolean palindrome = Polindrome_Number_9.isPalindromeSecond(x);

        Assertions.assertTrue(palindrome);

    }

    @Test
    void isPalindrome5() {
        int x = -121;

        boolean palindrome = Polindrome_Number_9.isPalindromeSecond(x);

        Assertions.assertFalse(palindrome);
    }


    @Test
    void isPalindrome6() {
        int x = 10;

        boolean palindrome = Polindrome_Number_9.isPalindromeSecond(x);

        Assertions.assertFalse(palindrome);
    }
}