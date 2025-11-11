import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        System.out.println("enter the month in number : ");
        month = scanner.nextInt();
        String season;

        if (month == 11 || month == 12 || month == 1 || month == 2)
            season = "winter";
        else if (month == 3 || month == 4)
            season = "spring";

        else if (month == 5 || month == 6 || month == 7)
            season = "summer";

        else
            season = "unknown";

        System.out.println("this month has " +season+ " season.");

        scanner.close();

    }
}
