// create a class for every single student
class Student {
    int rno;
    String name;
    float marks;
}

public class Intro {
    public static void main(String[] args) {

        // using class
        Student[] students = new Student[3];

        // using object
        Student muskan = new Student();
        muskan.rno = 1;
        muskan.name = "Muskan";
        muskan.marks = 90.0f;

        System.out.println(muskan.rno);
        System.out.println(muskan.name);
        System.out.println(muskan.marks);

    }
}