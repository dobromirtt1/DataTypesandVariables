package DataTypesandVariables;

import java.util.Scanner;

public class P09CenturiestoMinutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());

    //1 centuries = 100 years = 36524 days = 876581 hours = 52594877 minutes

        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

       // int intDays = (int) days;

        //System.out.printf("%s centuries = %s years = %d days = %s hours = %s minutes", centuries,days, intDays, hours, minutes);

        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries,years, days, hours, minutes);
    }
}
