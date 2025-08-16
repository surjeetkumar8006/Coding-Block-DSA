package Lec19;

public class Students {

    public static void main(String[] args) {
        Student s = new Student("Surjeet", 22, "nagal karan");
        s.Intro_Yourself();
        s.Intro_my();
    }

    static {
        System.out.println("hello i am static block");
    }

}
