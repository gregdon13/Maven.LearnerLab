package io.zipcoder.interfaces;

import Classes.Educator;
import Classes.Instructor;
import Classes.Student;
import org.junit.Assert;
import org.junit.Test;

public class EducatorTest {


    @Test
    public void implementation() {
        Assert.assertTrue(Educator.VILLAIN instanceof Teacher);
        Assert.assertTrue(Educator.HELPER instanceof Teacher);
        Assert.assertTrue(Educator.MASTERMIND instanceof Teacher);
        Assert.assertTrue(Educator.WINDU instanceof Teacher);
    }

    @Test
    public void teachTest() {
        //Given
        Educator instructor = Educator.VILLAIN;

        Student student = new Student(951, "Howler");
        Double expected = 15.0;

        //When
        instructor.teach(student, 15.0);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lectureTest() {
        //Given
        Educator instructor = Educator.WINDU;
        Student studentOne = new Student(123, "Bruce");
        Student studentTwo = new Student(456, "Wanda");
        Student studentThree = new Student(789, "Natasha");
        Student[] students = new Student[3];
        students[0] = studentOne;
        students[1] = studentTwo;
        students[2] = studentThree;
        Double expected = 2.0;

        //When
        instructor.lecture(students, 6);
        Double actual = studentOne.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
