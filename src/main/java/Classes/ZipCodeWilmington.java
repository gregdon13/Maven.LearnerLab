package Classes;

import io.zipcoder.interfaces.Teacher;
import java.util.HashMap;


public class ZipCodeWilmington {
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    final static ZipCodeWilmington zcw_instance = new ZipCodeWilmington();

    private ZipCodeWilmington() {}

    public static ZipCodeWilmington getInstance() {
        return zcw_instance;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.classroom, numberOfHours);
    }

    public HashMap getStudyMap() {
        HashMap<Student, Double> studentHours = new HashMap<Student, Double>();
        for (Student student : students.classroom) {
            studentHours.put(student, student.getTotalStudyTime());
        }
        return studentHours;
    }
}
