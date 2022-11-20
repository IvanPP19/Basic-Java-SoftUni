package Exercises;

import java.util.Scanner;

public class BasketballEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax - (tax * 0.40);
        double ekip = shoes - (shoes * 0.20);
        double ball = ekip * 0.25;
        double acsesuari = ball * 0.20;
        double totalPrize = tax + shoes + ekip + ball + acsesuari;
        System.out.println(totalPrize);
    }
}
