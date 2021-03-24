package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation() {
        //Given
        Student student = new Student(123, "Leon");

        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //Given
        Student student = new Student(123, "Leon");

        //Then
        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn() {
        //Given
        Student student = new Student(654, "Steve");
        Double expected = 20.0;

        //When
        student.learn(20);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
