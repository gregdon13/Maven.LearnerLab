package Classes;

import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Teacher;

public enum Educator implements Teacher{
    VILLAIN,
    WINDU,
    MASTERMIND,
    HELPER;


    public void teach(Learner learner, double numberOfHours) {

    }

    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
