package lesson2;

public class Student extends Human implements Comparable {
    public Student(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", student";
    }

    @Override
    public int compareTo(Object o) {
        if (o == null && this == null) {
            return 0;
        }
        if (o == null) {
            return -1;
        }
        if (this == null) {
            return 1;
        }
        Student student = (Student) o;
        return this.getSurname().compareToIgnoreCase(student.getSurname());
    }

}