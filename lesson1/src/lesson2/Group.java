package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements ICommissar {
    private final static int GROUP_MAX_SIZE = 10;

    private int size = 0;
    private Student[] group = new Student[GROUP_MAX_SIZE];

    public void deleteStudent(String surname) {
        for (int i = 0; i < GROUP_MAX_SIZE; i++) {
            if (group[i] != null) {
                if (group[i].getSurname() == surname) {
                    group[i] = null;
                    size--;
                    System.out.println("Student was deleted");
                    return;
                }
            }
        }
    }

    public void addStudent(Student studentForAdd) {
        if (size >= GROUP_MAX_SIZE) {
            throw new ArrayIsCrowdedException();
        } else {
            for (int i = 0; i < GROUP_MAX_SIZE; i++) {
                if (group[i] == null) {
                    group[i] = studentForAdd;
                    size++;
                    System.out.println("Student was added");
                    return;
                }
            }
        }
    }

    public Student getStudent(String surname) {
        for (Student student : group) {
            if (student.getSurname() == surname) {
                return student;
            }
        }
        return null;
    }

    private int getAmountOfNull() {
        int amount = 0;
        for (int i = 0; i < GROUP_MAX_SIZE; i++) {
            if (group[i] == null) {
                amount++;
            }
        }
        return amount;
    }


    public void sortBySurname() {
        Arrays.sort(group);
    }

    public String toString() {
        Student[] tempGroup = new Student[GROUP_MAX_SIZE - getAmountOfNull()];
        int k = 0;
        for (int i = 0; i < GROUP_MAX_SIZE; i++) {
            if (group[i] != null) {
                tempGroup[k] = group[i];
                k++;
            }
        }

        for (int i = 0; i < tempGroup.length; i++) {
            for (int j = 0; j < tempGroup.length - 1 - i; j++) {
                if (tempGroup[j].getSurname().compareTo(tempGroup[j + 1].getSurname()) > 0) {
                    Student temp = tempGroup[j];
                    tempGroup[j] = tempGroup[j + 1];
                    tempGroup[j + 1] = temp;
                }
            }
        }
        return Arrays.toString(tempGroup);
    }

    public String toString1() {
        return Arrays.toString(group);
    }

    public void addStudentByScanner(Scanner scanner) {
        Integer age = null;
        String name = null;
        String surname = null;

        do {
            try {
                System.out.println("enter age");
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
            }
        }
        while (age == null);
        do {
            System.out.println("enter name");
            name = scanner.nextLine();
        }
        while (name == null || name.trim().equals(""));
        do {
            System.out.println("enter surname");
            surname = scanner.nextLine();
        }
        while (surname == null || surname.trim().equals(""));
        Student student = new Student(name, surname, age);
        this.addStudent(student);
    }

    @Override
    public ArrayList isDraftees() {
        ArrayList newArray = new ArrayList<Student>();
        for (int i = 0; i < GROUP_MAX_SIZE; i++) {
            if (group[i] != null && group[i].getAge() > 18 ){
                newArray.add(group[i]);

            }
        }
        return newArray;
    }
}

