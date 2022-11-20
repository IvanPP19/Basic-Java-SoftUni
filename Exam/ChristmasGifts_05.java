package Exam;

import java.util.Scanner;

public class ChristmasGifts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int adults = 0;
        int kids = 0;

        while (!command.equals("Christmas")) {
            int count = Integer.parseInt(command);
            if (count <= 16) {
                kids++;
            } else {
                adults++;
            }
            command = scanner.nextLine();
        }
        int priseToys = kids * 5;
        int priseSweeters = adults * 15;
        System.out.printf("Number of adults: %s%n", adults);
        System.out.printf("Number of kids: %s%n", kids);
        System.out.printf("Money for toys: %s%n", priseToys);
        System.out.printf("Money for sweaters: %s%n", priseSweeters);
    }
}
