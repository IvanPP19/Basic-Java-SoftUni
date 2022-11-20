package Lab;

import java.util.Scanner;

public class MinNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNum = Integer.MAX_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int currentNum = Integer.parseInt(input);
            if (currentNum < minNum) {
                minNum = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNum);
    }
}