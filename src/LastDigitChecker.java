public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int number, int number2, int number3) {
        if ((number < 10 || number > 1000) || (number2 < 10 || number2 > 1000) || (number3 < 10 || number3 > 1000)) {
            return false;
        } else {
            if ((number % 10 == number2 % 10) || (number % 10 == number3 % 10) || (number2 % 10 == number3 % 10)){
                return true;
            }
            return false;
        }
    }
    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}

