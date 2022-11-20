package Exam;

import java.util.Scanner;

public class Spaceship_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirochina = Double.parseDouble(scanner.nextLine());
        double daljina = Double.parseDouble(scanner.nextLine());
        double visochina = Double.parseDouble(scanner.nextLine());
        double srednaVisochina = Double.parseDouble(scanner.nextLine());

        double obem = shirochina * daljina * visochina;
        double staia = (srednaVisochina + 0.40) * 2 * 2;
        double miasto = Math.floor(obem / staia);

        if (miasto < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (miasto <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", miasto);
        }else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
