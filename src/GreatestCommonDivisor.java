public class GreatestCommonDivisor {
    public static void main(String[] args) {
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        for (int i = 1; i < first / 2; i++) {
            int bigValue = 1;
            if (first % i == 0) {
                bigValue = i;
            }
            for (int k = 1; k < second / 2; k++) {
                int bigVal = 1;
                if (second % k == 0) {
                    bigVal = k;
                    if (bigValue == bigVal) {
                    }
                }
            }
        }
        return first;
    }
}
