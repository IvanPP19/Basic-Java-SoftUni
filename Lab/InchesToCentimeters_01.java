package Lab;

import java.util.Scanner;

public class InchesToCentimeters_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeter = inches * 2.54;
        System.out.println(centimeter);
    }
}
