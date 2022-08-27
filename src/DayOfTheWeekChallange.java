public class DayOfTheWeekChallange {
    public static void main(String[] args) {
        printOfTheWeek(9);

    }

    public static void printOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid day");
                break;
        }
    }
}