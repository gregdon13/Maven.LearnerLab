package Classes;

import io.zipcoder.interfaces.Learner;

public class Student extends Person implements Learner {
    double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
