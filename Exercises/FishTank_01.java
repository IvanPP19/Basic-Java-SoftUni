package Exercises;

import java.util.Scanner;

public class FishTank_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int volumeBox = length * width * high;
        double volumeLiters = volumeBox * 0.001;

        double needLiters = volumeLiters * (1 - percent / 100);
        System.out.println(needLiters);
    }
}
