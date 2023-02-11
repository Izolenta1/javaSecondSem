package prac2;

import java.time.LocalDate;

public class Human {
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public void print() {
        System.out.println("Human: "
                + this.firstName + " "
                + this.lastName + " age: "
                + this.age + " вес: "
                + this.weight + " дата рождения: "
                + this.birthDate);
    }

    public void gainWeight() {
        this.weight += 3;
    }

    public int getWeight() {
        return this.weight;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }
}
