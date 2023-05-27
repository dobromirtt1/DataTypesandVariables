package DataTypesandVariables;

import java.util.Scanner;

public class F09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int source = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int totalAmmountSpices = 0;
        while (source >= 100) {
            int spices = source - 26;
            totalAmmountSpices += spices;
            days++;
            source -= 10;
        }

        System.out.println(days);

        if (totalAmmountSpices >= 26) {
            totalAmmountSpices -= 26;

        }
        System.out.println(totalAmmountSpices);

    }
}
