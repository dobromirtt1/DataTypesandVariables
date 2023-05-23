package DataTypesandVariables;

import java.util.Scanner;

public class F02SumDigitsForString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String numberAsString = "" + number;
        for (int i = 0; i <= numberAsString.length() - 1; i++) {

            char currentSymbol = numberAsString.charAt(i);
            //char --> String --> int
            //'5' -> 5
            int currentDigit = Integer.parseInt(currentSymbol + "");
            sum += currentDigit;

        }

        System.out.println(sum);


    }
}
