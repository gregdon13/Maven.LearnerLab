package Classes;

import java.util.ArrayList;

public class Students extends People<Student> {
    public Student jorge = new Student(100, "Jorge");
    public Student kelly = new Student(200, "Kelly");
    public Student ryan = new Student(300, "Ryan");
    public Student lena = new Student(400, "Lena");
    public Student monali = new Student(500, "Monali");
    public Student greg = new Student(600, "Greg");
    public Student hazel = new Student(700, "Hazel");
    public Student chris = new Student(800, "Chris");
    public Student mike = new Student(900, "Mike");
    public Student abe = new Student(1000, "Abe");
    public Student xiong = new Student(1100, "Xiong");
    public Student ashley = new Student(1200, "Ashley");
    public Student justin = new Student(1300, "Justin");
    public Student theresa = new Student(1400, "Theresa");

    final static Students students_instance = new Students();

    public Student[] classroom;

    private Students() {
        classroom = new Student[14];
        classroom[0] = jorge;
        classroom[1] = kelly;
        classroom[2] = ryan;
        classroom[3] = lena;
        classroom[4] = monali;
        classroom[5] = greg;
        classroom[6] = hazel;
        classroom[7] = chris;
        classroom[8] = mike;
        classroom[9] = abe;
        classroom[10] = xiong;
        classroom[11] = ashley;
        classroom[12] = justin;
        classroom[13] = theresa;
    }

    public static Students getInstance() {
        return students_instance;
    }

    public Person[] toArray() {
        return classroom;
    }
}
