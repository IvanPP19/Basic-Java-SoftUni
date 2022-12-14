package Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());
        double ivanTime = distance * secPerMeter;
        double resistence = Math.floor(distance / 15) * 12.5;
        ivanTime = ivanTime + resistence;
        if (ivanTime < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", ivanTime - worldRecord);
        }
    }
}
