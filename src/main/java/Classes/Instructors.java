package Classes;

import java.util.ArrayList;

public class Instructors extends People{
    public Instructor villain = new Instructor(666, "Nobles");
    public Instructor masterMind = new Instructor(1001, "Younger");
    public Instructor windu = new Instructor(314, "Dolio");
    public Instructor helper = new Instructor(13, "Dan Stabb");

    final static Instructors instructors_instance = new Instructors();

    public ArrayList<Instructor> teacherLounge;

    private Instructors() {
        teacherLounge = new ArrayList<Instructor>();
        teacherLounge.add(villain);
        teacherLounge.add(masterMind);
        teacherLounge.add(windu);
        teacherLounge.add(helper);
    }

    public static Instructors getInstance() {
        return instructors_instance;
    }
}
