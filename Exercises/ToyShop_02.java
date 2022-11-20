package Exercises;

import java.util.Scanner;

public class ToyShop_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrize = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        double totalSum = puzzle * 2.60 + doll * 3.00 + bear * 4.10 + minion * 8.20 + truck * 2;
        int count = bear + puzzle + truck + doll + minion;
        if (count >= 50) {
            totalSum = totalSum - (totalSum * 0.25);
        }
        totalSum = totalSum - (totalSum * 0.10);
        if (totalSum >= totalPrize) {
            System.out.printf("Yes! %.2f lv left.", totalSum - totalPrize);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalSum-totalPrize));
        }
    }
}
