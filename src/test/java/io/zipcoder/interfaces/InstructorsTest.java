package io.zipcoder.interfaces;

import Classes.Educator;
import Classes.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void instructorsContains() {
        //Given
        Instructors instructors = Instructors.getInstance();



        //Then
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.HELPER.getInstructor()));
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.MASTERMIND.getInstructor()));
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.WINDU.getInstructor()));
        Assert.assertTrue(instructors.teacherLounge.contains(Educator.VILLAIN.getInstructor()));

    }
}
