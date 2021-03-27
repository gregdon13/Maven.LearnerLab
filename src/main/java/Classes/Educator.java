package Classes;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher{
    VILLAIN(new Instructor(666, "Nobles")),
    WINDU(new Instructor(314, "Dolio")),
    MASTERMIND(new Instructor(1001, "Younger")),
    HELPER(new Instructor(13, "Dan Stabb"));

//    Educator(long id, String name) {
//
//    }

    private Instructor instructor;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner l : learners) {
            l.learn(numberOfHours / learners.length);
        }
    }

//    public void convert(Educator educator) {
//        this.instructor =
//    }

    public Instructor getInstructor() {
        return instructor;
    }

}
