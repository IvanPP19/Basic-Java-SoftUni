package Lab;

import java.util.Scanner;

public class Graduation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        boolean isExcuded = false;
        int year = 1;
        int poorGrades = 0;
        double sumAllGrades = 0;
        while (year <= 12) {
            if (poorGrades > 1) {
                isExcuded = true;
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 4) {
                poorGrades++;
                continue;
            }

            sumAllGrades += grade;
            year++;
        }
        if (isExcuded) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double avgGrade = sumAllGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}
