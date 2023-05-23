package DataTypesandVariables;

import java.util.Scanner;

public class P08LowerorUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char lowerOrUpper = scanner.nextLine().charAt(0);
        
        
        if (Character.isUpperCase(lowerOrUpper)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(lowerOrUpper)) {
            System.out.println("lower-case");
            
        }

//        if (lowerOrUpper >= 'A' && lowerOrUpper <= 'Z' ) {
//            System.out.println("upper-case");
//
//        } else if (lowerOrUpper >= 'a' && lowerOrUpper <= 'z') {
//            System.out.println("lower-case");
//        }
        
    }
}
