package lesson2;

public class Human {
    private String name;
    private String surname;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getInfo() {
        return name + " " + surname + ", " + age + " years";
    }

    @Override
    public String toString() {
        return
                 name +  " " + surname ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
