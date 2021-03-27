package io.zipcoder.interfaces;

import Classes.Instructor;
import Classes.Student;
import Classes.Students;
import Classes.ZipCodeWilmington;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class ZCWTests {
    ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
    Students students = Students.getInstance();

    @Test
    public void studyHoursOfStudents() {
        //Given
        Instructor nobles = new Instructor(100, "Nobles");
        Double expected = 1.0;

        //When
        zcw.hostLecture(nobles, 14);
        HashMap hoursMap = zcw.getStudyMap();
        Double actual = (Double) hoursMap.get(students.greg);

        //Then
        Assert.assertEquals(expected, actual);
    }
}
