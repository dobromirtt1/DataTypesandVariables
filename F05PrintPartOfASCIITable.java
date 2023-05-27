package DataTypesandVariables;

import java.util.Scanner;

public class F05PrintPartOfASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int symbol = Integer.parseInt(scanner.nextLine());
        int symbol1 = Integer.parseInt(scanner.nextLine());

        for (int i = symbol; i <= symbol1 ; i++) {
            System.out.print((char) i + " ");

        }
    }
}
