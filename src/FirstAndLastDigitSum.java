public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(10);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int firstDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        return number + firstDigit;
    }
}
