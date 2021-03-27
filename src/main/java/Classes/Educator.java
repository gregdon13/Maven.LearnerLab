package Classes;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher{
    VILLAIN(666, "Nobles"),
    WINDU(314, "Dolio"),
    MASTERMIND(1001, "Younger"),
    HELPER(13, "Dan Stabb");

    Educator(long id, String name) {

    }

    private Instructor instructor;

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        for (Learner l : learners) {
            l.learn(numberOfHours / learners.length);
        }
    }

    public void convert(Educator educator) {
        System.out.println(educator.name());
        this.instructor = instructor;
    }

    public Instructor getInstructor() {
        return instructor;
    }

}
