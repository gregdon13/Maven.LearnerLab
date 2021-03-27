package Classes;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner l : learners) {
            l.learn(numberOfHours / learners.length);
        }
    }
}
