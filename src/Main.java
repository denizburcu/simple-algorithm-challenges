public class Main {
    public static void main(String[] args) {
        int value = 1;
        if (value ==1){
            System.out.println("value was 1");
        }
        else if (value==2){
            System.out.println("value was 2");
        }
        else {
            System.out.println("value was not 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("value was not 1 or 2");
                break;
        }

        char charValue = 'a';
        switch (charValue){
            case 'a':
                System.out.println("value was a");
                break;
            case 'b':
                System.out.println("value was b");
                break;
            case 'c': case 'd': case'e':
                System.out.println(charValue + " value was found.");
                break;
            default:
                System.out.println("a,b,c,d or e not found");
                break;
        }

        String month = "JunE";
        switch (month.toLowerCase()){
            case "January":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("jun");
                break;
            default:
                System.out.println("not sure");
        }

    }
}