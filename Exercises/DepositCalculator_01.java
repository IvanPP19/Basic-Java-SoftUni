package Exercises;

import java.util.Scanner;

public class DepositCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double. parseDouble(scanner.nextLine());
        int term = Integer. parseInt(scanner.nextLine());
        double percent = Double. parseDouble(scanner.nextLine());

        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double sum = deposit + term * ((deposit * percent / 100) / 12);

        System.out.println(sum);
    }
}
