package Lab;

import java.util.Scanner;

public class MaxNumber_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxNum = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")){
            int currentNum = Integer.parseInt(input);
            if (currentNum > maxNum){
                maxNum = currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNum);
    }
}
