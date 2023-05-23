package DataTypesandVariables;

import java.util.Scanner;

public class F03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

//        int courses = numberOfPeople / 3;
//        int courses1 = numberOfPeople % 3;
//        int all = 1 + courses;
        int courses = 0;
        if (numberOfPeople <= capacity){
            courses = 1;
        }  else if (numberOfPeople % capacity == 0) {
            courses = numberOfPeople / capacity;
        } else {
            courses = (numberOfPeople / capacity) + 1;
        }
        //int courses = (int) Ma

        System.out.println(courses);
    }
}
