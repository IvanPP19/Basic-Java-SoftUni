package Exercises;

import java.util.Scanner;

public class Moving_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        boolean NoMoreSpace = false;
        int space = wight * lenght * height;
        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);

            space = space - boxes;
            if (space <= 0) {
                NoMoreSpace = true;
                break;
            }
            command = scanner.nextLine();
        }
        if (NoMoreSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(space));
        }else {
            System.out.printf("%d Cubic meters left.", space);
        }
    }
}
