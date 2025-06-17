package basics;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = {1, 3, 5, 7, 9};
        int[] anotherArray = new int[5];
        String[] gender = {"Male", "Female"};

        for (int i = 0; i < anotherArray.length; i++) {
            System.out.println("Insert Item at: "+i);
            anotherArray[i] = input.nextInt();
        }

        anotherArray[4] = 17;
        for (int i = 0; i < anotherArray.length; i++) {
            if (anotherArray[i] == 13) {
                System.out.println("found it");
                break;
            }
            System.out.println("item at: "+i+ " is "+anotherArray[i]);
        }

        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        System.out.println(sum);
    }
}
