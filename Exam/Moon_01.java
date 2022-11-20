package Exam;

import java.util.Scanner;

public class Moon_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avgSpeed = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());

        double totalKm = 384400 * 2;
        double totalTime = Math.ceil(totalKm / avgSpeed);
        double totalTime1 = totalTime + 3;
        double totalFuel = (fuel * totalKm) / 100;

        System.out.printf("%.0f%n", totalTime1);
        System.out.printf("%.0f%n", totalFuel);
    }
}
