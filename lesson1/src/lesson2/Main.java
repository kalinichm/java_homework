package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Bob", "Smith", 24);
        Student st2 = new Student("Tom", "Joy", 21);
        Student st3 = new Student("Bob", "Smok", 24);
        Student st4 = new Student("Tom", "Dred", 21);
        Student st5 = new Student("Bob", "Scrol", 24);
        Student st6 = new Student("Tom", "Kwert", 21);
        Student st7 = new Student("Bob", "Avan", 24);
        Student st8 = new Student("Tom", "Oliver", 21);
        Student st9 = new Student("Bob", "Lonny", 24);
        Student st10 = new Student("Tom", "Set", 15);
        Student st11 = new Student("Bob", "Oant", 24);


        Group group = new Group();

        group.addStudent(st1);
        group.addStudent(st2);
        group.addStudent(st3);
        group.addStudent(st4);
        group.addStudent(st5);
        group.addStudent(st6);
        group.addStudent(st7);
        group.addStudent(st8);
        group.addStudent(st9);
        group.addStudent(st10);
        group.deleteStudent(st5.getSurname());
        group.deleteStudent(st1.getSurname());
        group.deleteStudent(st4.getSurname());
        group.deleteStudent(st7.getSurname());
        System.out.println(group.toString1());
        System.out.println(group.isDraftees());
       //group.sortBySurname();
        //System.out.println(group.toString1());

    }
}
