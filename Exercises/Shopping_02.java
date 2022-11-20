package Exercises;

import java.util.Scanner;

public class Shopping_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videocards = Integer.parseInt(scanner.nextLine());
        int procesors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double prizeVideocards = videocards * 250;
        double prizeProcesors = procesors * prizeVideocards * 0.35;
        double prizeRam = ram * prizeVideocards * 0.10;

        double totalPrize = prizeVideocards + prizeProcesors + prizeRam;

        if (videocards > procesors) {
            totalPrize = totalPrize - totalPrize * 0.15;
        }
        if (totalPrize <= budget) {
            System.out.printf("You have %.2f leva left!", budget - totalPrize);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrize - budget);
        }
    }
}
