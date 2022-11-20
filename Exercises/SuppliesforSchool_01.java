package Exercises;

import java.util.Scanner;

public class SuppliesforSchool_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paketHimikali = Integer.parseInt(scanner.nextLine());
        int paketMarkeri = Integer.parseInt(scanner.nextLine());
        int pochistvane = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());
        double cenaHimikali = paketHimikali * 5.80;
        double cenaMarkeri = paketMarkeri * 7.20;
        double cenaPreparat = pochistvane * 1.20;
        double cenaTotal = cenaHimikali + cenaMarkeri + cenaPreparat;
        double totalDiscount = discount / 100;
        double cenaSNamalenie = cenaTotal - (cenaTotal * totalDiscount);
        System.out.println(cenaSNamalenie);
    }
}
