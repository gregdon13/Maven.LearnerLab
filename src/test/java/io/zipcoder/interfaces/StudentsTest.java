package io.zipcoder.interfaces;

import Classes.Student;
import Classes.Students;
import org.junit.Assert;
import org.junit.Test;

public class StudentsTest {

    Student kelly = new Student(100, "Kelly");

    @Test
    public void studentsTest() {
        //Given
        Students classroom = Students.getInstance();

        //When
        Assert.assertTrue(classroom.contains(kelly));
    }
}
