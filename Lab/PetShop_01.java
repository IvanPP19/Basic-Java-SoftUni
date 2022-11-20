package Lab;

import java.util.Scanner;

public class PetShop_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());
        double totalPrizeDogs = dogs * 2.50;
        double totalPrizeCats = cats * 4;
        System.out.println(totalPrizeDogs + totalPrizeCats + " " + "lv.");
    }
}
