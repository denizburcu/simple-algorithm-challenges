public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,43));

    }

    public static boolean hasSharedDigit(int number, int numberTwo) {
    if (number < 10 || number > 99 || numberTwo < 10 || numberTwo > 99) {
        return false;
    } else {
        int numberFirstDigit = number % 10;

        int numberSecondDigit = (number / 10) % 10;

        int numberTwoFirstDigit = numberTwo % 10;

        int numberTwoSecondDigit = (numberTwo / 10) % 10;

        if ((numberFirstDigit == numberTwoFirstDigit) || (numberFirstDigit == numberTwoSecondDigit) || (numberSecondDigit ==
                numberTwoFirstDigit) || (numberSecondDigit == numberTwoSecondDigit)) {
            return true;
        } else return false;
    }
}
}
