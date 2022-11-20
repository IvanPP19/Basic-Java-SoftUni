package Exercises;

import java.util.Scanner;

public class VacationBooksList_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int totalTime = pages / pagesPerHour;
        int HoursNeeded = totalTime / days;
        System.out.println(HoursNeeded);
    }
}
