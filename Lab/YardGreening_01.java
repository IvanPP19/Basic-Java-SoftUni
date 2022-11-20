package Lab;

import java.util.Scanner;

public class YardGreening_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area = Double.parseDouble(scanner.nextLine());
        double totalPrizeNoDiscount = area * 7.61;
        double discount = totalPrizeNoDiscount * 0.18;
        double totalPrize = totalPrizeNoDiscount - discount;
        System.out.printf("The final price is: %f lv. %n", totalPrize);
        System.out.printf("The discount is: %f lv.", discount);

    }
}
