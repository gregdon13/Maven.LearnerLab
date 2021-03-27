package Classes;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

import java.util.ArrayList;

public class Instructors extends People<Person>{
    public Instructor villain = new Instructor(666, "Nobles");
    public Instructor masterMind = new Instructor(1001, "Younger");
    public Instructor windu = new Instructor(314, "Dolio");
    public Instructor helper = new Instructor(13, "Dan Stabb");

    final static Instructors instructors_instance = new Instructors();

public ArrayList<Instructor> teacherLounge;

    private Instructors() {
        teacherLounge = new ArrayList<Instructor>();
        teacherLounge.add(Educator.VILLAIN.getInstructor());
        teacherLounge.add(Educator.MASTERMIND.getInstructor());
        teacherLounge.add(Educator.WINDU.getInstructor());
        teacherLounge.add(Educator.HELPER.getInstructor());
    }

    public static Instructors getInstance() {
        return instructors_instance;
    }

    public Person[] toArray() {
        Instructor[] instructorArr = new Instructor[4];
        for (int i = 0; i < teacherLounge.size(); i++) {
            instructorArr[i] = teacherLounge.get(i);
        }
        return instructorArr;
    }

}
