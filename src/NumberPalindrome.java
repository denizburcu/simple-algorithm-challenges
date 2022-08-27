public class NumberPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int tempNumber = number;
        while (number != 0) {
            int firstDigit = number % 10;
            reverse *= 10;
            reverse += firstDigit;
            number /= 10;
        }
        if (tempNumber == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
