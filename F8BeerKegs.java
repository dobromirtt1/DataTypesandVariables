package DataTypesandVariables;

import java.util.Scanner;

public class F8BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE; //or 0
        String maxModel = "";

        for (int i = 0; i < countKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * height * (radius * radius);

            if (volume > maxVolume) {
                maxVolume = volume;
              maxModel = model;
            }

        }
        System.out.println(maxModel);
    }
}
