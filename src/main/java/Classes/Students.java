package Classes;

import java.util.ArrayList;

public class Students extends People {
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

    public ArrayList<Student> classroom;

    private Students() {
        classroom = new ArrayList<Student>();
        classroom.add(jorge);
        classroom.add(kelly);
        classroom.add(ryan);
        classroom.add(lena);
        classroom.add(monali);
        classroom.add(greg);
        classroom.add(hazel);
        classroom.add(chris);
        classroom.add(mike);
        classroom.add(abe);
        classroom.add(xiong);
        classroom.add(ashley);
        classroom.add(justin);
        classroom.add(theresa);
    }

    public static Students getInstance() {
        return students_instance;
    }

}
