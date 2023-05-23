package DataTypesandVariables;

import java.util.Scanner;

public class F7WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int tank = 0;

        for (int i = 0; i < numberOfLines ; i++) {

            int quantities = Integer.parseInt(scanner.nextLine());
            tank +=quantities;
            if (tank > 255) {
                System.out.println("Insufficient capacity!");
                tank -=quantities;
                continue;

            }


        }

        System.out.println(tank);

    }
}
