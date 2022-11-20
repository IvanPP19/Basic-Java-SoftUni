package Lab;

import java.util.Scanner;

public class WorkingHours_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        boolean isWorkingDay = dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") ||
                dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday") || dayOfWeek.equals("Friday") || dayOfWeek.equals("Saturday");
        boolean isWorkingHour = hour >= 10 && hour <= 18;

        if (isWorkingDay && isWorkingHour) {
            System.out.println("open");
        } else {
            System.out.println("closed");
        }
    }
}
