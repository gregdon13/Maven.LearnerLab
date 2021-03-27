package io.zipcoder.interfaces;

import Classes.Student;
import Classes.Students;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    @Test
    public void studentsTest() {
        //Given
        Students classroom = Students.getInstance();

        //When
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().jorge));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().kelly));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().ryan));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().lena));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().monali));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().greg));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().hazel));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().chris));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().mike));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().abe));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().xiong));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().ashley));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().justin));
        Assert.assertTrue(classroom.classroom.contains(Students.getInstance().theresa));
    }
}
