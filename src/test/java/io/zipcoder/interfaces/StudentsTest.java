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
        Assert.assertTrue(classroom.classroom[0] == Students.getInstance().jorge);
        Assert.assertTrue(classroom.classroom[1] == Students.getInstance().kelly);
        Assert.assertTrue(classroom.classroom[2] ==Students.getInstance().ryan);
        Assert.assertTrue(classroom.classroom[3] == Students.getInstance().lena);
        Assert.assertTrue(classroom.classroom[4] == Students.getInstance().monali);
        Assert.assertTrue(classroom.classroom[5] == Students.getInstance().greg);
        Assert.assertTrue(classroom.classroom[6] == Students.getInstance().hazel);
        Assert.assertTrue(classroom.classroom[7] == Students.getInstance().chris);
        Assert.assertTrue(classroom.classroom[8] == Students.getInstance().mike);
        Assert.assertTrue(classroom.classroom[9] == Students.getInstance().abe);
        Assert.assertTrue(classroom.classroom[10] == Students.getInstance().xiong);
        Assert.assertTrue(classroom.classroom[11] == Students.getInstance().ashley);
        Assert.assertTrue(classroom.classroom[12] == Students.getInstance().justin);
        Assert.assertTrue(classroom.classroom[13] == Students.getInstance().theresa);
    }
}
