package lesson2;

import java.util.Scanner;

public class World {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer years = null;
        String name = null;

        do {
            try {
                years = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            }
        }
        while (years == null);
        do {
            try {

                name = scanner.nextLine();
            } catch (NumberFormatException e) {
            }
        }
        while (name == null || name.trim() == "");
        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }



}
