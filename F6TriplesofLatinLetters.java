package DataTypesandVariables;

import java.util.Scanner;

public class F6TriplesofLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (char i = 'a'; i < 'a' + n; i++) {
               //System.out.println(i);
            for (char j = 'a'; j < 'a' + n; j++) {

                //System.out.println(j);
                for (char k = 'a'; k < 'a' + n; k++) {

                    System.out.printf("%c%c%c%n",i,j,k);

                    
                }
            }
        }
    }
}
