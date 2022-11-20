package Exam;

import java.util.Scanner;

public class PastryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cake = scanner.nextLine();
        int numberCakes = Integer.parseInt(scanner.nextLine());
        int dayOfMonth = Integer.parseInt(scanner.nextLine());

        double finalPrize = 0;
        double finalPPrize1 = 0;

        if (cake.equals("Cake")) {
            if (dayOfMonth <= 15) {
                finalPrize = numberCakes * 24;
            } else {
                finalPrize = numberCakes * 28.70;
            }
        }
        if (cake.equals("Souffle")) {
            if (dayOfMonth <= 15) {
                finalPrize = numberCakes * 6.66;
            } else {
                finalPrize = numberCakes * 9.80;
            }
        }
        if (cake.equals("Baklava")) {
            if (dayOfMonth <= 15) {
                finalPrize = numberCakes * 12.60;
            } else {
                finalPrize = numberCakes * 16.98;
            }
        }
        if (dayOfMonth <= 22) {
            if (finalPrize >= 100 && finalPrize <= 200) {
                finalPPrize1 = finalPrize - (finalPrize * 0.15);
            } else if (finalPrize > 200) {
                finalPPrize1 = finalPrize - (finalPrize * 0.25);
            } else if (finalPrize < 100) {
                finalPPrize1 = finalPrize;
            }
        } else {
            finalPPrize1 = finalPrize;
        }
//        if (finalPrize >= 100 && finalPrize <= 200) {
//            finalPPrize1 = finalPrize - (finalPrize * 0.15);
//        } else if (finalPrize > 200) {
//            finalPPrize1 = finalPrize - (finalPrize * 0.25);
//        }
        if (dayOfMonth <= 15) {
            finalPPrize1 = finalPPrize1 - (finalPPrize1 * 0.10);
        }
        System.out.printf("%.2f", finalPPrize1);
    }
}

