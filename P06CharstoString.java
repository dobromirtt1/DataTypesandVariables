package DataTypesandVariables;

import java.util.Scanner;

public class P06CharstoString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char n1 = scanner.nextLine().charAt(0);
        char n2 = scanner.nextLine().charAt(0);
        char n3 = scanner.nextLine().charAt(0);

        System.out.printf("%s%s%s", n1, n2, n3);
    }
}
