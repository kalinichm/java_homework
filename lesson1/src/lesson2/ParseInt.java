package lesson2;

import java.util.Scanner;

public class ParseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer age = null;

        do {
            try {
                System.out.println("enter age");
                age = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {

            }
        }
        while (age == null);
    }
}
