package DataTypesandVariables;

import java.util.Scanner;

public class P11RefactorVolumeofPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double dul, sh, V = 0;
        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double height = Double.parseDouble(scanner.nextLine());

        double pyramidVolume = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", pyramidVolume);

    }
}
