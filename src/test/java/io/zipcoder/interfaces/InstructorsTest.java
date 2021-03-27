package io.zipcoder.interfaces;

import Classes.Instructors;
import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest {

    @Test
    public void instructorsContains() {
        //Given
        Instructors instructors = Instructors.getInstance();

        //Then
        Assert.assertTrue(instructors.teacherLounge.contains(instructors.villain));
        Assert.assertTrue(instructors.teacherLounge.contains(instructors.masterMind));
        Assert.assertTrue(instructors.teacherLounge.contains(instructors.windu));
        Assert.assertTrue(instructors.teacherLounge.contains(instructors.helper));

    }
}
