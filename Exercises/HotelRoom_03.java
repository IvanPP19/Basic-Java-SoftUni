package Exercises;

import java.util.Scanner;

public class HotelRoom_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double apartments = 0;
        double studio = 0;

        switch (month) {
            case "May":
            case "October":
                apartments = nights * 65;
                studio = nights * 50;
                if (nights > 14) {
                    studio = studio * 0.7;
                    apartments = apartments * 0.9;
                } else if (nights > 7) {
                    studio = studio * 0.95;
                }
                break;
            case "June":
            case "September":
                apartments = nights * 68.70;
                studio = nights * 75.20;
                if (nights > 14) {
                    studio = studio * 0.80;
                    apartments = apartments * 0.9;
                }
                break;
            case "July":
            case "August":
                apartments = nights * 77;
                studio = nights * 76;
                if (nights>14){
                    apartments = apartments * 0.90;
                }
                break;
        }
        System.out.printf("Apartment: %.2f lv.%n", apartments);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}
