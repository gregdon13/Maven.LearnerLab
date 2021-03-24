package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    long id = 6845;
    String name = "Tony";

    @Test
    public void testImplementation() {
        //Given
        Instructor instructor = new Instructor(id, name);

        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        Instructor instructor = new Instructor(id, name);

        //Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(id, name);
        Student student = new Student(852, "Kat");
        Double expected = 20.0;

        //When
        instructor.teach(student, 20.0);
        Double actual = student.getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLecture() {
        //Given
        Instructor instructor = new Instructor(id, name);
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
