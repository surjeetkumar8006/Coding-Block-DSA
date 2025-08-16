package Lec19;

public class Student {

    String name;
    int age;
    String village;

    public Student(String name, int age, String village) {
        this.name = name;
        this.age = age;
        this.village = village;

    }

    public void Intro_Yourself() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public void Intro_my() {

        System.out.println("My name is " + name + " and I am " + age + " years old." + "Village is " + village);
    }
}
