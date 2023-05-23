package DataTypesandVariables;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float pounds = Float.parseFloat(scanner.nextLine());

        float dollars = pounds * 1.36f;

        System.out.println(String.format("%.3f", dollars));
        //System.out.printf("%.3f", dollars);

        //String result = String.format("%.3f", dollars);
       // System.out.println(result);


    }
}
