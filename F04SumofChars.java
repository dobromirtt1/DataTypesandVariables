package DataTypesandVariables;

import java.util.Scanner;

public class F04SumofChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int sum = 0;

//        for (int i = 0; i < numberOfLines ; i++) {
//            char letter = scanner.nextLine().charAt(0);
//            int symbol = Integer.parseInt(letter + "");
//            sum += symbol;
        //}
       // System.out.println(sum);
        for (int i = 0; i < numberOfLines ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int asciiCode =(int) symbol;
            //int asciiCode =symbol;

            sum += asciiCode;
            //sum += symbol;

        }
        System.out.println("The sum equals: " + sum);
    }
}
