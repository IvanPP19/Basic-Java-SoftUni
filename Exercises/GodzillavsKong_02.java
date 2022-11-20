package Exercises;

import java.util.Scanner;

public class GodzillavsKong_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double prize = Double.parseDouble(scanner.nextLine());
        double sumDecor = budget * 0.10;
        double sumClotes = statists * prize;
        if (statists > 150) {
            sumClotes = sumClotes * 0.9;
        }
        double totalSum = sumClotes + sumDecor;
        if (totalSum > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSum - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSum);
        }
    }
}
