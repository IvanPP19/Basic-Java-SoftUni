package Exercises;

import java.util.Scanner;

public class Repainting_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantityNylon = Integer.parseInt(scanner.nextLine());
        int quantityPaint = Integer.parseInt(scanner.nextLine());
        int quantityDiluent = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double sumNylon = (quantityNylon + 2) * 1.50;
        double sumPaint = (quantityPaint + 0.1 * quantityPaint) * 14.50;
        double sumDiluent = quantityDiluent * 5.0;
        double sumBag = 0.40;
        double sumMaterials = sumNylon + sumPaint + sumDiluent + sumBag;
        double sumWorkers = hours * (0.3 * sumMaterials);
        double totalSum = sumMaterials + sumWorkers;
        System.out.println(totalSum);
    }
}
