package Exercises;

import java.util.Scanner;

public class FoodDelivery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chiken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());
        double prizeChiken = chiken * 10.35;
        double prizeFish = fish * 12.40;
        double prizeVegan = vegan * 8.15;
        double totalPrizeMenu = prizeChiken + prizeFish + prizeVegan;
        double dessert = 0.2 * totalPrizeMenu;
        double delivery = 2.50;
        Double total = totalPrizeMenu + dessert + delivery;
        System.out.println(total);
    }
}
